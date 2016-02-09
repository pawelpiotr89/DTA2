
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
/**
 *
 * @author Roxven
 */
public class ListwaAgi extends JButton {
    
    static URL imgListwaAgi = ListwaAgi.class.getResource("agi.png");
    
   ImageIcon iconAGI  = new ImageIcon(imgListwaAgi);

   public void tworzenieListwaAgi(){
        
        setOpaque(true);
        setBackground(Color.white);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(45, 60));
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setIcon(iconAGI);
    }
}