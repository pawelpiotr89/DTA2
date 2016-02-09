
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class VoidB extends PrzyciskBohatera{
    
     static URL imgVoidB = VoidB.class.getResource("void.png");
   static URL imgVoidB2 = VoidB.class.getResource("void2.png");
    
   static ImageIcon icon59 = new ImageIcon(imgVoidB);
   
    static boolean radiantVoid;
    static boolean direVoid;
    static String nazwaVoid;
   
    public void tworzenieVoidB(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Void");
        setBackground(new Color(76, 153, 0));
        setIcon(icon59);
        setRolloverIcon(new ImageIcon(imgVoidB2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantVoid = false;
        direVoid = false;
        nazwaVoid = "Void";
            
    }
}
