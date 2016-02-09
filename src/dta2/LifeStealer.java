
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class LifeStealer extends PrzyciskBohatera{
    
    static URL imgLifeStealer = LifeStealer.class.getResource("lifestealer.png");
   static URL imgLifeStealer2 = LifeStealer.class.getResource("lifestealer2.png");
    
   static ImageIcon icon28  = new ImageIcon(imgLifeStealer);
   
    static boolean radiantLifeStealer;
    static boolean direLifeStealer;
    static String nazwaLifeStealer;
   
    public void tworzenieLifeStealer(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Life Stealer");
        setBackground(new Color(153, 0, 0));
        setIcon(icon28);
        setRolloverIcon(new ImageIcon(imgLifeStealer2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLifeStealer = false;
        direLifeStealer = false;
        nazwaLifeStealer = "Life Stealer";   
    }
}