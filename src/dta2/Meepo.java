
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Meepo extends PrzyciskBohatera{
    
    static URL imgMeepo = Meepo.class.getResource("meepo.png");
   static URL imgMeepo2 = Meepo.class.getResource("meepo2.png");
    
   static ImageIcon icon66 = new ImageIcon(imgMeepo);
   
    static boolean radiantMeepo;
    static boolean direMeepo;
    static String nazwaMeepo;
   
    public void tworzenieMeepo(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Meepo");
        setBackground(new Color(76, 153, 0));
        setIcon(icon66);
        setRolloverIcon(new ImageIcon(imgMeepo2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantMeepo = false;
        direMeepo = false;
        nazwaMeepo = "Meepo";
            
    }
}
