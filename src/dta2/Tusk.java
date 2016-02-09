
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Tusk extends PrzyciskBohatera{
    
    static URL imgTusk = Tusk.class.getResource("tusk.png");
   static URL imgTusk2 = Tusk.class.getResource("tusk2.png");
    
   static ImageIcon icon17 = new ImageIcon(imgTusk);
   
    static boolean radiantTusk;
    static boolean direTusk;
    static String nazwaTusk;
   
    public void tworzenieTusk(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Tusk");
        setBackground(new Color(153, 0, 0));
        setIcon(icon17);
        setRolloverIcon(new ImageIcon(imgTusk2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTusk = false;
        direTusk = false;
        nazwaTusk = "Tusk";    
    }
}