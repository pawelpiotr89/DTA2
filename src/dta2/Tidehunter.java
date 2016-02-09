
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Tidehunter extends PrzyciskBohatera{
    
    static URL imgTidehunter = Tidehunter.class.getResource("tidehunter.png");
   static URL imgTidehunter2 = Tidehunter.class.getResource("tidehunter2.png");
    
   static ImageIcon icon26 = new ImageIcon(imgTidehunter);
   
    static boolean radiantTidehunter;
    static boolean direTidehunter;
    static String nazwaTidehunter;
   
    public void tworzenieTidehunter(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Tidehunter");
        setBackground(new Color(153, 0, 0));
        setIcon(icon26);
        setRolloverIcon(new ImageIcon(imgTidehunter2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTidehunter = false;
        direTidehunter = false;
        nazwaTidehunter = "Tidehunter";    
    }
}
