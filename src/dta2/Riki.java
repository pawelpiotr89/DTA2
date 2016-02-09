
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Riki extends PrzyciskBohatera{
    
    static URL imgRiki = Riki.class.getResource("riki.png");
   static URL imgRiki2 = Riki.class.getResource("riki2.png");
    
   static ImageIcon icon44 = new ImageIcon(imgRiki);
   
    static boolean radiantRiki;
    static boolean direRiki;
    static String nazwaRiki;
   
    public void tworzenieRiki(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Riki");
        setBackground(new Color(76, 153, 0));
        setIcon(icon44);
        setRolloverIcon(new ImageIcon(imgRiki2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantRiki = false;
        direRiki = false;
        nazwaRiki = "Riki";
            
    }
}
