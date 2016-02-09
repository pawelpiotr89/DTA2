
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Terrorblade extends PrzyciskBohatera{
    
    static URL imgTerrorblade = Terrorblade.class.getResource("terrorblade.png");
   static URL imgTerrorblade2 = Terrorblade.class.getResource("terrorblade2.png");
    
   static ImageIcon icon70 = new ImageIcon(imgTerrorblade);
   
    static boolean radiantTerrorblade;
    static boolean direTerrorblade;
    static String nazwaTerrorblade;
   
    public void tworzenieTerrorblade(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Terrorblade");
        setBackground(new Color(76, 153, 0));
        setIcon(icon70);
        setRolloverIcon(new ImageIcon(imgTerrorblade2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTerrorblade = false;
        direTerrorblade = false;
        nazwaTerrorblade = "Terrorblade";
            
    }
}
