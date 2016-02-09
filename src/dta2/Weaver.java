
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Weaver extends PrzyciskBohatera{
    
    static URL imgWeaver = Weaver.class.getResource("weaver.png");
   static URL imgWeaver2 = Weaver.class.getResource("weaver2.png");
    
   static ImageIcon icon64 = new ImageIcon(imgWeaver);
   
    static boolean radiantWeaver;
    static boolean direWeaver;
    static String nazwaWeaver;
   
    public void tworzenieWeaver(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Weaver");
        setBackground(new Color(76, 153, 0));
        setIcon(icon64);
        setRolloverIcon(new ImageIcon(imgWeaver2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantWeaver = false;
        direWeaver = false;
        nazwaWeaver = "Weaver";
            
    }
}
