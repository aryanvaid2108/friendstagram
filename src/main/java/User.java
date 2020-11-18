import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.Icon;

/* The class for the user object and all of its parameters and user information*/

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String gender;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String status; 
    private String friendString;
    private String profilePicturePath; 
    private ArrayList<User> friendProfiles = new ArrayList<>();
    private Icon profilePicture;
                
    // Constructors
    public User(String username,String password, String email ){
        setUsername(username);
        setPassword(password);
        setEmail(email);
    }
    public User(){     
    }

    // Username and Password helper functions
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
       return username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
    // Name helper functions
    public void setFirstName(String firstName){
        this.firstName = firstName;
    } 
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
       return firstName;
    }
    public String getLastName(){
       return lastName;
    }
    //Email and Phone number helper function
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
     public String getPhoneNumber(){
        return phoneNumber;
    }
    
     
    // Date of birth helper functions
    public void setMonth(String month){
        this.birthMonth = month;
    }
    public void setDay(String day){
        this.birthDay = day;
    }
    public void setYear(String year){
        this.birthYear = year;
    }
    public String getMonth(){
        return birthMonth;
    }
    public String getDay(){
        return birthDay;           
    }
    public String getYear(){
        return birthYear;
    }
    
   
    // Status and gender helper functions
    public void setStatus(String status){
        this.status = status;
    }  
    public String getStatus(){
        return status;
    } 
    public void setGender(String gender){
        this.gender = gender;
    } 
    public String getGender(){
        return gender;
    }
    // Friends list helper functions
    public void addFriend(User friend){
       friendProfiles.add(friend);
    }
    public void addFriendString(String friend){
       friendString = friend;
    }
    public String getFriendString(){
       return friendString;
    }
    public void removeFriend(User friend){
       friendProfiles.remove(friend);
    }
    public ArrayList<User> getFriends(){
       return friendProfiles;
    }
    // Profile picture helper functions
    public void setProfilePicture(Icon image){
        profilePicture = image;
    }
    public Icon getProfilePicture(){
        return profilePicture;
    } 
    public void setProfilePicturePath(String profilePicturePath){
        this.profilePicturePath=profilePicturePath;
    } 
    public String getProfilePicturePath(){
        return profilePicturePath;
    } 
    public int getNumberOfFriends(){
        if(friendProfiles.isEmpty())
            return 0;
        else
            return friendProfiles.size();
    } 
    
}
