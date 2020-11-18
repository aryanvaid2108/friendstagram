
import java.util.regex.Pattern;
import java.util.*;


public class ValidationFunctions {
    private String error;
    
    private String validateUsername(String username){
        if(username.length()<5){
            error = "* Username must be alteast 5 characters long!";
            return error;
        } 
        if(!username.matches("^[a-zA-Z0-9._-]{5,}$")){
            error = "* Only a-z, A-Z, 0-9 are allowed in Usernames!";
            return error;
        }
        return "No error";
    }
    
    public String validatePassword(String password, String rePassword){
        if(!password.equals(rePassword)){
            error = "* Both the passwords must be the same";
            return error;
        }
        
        if(password.length()<6){
            error = "* Password must be alteast 6 characters long!";
            return error;
        } 
        if(!password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$")){
            error = "* Password must contain a-z, A-Z, 0-9, @#$%^&+=!";
            return error;
        }
        return "No error";
    }
    
    private String validateEmail(String email){
         final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);

        if(!EMAIL_REGEX.matcher(email).matches()){
            error = "* Invalid email address format!";
            return error;
        }

        return "No error";
    }
    
    public String checkPossibleCredentials(String username, String password, String rePassword, String email){
        
        if(!validateUsername(username).equals("No error")){
            return validateUsername(username);
        }
        if(!validatePassword(password,rePassword).equals("No error")){
            return validatePassword(password,rePassword);
        }
        if(!validateEmail(email).equals("No error")){
            return validateEmail(email);
        }
        return "No error";
    }
}
