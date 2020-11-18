import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Database {
    File file = new File("database.txt");
    
    public void setValues(ArrayList<User> usersList)  throws FileNotFoundException{
//        ArrayList<String> existingUserData = new ArrayList<>();
        ArrayList<String> existingUserData = new ArrayList<>();
        read(existingUserData);
        for(String ele:existingUserData){
               System.out.println(ele);      
        }
        for(int i=0;i<existingUserData.size();i++){
            String[] values = existingUserData.get(i).split(";");
            User user = new User();
            user.setUsername(values[0]);
            user.setPassword(values[1]);
            user.setFirstName(values[2]);
            user.setLastName(values[3]);
            user.setEmail(values[4]);
            user.setPhoneNumber(values[5]);
            user.setGender(values[6]);
            user.setMonth(values[7]);
            user.setDay(values[8]);
            user.setYear(values[9]);
            user.setStatus(values[10]);
            user.setProfilePicturePath(values[11]);
            user.addFriendString(values[12]);
            usersList.add(user);
        }
            for(User user:usersList){
                System.out.print(user.getUsername() + "Here =>");
                String friendList = user.getFriendString();
                String[] friends = friendList.split(" ");
                for(String ele: friends){
                    user.addFriend(returnUser(ele,usersList));
                 }
            }  
        }        
   
    public User returnUser(String username,ArrayList<User> userList){
        for(User user:userList){
            if(user.getUsername().equals(username))
                return user;
        }
        return null;
    }
    
    public void writeToDatabase(User user) throws FileNotFoundException, IOException{
        ArrayList<String> existingUserData = new ArrayList<>();
        ArrayList<String> newUserData = new ArrayList<>();
        String newData="";
        newUserData.add(user.getUsername()+";");
        newUserData.add(user.getPassword()+";");
        newUserData.add(user.getFirstName()+";");
        newUserData.add(user.getLastName()+";"); 
        newUserData.add(user.getEmail()+";");      
        newUserData.add(user.getPhoneNumber()+";");
        newUserData.add(user.getGender()+";");
        newUserData.add(user.getMonth()+";");
        newUserData.add(user.getDay()+";");
        newUserData.add(user.getYear()+";");
        newUserData.add(user.getStatus()+";");
        newUserData.add(user.getProfilePicturePath()+";");
        for(User friend: user.getFriends()){
            newUserData.add(friend.getUsername()+" ");
        }
        newUserData.add(";");
        for(String ele:newUserData){
            newData+=ele;
        }
     
        if(file.length() == 0){
            write(newUserData);
        }else{
            read(existingUserData);
            update(existingUserData,user,newData,newUserData);
        }
    }
    
    private void write(ArrayList<String> userData) throws IOException{
        FileWriter fileWriter = new FileWriter("database.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);
        try{
            for(int i=0;i<userData.size();i++){
                System.out.print(i);
                writer.write(userData.get(i));
                if(i==userData.size()-1)
                    break;
                else
                    writer.newLine();
            }
            
        }catch(IOException e){
            e.getStackTrace();
        }
        writer.newLine();
        writer.close();
    }
    
    private void append(ArrayList<String> userData) throws IOException{
        FileWriter fileWriter = new FileWriter("database.txt",true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        try{
            for(String x:userData){
                writer.write(x);
            }
        }catch(IOException e){
            e.getStackTrace();
        }
        writer.close();
    }
    
    private void update(ArrayList<String> existingUserData,User user,String newData,ArrayList<String> newUserData) throws IOException{
        int flag=0;
        for(int i=0;i<existingUserData.size();i++){
            String[] words = existingUserData.get(i).split(";");
            if(words[0].equals(user.getUsername())){
                existingUserData.set(i,newData);
                write(existingUserData);
                flag=1;
                break;
            }
        }
        if(flag==0){
//           existingUserData.set(existingUserData.size()-1,newData);
           append(newUserData);
        }    
    }
    
    private void read(ArrayList<String> existingUserData) throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader("database.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line="";
            while((line = reader.readLine())!=null){
                existingUserData.add(line);
            }
            reader.close();
        }catch(IOException e){
            e.getStackTrace();
        }  
    }
}   
