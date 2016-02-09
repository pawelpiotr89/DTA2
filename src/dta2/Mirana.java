
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Mirana extends PrzyciskBohatera{
    
    static URL imgMirana = Mirana.class.getResource("mirana.png");
   static URL imgMirana2 = Mirana.class.getResource("mirana2.png");
    
   static ImageIcon icon40 = new ImageIcon(imgMirana);
   
    static boolean radiantMirana;
    static boolean direMirana;
    static String nazwaMirana;
   
    public void tworzenieMirana(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Mirana");
        setBackground(new Color(76, 153, 0));
        setIcon(icon40);
        setRolloverIcon(new ImageIcon(imgMirana2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantMirana = false;
        direMirana = false;
        nazwaMirana = "Mirana";    
    }
}