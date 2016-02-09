
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class OgreMagi extends PrzyciskBohatera{
    
    static URL imgOgreMagi = OgreMagi.class.getResource("ogremagi.png");
   static URL imgOgreMagi2 = OgreMagi.class.getResource("ogremagi2.png");
    
   static ImageIcon icon85 = new ImageIcon(imgOgreMagi);
   
    static boolean radiantOgreMagi;
    static boolean direOgreMagi;
    static String nazwaOgreMagi;
   
    public void tworzenieOgreMagi(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Ogre Magi");
        setBackground(new Color(0, 102, 204));
        setIcon(icon85);
        setRolloverIcon(new ImageIcon(imgOgreMagi2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantOgreMagi = false;
        direOgreMagi = false;
        nazwaOgreMagi = "Ogre Magi";
            
    }
}