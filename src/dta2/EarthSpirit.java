
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class EarthSpirit extends PrzyciskBohatera{

    static URL imgEarthSpirit = EarthSpirit.class.getResource("earthspirit.png");
   static URL imgEarthSpirit2 = EarthSpirit.class.getResource("earthspirit2.png");
    
   static ImageIcon icon20  = new ImageIcon(imgEarthSpirit);
   
    static boolean radiantEarthSpirit;
    static boolean direEarthSpirit;
    static String nazwaEarthSpirit;
   
    public void tworzenieEarthSpirit(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Earth Spirit");
        setBackground(new Color(153, 0, 0));
        setIcon(icon20);
        setRolloverIcon(new ImageIcon(imgEarthSpirit2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantEarthSpirit = false;
        direEarthSpirit = false;
        nazwaEarthSpirit = "EarthSpirit";    
    }
}