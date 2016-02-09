
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Doom extends PrzyciskBohatera{
    
    static URL imgDoom = Doom.class.getResource("doom.png");
   static URL imgDoom2 = Doom.class.getResource("doom2.png");
    
   static ImageIcon icon30  = new ImageIcon(imgDoom);
   
    static boolean radiantDoom;
    static boolean direDoom;
    static String nazwaDoom;
   
    public void tworzenieDoom(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Doom");
        setBackground(new Color(153, 0, 0));
        setIcon(icon30);
        setRolloverIcon(new ImageIcon(imgDoom2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantDoom = false;
        direDoom = false;
        nazwaDoom = "Doom";   
    }
}