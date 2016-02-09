
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Zeus extends PrzyciskBohatera{
    
    static URL imgZeus = Zeus.class.getResource("zeus.png");
   static URL imgZeus2 = Zeus.class.getResource("zeus2.png");
    
   static ImageIcon icon75 = new ImageIcon(imgZeus);
   
    static boolean radiantZeus;
    static boolean direZeus;
    static String nazwaZeus;
   
    public void tworzenieZeus(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Zeus");
        setBackground(new Color(0, 102, 204));
        setIcon(icon75);
        setRolloverIcon(new ImageIcon(imgZeus2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantZeus = false;
        direZeus = false;
        nazwaZeus = "Zeus";
            
    }
}
