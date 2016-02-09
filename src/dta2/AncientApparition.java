
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class AncientApparition extends PrzyciskBohatera{
    
    static URL imgAncientApparition = AncientApparition.class.getResource("ancientapparition.png");
    static URL imgAncientApparition2 = AncientApparition.class.getResource("ancientapparition2.png");
    
   static ImageIcon icon106  = new ImageIcon(imgAncientApparition);
   
    static boolean radiantAncientApparition;
    static boolean direAncientApparition;
    static String nazwaAncientApparition;
   
    public void tworzenieAncientApparition(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Ancient Apparition");
        setBackground(new Color(0, 102, 204));
        setIcon(icon106);
        setRolloverIcon(new ImageIcon(imgAncientApparition2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantAncientApparition = false;
        direAncientApparition = false;
        nazwaAncientApparition = "Ancient Apparition";
            
    }
}
