
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Lina extends PrzyciskBohatera{
    
   static URL imgLina = Lina.class.getResource("lina.png");
   static URL imgLina2 = Lina.class.getResource("lina2.png");
    
   static ImageIcon icon76 = new ImageIcon(imgLina);
   
    static boolean radiantLina;
    static boolean direLina;
    static String nazwaLina;
   
    public void tworzenieLina(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Lina");
        setBackground(new Color(0, 102, 204));
        setIcon(icon76);
        setRolloverIcon(new ImageIcon(imgLina2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLina = false;
        direLina = false;
        nazwaLina = "Lina";
            
    }
}