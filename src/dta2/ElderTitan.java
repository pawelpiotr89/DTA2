
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class ElderTitan extends PrzyciskBohatera{
    
    static URL imgElderTitan = ElderTitan.class.getResource("eldertitan.png");
   static URL imgElderTitan2 = ElderTitan.class.getResource("eldertitan2.png");
    
   static ImageIcon icon18  = new ImageIcon(imgElderTitan);
   
    static boolean radiantElderTitan;
    static boolean direElderTitan;
    static String nazwaElderTitan;
   
    public void tworzenieElderTitan(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Elder Titan");
        setBackground(new Color(153, 0, 0));
        setIcon(icon18);
        setRolloverIcon(new ImageIcon(imgElderTitan2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantElderTitan = false;
        direElderTitan = false;
        nazwaElderTitan = "Elder Titan";  
    }
}
