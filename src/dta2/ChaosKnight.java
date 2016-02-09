
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class ChaosKnight extends PrzyciskBohatera{
    
    static URL imgChaosKnight = ChaosKnight.class.getResource("chaosknight.png");
   static URL imgChaosKnight2 = ChaosKnight.class.getResource("chaosknight2.png");
    
   static ImageIcon icon33  = new ImageIcon(imgChaosKnight);
   
    static boolean radiantChaosKnight;
    static boolean direChaosKnight;
    static String nazwaChaosKnight;
   
    public void tworzenieChaosKnight(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Chaos Knight");
        setBackground(new Color(153, 0, 0));
        setIcon(icon33);
        setRolloverIcon(new ImageIcon(imgChaosKnight2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantChaosKnight = false;
        direChaosKnight = false;
        nazwaChaosKnight = "Chaos Knight";    
    }
}
