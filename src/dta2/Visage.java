
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Visage extends PrzyciskBohatera{
    
    static URL imgVisage = Visage.class.getResource("visage.png");
   static URL imgVisage2 = Visage.class.getResource("visage2.png");
    
   static ImageIcon icon110 = new ImageIcon(imgVisage);
   
    static boolean radiantVisage;
    static boolean direVisage;
    static String nazwaVisage;
   
    public void tworzenieVisage(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Visage");
        setBackground(new Color(0, 102, 204));
        setIcon(icon110);
        setRolloverIcon(new ImageIcon(imgVisage2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantVisage = false;
        direVisage = false;
        nazwaVisage = "Visage";
            
    }
}