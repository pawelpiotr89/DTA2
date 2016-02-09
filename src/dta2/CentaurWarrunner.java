
package dta2;
import java.awt.*;
import java.net.URL;

import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class CentaurWarrunner extends PrzyciskBohatera{
    
    static URL imgCentaurWarrunner = CentaurWarrunner.class.getResource("centaurwarrunner.png");
   static URL imgCentaurWarrunner2 = CentaurWarrunner.class.getResource("centaurwarrunner2.png");
    
   static ImageIcon icon14  = new ImageIcon(imgCentaurWarrunner);
   
    static boolean radiantCentaurWarrunner;
    static boolean direCentaurWarrunner;
    static String nazwaCentaurWarrunner;
   
    public void tworzenieCentaurWarrunner(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Centaur Warrunner");
        setBackground(new Color(153, 0, 0));
        setIcon(icon14);
        setRolloverIcon(new ImageIcon(imgCentaurWarrunner2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantCentaurWarrunner = false;
        direCentaurWarrunner = false;
        nazwaCentaurWarrunner = "Centaur Warrunner";   
    }
}