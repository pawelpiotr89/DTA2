
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Sniper extends PrzyciskBohatera{
    
    static URL imgSniper = Sniper.class.getResource("sniper.png");
   static URL imgSniper2 = Sniper.class.getResource("sniper2.png");
    
    static ImageIcon icon45 = new ImageIcon(imgSniper);
   
    static boolean radiantSniper;
    static boolean direSniper;
    static String nazwaSniper;
   
    public void tworzenieSniper(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Sniper");
        setBackground(new Color(76, 152, 0));
        setIcon(icon45);
        setRolloverIcon(new ImageIcon(imgSniper2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSniper = false;
        direSniper = false;
        nazwaSniper = "Sniper";
            
    }
}