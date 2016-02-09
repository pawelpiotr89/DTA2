
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Techies extends PrzyciskBohatera{
    
     static URL imgTechies = Techies.class.getResource("techies.png");
   static URL imgTechies2 = Techies.class.getResource("techies2.png");
    
   static ImageIcon icon91 = new ImageIcon(imgTechies);
   
    static boolean radiantTechies;
    static boolean direTechies;
    static String nazwaTechies;
   
    public void tworzenieTechies(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Techies");
        setBackground(new Color(0, 102, 204));
        setIcon(icon91);
        setRolloverIcon(new ImageIcon(imgTechies2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTechies = false;
        direTechies = false;
        nazwaTechies = "Techies";
            
    }
}
