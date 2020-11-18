
import javax.swing.Icon;
import javax.swing.JButton;

/*This class is used to view a custom JList cell. It has a used display picture and their name */

public class ImgsNText {
      private String name;
      private Icon img;
      JButton b = new JButton("Add Friend");
      
      public ImgsNText(String name,Icon img){
          this.name = name;
          this.img = img;
      }
      public ImgsNText(){
      };
      
     public String getName(){
         return name;
     } 
     
     public Icon getImg(){
         return img;
     } 
      
     public void setName(String name){
         this.name = name;
     } 
     
     public void getImg(Icon img){
         this.img = img;
     } 
}
