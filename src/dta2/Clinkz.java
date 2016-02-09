
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Clinkz extends PrzyciskBohatera{
    
    static URL imgClinkz = Clinkz.class.getResource("clinkz.png");
   static URL imgClinkz2 = Clinkz.class.getResource("clinkz2.png");
    
   static ImageIcon icon62  = new ImageIcon(imgClinkz);
   
    static boolean radiantClinkz;
    static boolean direClinkz;
    static String nazwaClinkz;
   
    public void tworzenieClinkz(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Clinkz");
        setBackground(new Color(76, 153, 0));
        setIcon(icon62);
        setRolloverIcon(new ImageIcon(imgClinkz2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantClinkz = false;
        direClinkz = false;
        nazwaClinkz = "Clinkz";
            
    }
}