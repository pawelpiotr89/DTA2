
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class StormSpirit extends PrzyciskBohatera{
    
    static URL imgStormSpirit = StormSpirit.class.getResource("stormspirit.png");
   static URL imgStormSpirit2 = StormSpirit.class.getResource("stormspirit2.png");
    
   static ImageIcon icon73 = new ImageIcon(imgStormSpirit);
   
    static boolean radiantStormSpirit;
    static boolean direStormSpirit;
    static String nazwaStormSpirit;
   
    public void tworzenieStormSpirit(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Storm Spirit");
        setBackground(new Color(0, 102, 204));
        setIcon(icon73);
        setRolloverIcon(new ImageIcon(imgStormSpirit2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantStormSpirit = false;
        direStormSpirit = false;
        nazwaStormSpirit = "Storm Spirit";
            
    }
}
