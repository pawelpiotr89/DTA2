
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class WinterWyvern extends PrzyciskBohatera{
    
    static URL imgWinterWyvern = WinterWyvern.class.getResource("winterwyvern.png");
   static URL imgWinterWyvern2 = WinterWyvern.class.getResource("winterwyvern2.png");
    
   static ImageIcon icon111 = new ImageIcon(imgWinterWyvern);
   
    static boolean radiantWinterWyvern;
    static boolean direWinterWyvern;
    static String nazwaWinterWyvern;
   
    public void tworzenieWinterWyvern(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Winter Wyvern");
        setBackground(new Color(0, 102, 204));
        setIcon(icon111);
        setRolloverIcon(new ImageIcon(imgWinterWyvern2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantWinterWyvern = false;
        direWinterWyvern = false;
        nazwaWinterWyvern = "Winter Wyvern";
            
    }
}
