
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Pugna extends PrzyciskBohatera{
    
    static URL imgPugna = Pugna.class.getResource("pugna.png");
   static URL imgPugna2 = Pugna.class.getResource("pugna2.png");
    
   static ImageIcon icon101 = new ImageIcon(imgPugna);
   
    static boolean radiantPugna;
    static boolean direPugna;
    static String nazwaPugna;
   
    public void tworzeniePugna(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Pugna");
        setBackground(new Color(0, 102, 204));
        setIcon(icon101);
        setRolloverIcon(new ImageIcon(imgPugna2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantPugna = false;
        direPugna = false;
        nazwaPugna = "Pugna";
            
    }
}
