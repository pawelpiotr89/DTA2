
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
/**
 *
 * @author Roxven
 */
public class BestToAvoidListwa extends JButton {
    
    static URL imgBTAL = BestToAvoidListwa.class.getResource("besttoavoid.png");
   
    ImageIcon iconBTA  = new ImageIcon(imgBTAL);
   
    public void tworzenieBestToAvoidListwa(){
        
        setOpaque(true);
        setBackground(Color.white);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(45, 240));
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setIcon(iconBTA);
        
    }
}

