
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Roxven
 */
public class RadiantPostac2 extends JButton{
    
    static URL imgRadiantPostac2 = RadiantPostac2.class.getResource("radiantPostac2.png");
    
    static ImageIcon rP2  = new ImageIcon(imgRadiantPostac2);
    
    static boolean radiantPostacB;
    static String radiantNazwa2;
    
    public void tworzenieRadiantPostac2(){
        
     radiantPostacB = false;
     radiantNazwa2 = "";
       
     setBorder(null);
     setIcon(rP2);
     setEnabled(false);
     setDisabledIcon(rP2);
     setOpaque(true);
     setBackground(new Color(76, 153, 0));
     setToolTipText("Radiant 2nd Hero");
     
    }
}
