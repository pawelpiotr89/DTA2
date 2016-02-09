
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Slardar extends PrzyciskBohatera{
    
    static URL imgSlardar = Slardar.class.getResource("slardar.png");
   static URL imgSlardar2 = Slardar.class.getResource("slardar2.png");
    
   static ImageIcon icon25 = new ImageIcon(imgSlardar);
   
    static boolean radiantSlardar;
    static boolean direSlardar;
    static String nazwaSlardar;
   
    public void tworzenieSlardar(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Slardar");
        setBackground(new Color(153, 0, 0));
        setIcon(icon25);
        setRolloverIcon(new ImageIcon(imgSlardar2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSlardar = false;
        direSlardar = false;
        nazwaSlardar = "Slardar";    
    }
}