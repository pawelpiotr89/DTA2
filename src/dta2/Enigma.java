
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Enigma extends PrzyciskBohatera{
    
    static URL imgEnigma = Enigma.class.getResource("enigma.png");
   static URL imgEnigma2 = Enigma.class.getResource("enigma2.png");
    
   static ImageIcon icon96  = new ImageIcon(imgEnigma);
   
    static boolean radiantEnigma;
    static boolean direEnigma;
    static String nazwaEnigma;
   
    public void tworzenieEnigma(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Enigma");
        setBackground(new Color(0, 102, 204));
        setIcon(icon96);
        setRolloverIcon(new ImageIcon(imgEnigma2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantEnigma = false;
        direEnigma = false;
        nazwaEnigma = "Enigma";
            
    }
}
