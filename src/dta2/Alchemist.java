
package dta2;
import java.awt.*;
import java.net.URL;

import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Alchemist extends PrzyciskBohatera{
    
   static URL imgAlchemist = Alchemist.class.getResource("alchemist.png");
   static URL imgAlchemist2 = Alchemist.class.getResource("alchemist2.png");
    
   static ImageIcon icon10  = new ImageIcon(imgAlchemist);
   
    static boolean radiantAlchemist;
    static boolean direAlchemist;
    static String nazwaAlchemist;
   
    public void tworzenieAlchemist(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Alchemist");
        setBackground(new Color(153, 0, 0));
        setIcon(icon10);
        setRolloverIcon(new ImageIcon(imgAlchemist2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantAlchemist = false;
        direAlchemist = false;
        nazwaAlchemist = "Alchemist";
            
    }
}