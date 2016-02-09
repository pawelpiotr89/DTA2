
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Sven extends PrzyciskBohatera{
    
    static URL imgSven = Sven.class.getResource("sven.png");
   static URL imgSven2 = Sven.class.getResource("sven2.png");
    
    static ImageIcon icon2  = new ImageIcon(imgSven);
    
    static boolean radiantSven;
    static boolean direSven;
    static String nazwaSven;
      
    public void tworzenieSven(){
        
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Sven");
        setBackground(new Color(153, 0, 0));
        setIcon(icon2);
        setRolloverIcon(new ImageIcon(imgSven2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSven = false;
        direSven = false;
        nazwaSven = "Sven";
       
        
    }
}