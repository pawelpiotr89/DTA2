
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;



/**
 *
 * @author Roxven
 */
public class RadiantPostac3 extends JButton{
    
    static URL imgRadiantPostac3 = RadiantPostac3.class.getResource("radiantPostac3.png");
    
    static ImageIcon rP3  = new ImageIcon(imgRadiantPostac3);
    
    static boolean radiantPostacC;
    static String radiantNazwa3;
    
    public void tworzenieRadiantPostac3(){
        
     radiantPostacC = false; 
     radiantNazwa3 = "";
       
     setBorder(null);
     setIcon(rP3);
     setEnabled(false);
     setDisabledIcon(rP3);
     setOpaque(true);
     setBackground(new Color(76, 153, 0));
     setToolTipText("Radiant 3rd Hero");
     
    }
}
