package dta2;


import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class RadiantLabel extends JButton{
    
    static URL imgRadiantLabelR = RadiantLabel.class.getResource("radiantlabel2.png");
    static URL imgRadiantLabelR5 = RadiantLabel.class.getResource("radiantlabel5.png");
    
    ImageIcon iconR  = new ImageIcon(imgRadiantLabelR);
    ImageIcon iconR5  = new ImageIcon(imgRadiantLabelR5);
    
    
    public void tworzenieRadiantLabel(){
        
        setOpaque(false);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(true);
        setFocusPainted(false);
        setToolTipText("Pick as your team");
        setIcon(iconR);
        setDisabledIcon(iconR5);
          
    }
}