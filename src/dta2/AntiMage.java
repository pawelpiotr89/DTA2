
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class AntiMage extends PrzyciskBohatera{
    
   static URL imgAntiMage = AntiMage.class.getResource("antimage.png");
   static URL imgAntiMage2 = AntiMage.class.getResource("antimage2.png");
    
   static ImageIcon icon37  = new ImageIcon(imgAntiMage);
   
    static boolean radiantAntiMage;
    static boolean direAntiMage;
    static String nazwaAntiMage;
   
    public void tworzenieAntiMage(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Anti-Mage");
        setBackground(new Color(76, 153, 0));
        setIcon(icon37);
        setRolloverIcon(new ImageIcon(imgAntiMage2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantAntiMage = false;
        direAntiMage = false;
        nazwaAntiMage = "Anti-Mage";    
    }
}