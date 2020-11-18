import java.util.*;
import java.awt.image.BufferedImage;

public class ProfileManager {
    
    private Graph allProfiles = new Graph();
    public ArrayList<User> profilesList = new ArrayList<>(); 
    public ProfileManager(){
	allProfiles = new Graph();
    } 
    
    //Add a profile to the network
    public void addProfile(User newUser){
        profilesList.add(newUser);
	allProfiles.addVertex(newUser);
    }
    
    //Add friends
    public void createFriendship(User a, User b){
        allProfiles.addEdge(a,b);
        allProfiles.addEdge(b,a);
        a.addFriend(b);
        b.addFriend(a);
    }
      
}
