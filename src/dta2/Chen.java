
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Chen extends PrzyciskBohatera{
    
    static URL imgChen = Chen.class.getResource("chen.png");
   static URL imgChen2 = Chen.class.getResource("chen2.png");
    
   static ImageIcon icon83  = new ImageIcon(imgChen);
   
    static boolean radiantChen;
    static boolean direChen;
    static String nazwaChen;
   
    public void tworzenieChen(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Chen");
        setBackground(new Color(0, 102, 204));
        setIcon(icon83);
        setRolloverIcon(new ImageIcon(imgChen2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantChen = false;
        direChen = false;
        nazwaChen = "Chen";
            
    }
}
