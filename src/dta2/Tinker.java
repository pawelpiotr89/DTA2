
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Tinker extends PrzyciskBohatera{
    
    static URL imgTinker = Tinker.class.getResource("tinker.png");
   static URL imgTinker2 = Tinker.class.getResource("tinker2.png");
    
   static ImageIcon icon78 = new ImageIcon(imgTinker);
   
    static boolean radiantTinker;
    static boolean direTinker;
    static String nazwaTinker;
   
    public void tworzenieTinker(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Tinker");
        setBackground(new Color(0, 102, 204));
        setIcon(icon78);
        setRolloverIcon(new ImageIcon(imgTinker2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTinker = false;
        direTinker = false;
        nazwaTinker = "Tinker";
            
    }
}
