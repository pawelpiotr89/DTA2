
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Axe extends PrzyciskBohatera{
    
   static URL imgAxe = Axe.class.getResource("axe.png");
   static URL imgAxe2 = Axe.class.getResource("axe2.png");
    
   static ImageIcon icon22  = new ImageIcon(imgAxe);
   
    static boolean radiantAxe;
    static boolean direAxe;
    static String nazwaAxe;
   
    public void tworzenieAxe(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Axe");
        setBackground(new Color(153, 0, 0));
        setIcon(icon22);
        setRolloverIcon(new ImageIcon(imgAxe2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantAxe = false;
        direAxe = false;
        nazwaAxe = "Axe";    
    }
}
