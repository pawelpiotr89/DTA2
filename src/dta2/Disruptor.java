
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Disruptor extends PrzyciskBohatera{
    
    static URL imgDisruptor = Disruptor.class.getResource("disruptor.png");
   static URL imgDisruptor2 = Disruptor.class.getResource("disruptor2.png");
    
   static ImageIcon icon87  = new ImageIcon(imgDisruptor);
   
    static boolean radiantDisruptor;
    static boolean direDisruptor;
    static String nazwaDisruptor;
   
    public void tworzenieDisruptor(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Disruptor");
        setBackground(new Color(0, 102, 204));
        setIcon(icon87);
        setRolloverIcon(new ImageIcon(imgDisruptor2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantDisruptor = false;
        direDisruptor = false;
        nazwaDisruptor = "Disruptor";
            
    }
}
