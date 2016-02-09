
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Oracle extends PrzyciskBohatera{
    
    static URL imgOracle = Oracle.class.getResource("oracle.png");
   static URL imgOracle2 = Oracle.class.getResource("oracle2.png");
    
   static ImageIcon icon90 = new ImageIcon(imgOracle);
   
    static boolean radiantOracle;
    static boolean direOracle;
    static String nazwaOracle;
   
    public void tworzenieOracle(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Oracle");
        setBackground(new Color(0, 102, 204));
        setIcon(icon90);
        setRolloverIcon(new ImageIcon(imgOracle2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantOracle = false;
        direOracle = false;
        nazwaOracle = "Oracle";
            
    }
}

