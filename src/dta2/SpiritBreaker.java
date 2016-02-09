
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class SpiritBreaker extends PrzyciskBohatera{
    
    static URL imgSpiritBreaker = SpiritBreaker.class.getResource("spiritbreaker.png");
   static URL imgSpiritBreaker2 = SpiritBreaker.class.getResource("spiritbreaker2.png");
    
   static ImageIcon icon31 = new ImageIcon(imgSpiritBreaker);
   
    static boolean radiantSpiritBreaker;
    static boolean direSpiritBreaker;
    static String nazwaSpiritBreaker;
   
    public void tworzenieSpiritBreaker(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Spirit Breaker");
        setBackground(new Color(153, 0, 0));
        setIcon(icon31);
        setRolloverIcon(new ImageIcon(imgSpiritBreaker2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSpiritBreaker = false;
        direSpiritBreaker = false;
        nazwaSpiritBreaker = "Spirit Breaker";    
    }
}
