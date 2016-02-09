
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class NagaSiren extends PrzyciskBohatera{
    
    static URL imgNagaSiren = NagaSiren.class.getResource("nagasiren.png");
   static URL imgNagaSiren2 = NagaSiren.class.getResource("nagasiren2.png");
    
  static ImageIcon icon52 = new ImageIcon(imgNagaSiren);
   
    static boolean radiantNagaSiren;
    static boolean direNagaSiren;
    static String nazwaNagaSiren;
   
    public void tworzenieNagaSiren(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Naga Siren");
        setBackground(new Color(76, 153, 0));
        setIcon(icon52);
        setRolloverIcon(new ImageIcon(imgNagaSiren2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantNagaSiren = false;
        direNagaSiren = false;
        nazwaNagaSiren = "Naga Siren";
            
    }
}