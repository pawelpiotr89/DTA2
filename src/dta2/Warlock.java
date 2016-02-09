
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Warlock extends PrzyciskBohatera{
    
    static URL imgWarlock = Warlock.class.getResource("warlock.png");
   static URL imgWarlock2 = Warlock.class.getResource("warlock2.png");
    
   static ImageIcon icon98 = new ImageIcon(imgWarlock);
   
    static boolean radiantWarlock;
    static boolean direWarlock;
    static String nazwaWarlock;
   
    public void tworzenieWarlock(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Warlock");
        setBackground(new Color(0, 102, 204));
        setIcon(icon98);
        setRolloverIcon(new ImageIcon(imgWarlock2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantWarlock = false;
        direWarlock = false;
        nazwaWarlock = "Warlock";
            
    }
}
