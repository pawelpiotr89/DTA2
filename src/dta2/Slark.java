
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Slark extends PrzyciskBohatera{
    
    static URL imgSlark = Slark.class.getResource("slark.png");
   static URL imgSlark2 = Slark.class.getResource("slark2.png");
    
   static ImageIcon icon68 = new ImageIcon(imgSlark);
   
    static boolean radiantSlark;
    static boolean direSlark;
    static String nazwaSlark;
   
    public void tworzenieSlark(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Slark");
        setBackground(new Color(76, 152, 0));
        setIcon(icon68);
        setRolloverIcon(new ImageIcon(imgSlark2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSlark = false;
        direSlark = false;
        nazwaSlark = "Slark"; 
            
    }
}