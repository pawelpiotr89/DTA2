
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Ursa extends PrzyciskBohatera{
    
    static URL imgUrsa = Ursa.class.getResource("ursa.png");
   static URL imgUrsa2 = Ursa.class.getResource("ursa2.png");
    
  static ImageIcon icon49 = new ImageIcon(imgUrsa);
   
    static boolean radiantUrsa;
    static boolean direUrsa;
    static String nazwaUrsa;
   
    public void tworzenieUrsa(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Ursa");
        setBackground(new Color(76, 153, 0));
        setIcon(icon49);
        setRolloverIcon(new ImageIcon(imgUrsa2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantUrsa = false;
        direUrsa = false;
        nazwaUrsa = "Ursa";
            
    }
}