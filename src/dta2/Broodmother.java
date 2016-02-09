
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Broodmother extends PrzyciskBohatera{
    
    static URL imgBroodmother = Broodmother.class.getResource("broodmother.png");
   static URL imgBroodmother2 = Broodmother.class.getResource("broodmother2.png");
    
   static ImageIcon icon63  = new ImageIcon(imgBroodmother);
   
    static boolean radiantBroodmother;
    static boolean direBroodmother;
    static String nazwaBroodmother;
   
    public void tworzenieBroodmother(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Broodmother");
        setBackground(new Color(76, 153, 0));
        setIcon(icon63);
        setRolloverIcon(new ImageIcon(imgBroodmother2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantBroodmother = false;
        direBroodmother = false;
        nazwaBroodmother = "Broodmother";
            
    }
}