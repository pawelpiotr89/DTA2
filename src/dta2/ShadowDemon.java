
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class ShadowDemon extends PrzyciskBohatera{
    
    static URL imgShadowDemon = ShadowDemon.class.getResource("shadowdemon.png");
   static URL imgShadowDemon2 = ShadowDemon.class.getResource("shadowdemon2.png");
    
   static ImageIcon icon109 = new ImageIcon(imgShadowDemon);
   
    static boolean radiantShadowDemon;
    static boolean direShadowDemon;
    static String nazwaShadowDemon;
   
    public void tworzenieShadowDemon(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Shadow Demon");
        setBackground(new Color(0, 102, 204));
        setIcon(icon109);
        setRolloverIcon(new ImageIcon(imgShadowDemon2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantShadowDemon = false;
        direShadowDemon = false;
        nazwaShadowDemon = "Shadow Demon";
            
    }
}