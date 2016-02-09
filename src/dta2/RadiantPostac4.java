
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Roxven
 */
public class RadiantPostac4 extends JButton{
    
    static URL imgRadiantPostac4 = RadiantPostac4.class.getResource("radiantPostac4.png");
    
    static ImageIcon rP4  = new ImageIcon(imgRadiantPostac4);
    
    static boolean radiantPostacD;
    static String radiantNazwa4;
    
    public void tworzenieRadiantPostac4(){
        
     radiantPostacD = false;
     radiantNazwa4 = "";
       
     setBorder(null);
     setIcon(rP4);
     setEnabled(false);
     setDisabledIcon(rP4);
     setOpaque(true);
     setBackground(new Color(76, 153, 0));
     setToolTipText("Radiant 4th Hero");
     
    }
}