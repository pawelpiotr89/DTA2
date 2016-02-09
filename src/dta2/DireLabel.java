package dta2;

import java.net.URL;
import javax.swing.*;

/**
 *
 * @author Roxven
 */
public class DireLabel extends JButton{
    
     static URL imgIconD = DireLabel.class.getResource("direlabel2.png");
     static URL imgIconD5 = DireLabel.class.getResource("direlabel5.png");
    
    ImageIcon iconD  = new ImageIcon(imgIconD);
    ImageIcon iconD5  = new ImageIcon(imgIconD5);
    
    public void tworzenieDireLabel(){
        
        setOpaque(false);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setToolTipText("Pick as your team");
        setIcon(iconD);
        setDisabledIcon(iconD5);
        
    }
}
