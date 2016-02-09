
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Juggernaut extends PrzyciskBohatera{
    
   static URL imgJuggernaut = Juggernaut.class.getResource("juggernaut.png");
   static URL imgJuggernaut2 = Juggernaut.class.getResource("juggernaut2.png");
    
   static ImageIcon icon39  = new ImageIcon(imgJuggernaut);
   
    static boolean radiantJuggernaut;
    static boolean direJuggernaut;
    static String nazwaJuggernaut;
   
    public void tworzenieJuggernaut(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Juggernaut");
        setBackground(new Color(76, 153, 0));
        setIcon(icon39);
        setRolloverIcon(new ImageIcon(imgJuggernaut2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantJuggernaut = false;
        direJuggernaut = false;
        nazwaJuggernaut = "Juggernaut";    
    }
}