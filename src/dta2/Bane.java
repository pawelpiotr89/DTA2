
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Bane extends PrzyciskBohatera{
    
    static URL imgBane = Bane.class.getResource("bane.png");
   static URL imgBane2 = Bane.class.getResource("bane2.png");
    
   static ImageIcon icon92  = new ImageIcon(imgBane);
   
    static boolean radiantBane;
    static boolean direBane;
    static String nazwaBane;
   
    public void tworzenieBane(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Bane");
        setBackground(new Color(0, 102, 204));
        setIcon(icon92);
        setRolloverIcon(new ImageIcon(imgBane2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantBane = false;
        direBane = false;
        nazwaBane = "Bane";
            
    }
}