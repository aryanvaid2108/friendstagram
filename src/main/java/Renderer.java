import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


/*This class is used to view a custom JList cell. Renderer has to be implemented */

public class Renderer extends DefaultListCellRenderer implements ListCellRenderer<Object> {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value,int index,boolean isSelected,boolean cellHasFocus){
//        return super.getListCellRendererComponent(list,value,index,isSelected,cellHasFocus);
        
        ImgsNText is = (ImgsNText) value;
        setText(is.getName());
        setIcon(is.getImg());
        
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }else{
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        
        setEnabled(true);
        setFont(list.getFont());
      return this;
    }
}
