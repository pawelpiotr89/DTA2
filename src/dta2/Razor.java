
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Razor extends PrzyciskBohatera{
    
    static URL imgRazor = Razor.class.getResource("razor.png");
   static URL imgRazor2 = Razor.class.getResource("razor2.png");
    
   static ImageIcon icon57 = new ImageIcon(imgRazor);
   
    static boolean radiantRazor;
    static boolean direRazor;
    static String nazwaRazor;
   
    public void tworzenieRazor(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Razor");
        setBackground(new Color(76, 153, 0));
        setIcon(icon57);
        setRolloverIcon(new ImageIcon(imgRazor2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantRazor = false;
        direRazor = false;
        nazwaRazor = "Razor";
            
    }
}
