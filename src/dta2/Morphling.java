
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Morphling extends PrzyciskBohatera{
    
    static URL imgMorphling = Morphling.class.getResource("morphling.png");
   static URL imgMorphling2 = Morphling.class.getResource("morphling2.png");
    
   static ImageIcon icon41 = new ImageIcon(imgMorphling);
   
    static boolean radiantMorphling;
    static boolean direMorphling;
    static String nazwaMorphling;
   
    public void tworzenieMorphling(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Morphling");
        setBackground(new Color(76, 153, 0));
        setIcon(icon41);
        setRolloverIcon(new ImageIcon(imgMorphling2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantMorphling = false;
        direMorphling = false;
        nazwaMorphling = "Morphling";
            
    }
}