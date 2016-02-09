
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class ShadowFiend extends PrzyciskBohatera{
    
    static URL imgShadowFiend = ShadowFiend.class.getResource("shadowfiend.png");
   static URL imgShadowFiend2 = ShadowFiend.class.getResource("shadowfiend2.png");
    
   static ImageIcon icon56 = new ImageIcon(imgShadowFiend);
   
    static boolean radiantShadowFiend;
    static boolean direShadowFiend;
    static String nazwaShadowFiend;
   
    public void tworzenieShadowFiend(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Shadow Fiend");
        setBackground(new Color(76, 153, 0));
        setIcon(icon56);
        setRolloverIcon(new ImageIcon(imgShadowFiend2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantShadowFiend = false;
        direShadowFiend = false;
        nazwaShadowFiend = "Shadow Fiend";
            
    }
}
