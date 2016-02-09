
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Batrider extends PrzyciskBohatera{
    
    static URL imgBatrider = Batrider.class.getResource("batrider.png");
   static URL imgBatrider2 = Batrider.class.getResource("batrider2.png");
    
   static ImageIcon icon105  = new ImageIcon(imgBatrider);
   
    static boolean radiantBatrider;
    static boolean direBatrider;
    static String nazwaBatrider;
   
    public void tworzenieBatrider(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Batrider");
        setBackground(new Color(0, 102, 204));
        setIcon(icon105);
        setRolloverIcon(new ImageIcon(imgBatrider2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantBatrider = false;
        direBatrider = false;
        nazwaBatrider = "Batrider";
            
    }
}
