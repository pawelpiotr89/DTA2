
package dta2;

import java.awt.*;import java.net.URL;
;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Medusa extends PrzyciskBohatera{
    
    static URL imgMedusa = Medusa.class.getResource("medusa.png");
   static URL imgMedusa2 = Medusa.class.getResource("medusa2.png");
    
   static ImageIcon icon69 = new ImageIcon(imgMedusa);
   
    static boolean radiantMedusa;
    static boolean direMedusa;
    static String nazwaMedusa;
   
    public void tworzenieMedusa(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Medusa");
        setBackground(new Color(76, 153, 0));
        setIcon(icon69);
        setRolloverIcon(new ImageIcon(imgMedusa2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantMedusa = false;
        direMedusa = false;
        nazwaMedusa = "Medusa";
            
    }
}
