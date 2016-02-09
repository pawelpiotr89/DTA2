
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Roxven
 */
public class RadiantPostac1 extends JButton {
    
    static URL imgRadiantPostac1 = RadiantPostac1.class.getResource("radiantPostac1.png");
    
    static ImageIcon rP1  = new ImageIcon(imgRadiantPostac1);
    
    static boolean radiantPostacA;
    static String radiantNazwa1;
    
    
    public void tworzenieRadiantPostac1(){
        
     radiantPostacA = false;
     radiantNazwa1 = "";
       
     setBorder(null);
     setIcon(rP1);
     setEnabled(false);
     setDisabledIcon(rP1);
     setOpaque(true);
     setBackground(new Color(76, 153, 0));
     setToolTipText("Radiant 1st Hero");
     
    }
    
}
