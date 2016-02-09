
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Windranger extends PrzyciskBohatera{
    
    static URL imgWindranger = Windranger.class.getResource("windranger.png");
   static URL imgWindranger2 = Windranger.class.getResource("windranger2.png");
    
   static ImageIcon icon74 = new ImageIcon(imgWindranger);
   
    static boolean radiantWindranger;
    static boolean direWindranger;
    static String nazwaWindranger;
   
    public void tworzenieWindranger(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Windranger");
        setBackground(new Color(0, 102, 204));
        setIcon(icon74);
        setRolloverIcon(new ImageIcon(imgWindranger2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantWindranger = false;
        direWindranger = false;
        nazwaWindranger = "Windranger";
            
    }
}
