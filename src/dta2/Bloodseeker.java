
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Bloodseeker extends PrzyciskBohatera{
    
    static URL imgBloodseeker = Bloodseeker.class.getResource("bloodseeker.png");
   static URL imgBloodseeker2 = Bloodseeker.class.getResource("bloodseeker2.png");
    
   static ImageIcon icon55  = new ImageIcon(imgBloodseeker);
   
    static boolean radiantBloodseeker;
    static boolean direBloodseeker;
    static String nazwaBloodseeker;
   
    public void tworzenieBloodseeker(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Bloodseeker");
        setBackground(new Color(76, 153, 0));
        setIcon(icon55);
        setRolloverIcon(new ImageIcon(imgBloodseeker2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantBloodseeker = false;
        direBloodseeker = false;
        nazwaBloodseeker = "Bloodseeker";
            
    }
}