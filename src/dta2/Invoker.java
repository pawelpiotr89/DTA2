
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Invoker extends PrzyciskBohatera{
    
   static URL imgInvoker = Invoker.class.getResource("invoker.png");
   static URL imgInvoker2 = Invoker.class.getResource("invoker2.png");
    
   static ImageIcon icon107  = new ImageIcon(imgInvoker);
   
    static boolean radiantInvoker;
    static boolean direInvoker;
    static String nazwaInvoker;
   
    public void tworzenieInvoker(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Invoker");
        setBackground(new Color(0, 102, 204));
        setIcon(icon107);
        setRolloverIcon(new ImageIcon(imgInvoker2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantInvoker = false;
        direInvoker = false;
        nazwaInvoker = "Invoker";
            
    }
}

