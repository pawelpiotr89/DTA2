
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class ListwaStr extends JButton {
    
    static URL imgListwaStr = ListwaStr.class.getResource("str.png");
    
   ImageIcon iconSTR  = new ImageIcon(imgListwaStr);

   public void tworzenieListwaStr(){
        
        setOpaque(true);
        setBackground(Color.white);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(45, 60));
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setIcon(iconSTR);
    }
}