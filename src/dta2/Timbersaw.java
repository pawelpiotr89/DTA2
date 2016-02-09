
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Timbersaw extends PrzyciskBohatera{
    
    static URL imgTimbersaw = Timbersaw.class.getResource("timbersaw.png");
   static URL imgTimbersaw2 = Timbersaw.class.getResource("timbersaw2.png");
    
   static ImageIcon icon15 = new ImageIcon(imgTimbersaw);
   
    static boolean radiantTimbersaw;
    static boolean direTimbersaw;
    static String nazwaTimbersaw;
   
    public void tworzenieTimbersaw(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Timbersaw");
        setBackground(new Color(153, 0, 0));
        setIcon(icon15);
        setRolloverIcon(new ImageIcon(imgTimbersaw2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTimbersaw = false;
        direTimbersaw = false;
        nazwaTimbersaw = "Timbersaw";    
    }
}