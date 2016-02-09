
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
/**
 *
 * @author Roxven
 */
public class ListwaInt extends JButton {
    
    static URL imgListwaInt = ListwaInt.class.getResource("int.png");
    
   ImageIcon iconINT  = new ImageIcon(imgListwaInt);

   public void tworzenieListwaInt(){
        
        setOpaque(true);
        setBackground(Color.white);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(45, 60));
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setIcon(iconINT);
    }
}
