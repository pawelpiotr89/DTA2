
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Spectre extends PrzyciskBohatera{
    
    static URL imgSpectre = Spectre.class.getResource("spectre.png");
   static URL imgSpectre2 = Spectre.class.getResource("spectre2.png");
    
   static ImageIcon icon65 = new ImageIcon(imgSpectre);
   
    static boolean radiantSpectre;
    static boolean direSpectre;
    static String nazwaSpectre;
   
    public void tworzenieSpectre(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Spectre");
        setBackground(new Color(76, 152, 0));
        setIcon(icon65);
        setRolloverIcon(new ImageIcon(imgSpectre2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSpectre = false;
        direSpectre = false;
        nazwaSpectre = "Spectre";
            
    }
}