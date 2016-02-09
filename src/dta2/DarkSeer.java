
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class DarkSeer extends PrzyciskBohatera{
    
     static URL imgDarkSeer = DarkSeer.class.getResource("darkseer.png");
   static URL imgDarkSeer2 = DarkSeer.class.getResource("darkseer2.png");
    
   static ImageIcon icon104  = new ImageIcon(imgDarkSeer);
   
    static boolean radiantDarkSeer;
    static boolean direDarkSeer;
    static String nazwaDarkSeer;
   
    public void tworzenieDarkSeer(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Dark Seer");
        setBackground(new Color(0, 102, 204));
        setIcon(icon104);
        setRolloverIcon(new ImageIcon(imgDarkSeer2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantDarkSeer = false;
        direDarkSeer = false;
        nazwaDarkSeer = "Dark Seer";
            
    }
}