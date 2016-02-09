
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Gyrocopter extends PrzyciskBohatera{
    
    static URL imgGyrocopter = Gyrocopter.class.getResource("gyrocopter.png");
   static URL imgGyrocopter2 = Gyrocopter.class.getResource("gyrocopter2.png");
    
   static ImageIcon icon50  = new ImageIcon(imgGyrocopter);
   
    static boolean radiantGyrocopter;
    static boolean direGyrocopter;
    static String nazwaGyrocopter;
   
    public void tworzenieGyrocopter(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Gyrocopter");
        setBackground(new Color(76, 153, 0));
        setIcon(icon50);
        setRolloverIcon(new ImageIcon(imgGyrocopter2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantGyrocopter = false;
        direGyrocopter = false;
        nazwaGyrocopter = "Gyrocopter";
            
    }
}