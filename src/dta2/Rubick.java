
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Rubick extends PrzyciskBohatera{
    
    static URL imgRubick = Rubick.class.getResource("rubick.png");
   static URL imgRubick2 = Rubick.class.getResource("rubick2.png");
    
   static ImageIcon icon86 = new ImageIcon(imgRubick);
   
    static boolean radiantRubick;
    static boolean direRubick;
    static String nazwaRubick;
   
    public void tworzenieRubick(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Rubick");
        setBackground(new Color(0, 102, 204));
        setIcon(icon86);
        setRolloverIcon(new ImageIcon(imgRubick2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantRubick = false;
        direRubick = false;
        nazwaRubick = "Rubick";
            
    }
}
