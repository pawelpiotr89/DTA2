
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Silencer extends PrzyciskBohatera{
    
    static URL imgSilencer = Silencer.class.getResource("silencer.png");
   static URL imgSilencer2 = Silencer.class.getResource("silencer2.png");
    
   static ImageIcon icon84 = new ImageIcon(imgSilencer);
   
    static boolean radiantSilencer;
    static boolean direSilencer;
    static String nazwaSilencer;
   
    public void tworzenieSilencer(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Silencer");
        setBackground(new Color(0, 102, 204));
        setIcon(icon84);
        setRolloverIcon(new ImageIcon(imgSilencer2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSilencer = false;
        direSilencer = false;
        nazwaSilencer = "Silencer";
            
    }
}
