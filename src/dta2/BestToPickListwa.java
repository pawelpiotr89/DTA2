
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
/**
 *
 * @author Roxven
 */
public class BestToPickListwa extends JButton {
   
   static URL imgBTP = BestToPickListwa.class.getResource("besttopick.png");
   
   ImageIcon iconBTP  = new ImageIcon(imgBTP);
    
    public void tworzenieBestToPickListwa(){
        
        setOpaque(true);
        setBackground(Color.white);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(45, 240));
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setIcon(iconBTP);
    }
}