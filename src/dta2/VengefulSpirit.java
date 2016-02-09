
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class VengefulSpirit extends PrzyciskBohatera{
    
    static URL imgVengefulSpirit = VengefulSpirit.class.getResource("vengefulspirit.png");
   static URL imgVengefulSpirit2 = VengefulSpirit.class.getResource("vengefulspirit2.png");
    
   static ImageIcon icon43 = new ImageIcon(imgVengefulSpirit);
   
    static boolean radiantVengefulSpirit;
    static boolean direVengefulSpirit;
    static String nazwaVengefulSpirit;
   
    public void tworzenieVengefulSpirit(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Vengeful Spirit");
        setBackground(new Color(76, 153, 0));
        setIcon(icon43);
        setRolloverIcon(new ImageIcon(imgVengefulSpirit2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantVengefulSpirit = false;
        direVengefulSpirit = false;
        nazwaVengefulSpirit = "Vengeful Spirit";
            
    }
}
