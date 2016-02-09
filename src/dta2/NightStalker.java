
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class NightStalker extends PrzyciskBohatera{
    
    static URL imgNightStalker = NightStalker.class.getResource("nightstalker.png");
   static URL imgNightStalker2 = NightStalker.class.getResource("nightstalker2.png");
    
   static ImageIcon icon29 = new ImageIcon(imgNightStalker);
   
    static boolean radiantNightStalker;
    static boolean direNightStalker;
    static String nazwaNightStalker;
   
    public void tworzenieNightStalker(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Night Stalker");
        setBackground(new Color(153, 0, 0));
        setIcon(icon29);
        setRolloverIcon(new ImageIcon(imgNightStalker2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantNightStalker = false;
        direNightStalker = false;
        nazwaNightStalker = "Night Stalker";    
    }
}