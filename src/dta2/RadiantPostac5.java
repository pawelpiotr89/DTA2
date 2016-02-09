
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Roxven
 */
public class RadiantPostac5 extends JButton{
    
    static URL imgRadiantPostac5 = RadiantPostac5.class.getResource("radiantPostac5.png");
    
    static ImageIcon rP5  = new ImageIcon(imgRadiantPostac5);
    
    static boolean radiantPostacE;
    static String radiantNazwa5;
    
    public void tworzenieRadiantPostac5(){
        
     radiantPostacE = false;
     radiantNazwa5 = "";
       
     setBorder(null);
     setIcon(rP5);
     setEnabled(false);
     setDisabledIcon(rP5);
     setOpaque(true);
     setBackground(new Color(76, 153, 0));
     setToolTipText("Radiant 5th Hero");
     
    }
}