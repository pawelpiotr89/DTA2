
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class BountyHunter extends PrzyciskBohatera{
    
    static URL imgBountyHunter = BountyHunter.class.getResource("bountyhunter.png");
   static URL imgBountyHunter2 = BountyHunter.class.getResource("bountyhunter2.png");
    
   static ImageIcon icon48  = new ImageIcon(imgBountyHunter);
   
    static boolean radiantBountyHunter;
    static boolean direBountyHunter;
    static String nazwaBountyHunter;
   
    public void tworzenieBountyHunter(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Bounty Hunter");
        setBackground(new Color(76, 153, 0));
        setIcon(icon48);
        setRolloverIcon(new ImageIcon(imgBountyHunter2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantBountyHunter = false;
        direBountyHunter = false;
        nazwaBountyHunter = "Bounty Hunter";
            
    }
}