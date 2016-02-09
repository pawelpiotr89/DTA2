
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Jakiro extends PrzyciskBohatera{
    
    static URL imgJakiro = Jakiro.class.getResource("jakiro.png");
   static URL imgJakiro2 = Jakiro.class.getResource("jakiro2.png");
    
   static ImageIcon icon81  = new ImageIcon(imgJakiro);
   
    static boolean radiantJakiro;
    static boolean direJakiro;
    static String nazwaJakiro;
   
    public void tworzenieJakiro(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Jakiro");
        setBackground(new Color(0, 102, 204));
        setIcon(icon81);
        setRolloverIcon(new ImageIcon(imgJakiro2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantJakiro = false;
        direJakiro = false;
        nazwaJakiro = "Jakiro";
            
    }
}