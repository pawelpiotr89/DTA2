
package dta2;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Omni extends PrzyciskBohatera{
    
    static URL imgOmni = Omni.class.getResource("omni.png");
   static URL imgOmni2 = Omni.class.getResource("omni2.png");
    
   static ImageIcon icon3  = new ImageIcon(imgOmni);
   
   static boolean radiantOmniknight;
    static boolean direOmniknight;
    static String nazwaOmniknight;
   
    public void tworzenieOmni(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Omni Knight");
        setBackground(new Color(153, 0, 0));
        setIcon(icon3);
        setRolloverIcon(new ImageIcon(imgOmni2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantOmniknight = false;
        direOmniknight = false;
        nazwaOmniknight = "Omniknight";
            
    }
}

