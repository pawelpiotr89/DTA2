
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class LoneDruid extends PrzyciskBohatera{
    
    static URL imgLoneDruid = LoneDruid.class.getResource("lonedruid.png");
   static URL imgLoneDruid2 = LoneDruid.class.getResource("lonedruid2.png");
    
   static ImageIcon icon51 = new ImageIcon(imgLoneDruid);
   
    static boolean radiantLoneDruid;
    static boolean direLoneDruid;
    static String nazwaLoneDruid;
   
    public void tworzenieLoneDruid(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Lone Druid");
        setBackground(new Color(76, 153, 0));
        setIcon(icon51);
        setRolloverIcon(new ImageIcon(imgLoneDruid2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLoneDruid = false;
        direLoneDruid = false;
        nazwaLoneDruid = "Lone Druid";
            
    }
}