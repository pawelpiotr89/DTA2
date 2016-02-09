
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Undying extends PrzyciskBohatera{
    
    static URL imgUndying = Undying.class.getResource("undying.png");
   static URL imgUndying2 = Undying.class.getResource("undying2.png");
    
   static ImageIcon icon34 = new ImageIcon(imgUndying);
   
    static boolean radiantUndying;
    static boolean direUndying;
    static String nazwaUndying;
   
    public void tworzenieUndying(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Undying");
        setBackground(new Color(153, 0, 0));
        setIcon(icon34);
        setRolloverIcon(new ImageIcon(imgUndying2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantUndying = false;
        direUndying = false;
        nazwaUndying = "Undying";    
    }
}
