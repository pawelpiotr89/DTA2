
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class DeathProphet extends PrzyciskBohatera{
    
    static URL imgDeathProphet = DeathProphet.class.getResource("deathprophet.png");
   static URL imgDeathProphet2 = DeathProphet.class.getResource("deathprophet2.png");
    
   static ImageIcon icon100  = new ImageIcon(imgDeathProphet);
   
    static boolean radiantDeathProphet;
    static boolean direDeathProphet;
    static String nazwaDeathProphet;
   
    public void tworzenieDeathProphet(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Death Prophet");
        setBackground(new Color(0, 102, 204));
        setIcon(icon100);
        setRolloverIcon(new ImageIcon(imgDeathProphet2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantDeathProphet = false;
        direDeathProphet = false;
        nazwaDeathProphet = "DeathProphet";
            
    }
}
