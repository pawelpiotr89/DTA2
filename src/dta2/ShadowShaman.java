
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class ShadowShaman extends PrzyciskBohatera{
    
    static URL imgShadowShaman = ShadowShaman.class.getResource("shadowshaman.png");
   static URL imgShadowShaman2 = ShadowShaman.class.getResource("shadowshaman2.png");
    
   static ImageIcon icon77 = new ImageIcon(imgShadowShaman);
   
    static boolean radiantShadowShaman;
    static boolean direShadowShaman;
    static String nazwaShadowShaman;
   
    public void tworzenieShadowShaman(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Shadow Shaman");
        setBackground(new Color(0, 102, 204));
        setIcon(icon77);
        setRolloverIcon(new ImageIcon(imgShadowShaman2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantShadowShaman = false;
        direShadowShaman = false;
        nazwaShadowShaman = "Shadow Shaman";
            
    }
}