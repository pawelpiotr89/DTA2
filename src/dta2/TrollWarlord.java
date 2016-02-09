
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class TrollWarlord extends PrzyciskBohatera{
    
    static URL imgTrollWarlord = TrollWarlord.class.getResource("trollwarlord.png");
   static URL imgTrollWarlord2 = TrollWarlord.class.getResource("trollwarlord2.png");
    
   static ImageIcon icon53 = new ImageIcon(imgTrollWarlord);
   
    static boolean radiantTrollWarlord;
    static boolean direTrollWarlord;
    static String nazwaTrollWarlord;
   
    public void tworzenieTrollWarlord(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Troll Warlord");
        setBackground(new Color(76, 153, 0));
        setIcon(icon53);
        setRolloverIcon(new ImageIcon(imgTrollWarlord2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTrollWarlord = false;
        direTrollWarlord = false;
        nazwaTrollWarlord = "Troll Warlord";
            
    }
}
