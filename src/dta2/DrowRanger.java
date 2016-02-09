
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class DrowRanger extends PrzyciskBohatera{
    
    static URL imgDrowRanger = DrowRanger.class.getResource("drowranger.png");
   static URL imgDrowRanger2 = DrowRanger.class.getResource("drowranger2.png");
    
   static ImageIcon icon38  = new ImageIcon(imgDrowRanger);
   
    static boolean radiantDrowRanger;
    static boolean direDrowRanger;
    static String nazwaDrowRanger;
   
    public void tworzenieDrowRanger(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Drow Ranger");
        setBackground(new Color(76, 153, 0));
        setIcon(icon38);
        setRolloverIcon(new ImageIcon(imgDrowRanger2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantDrowRanger = false;
        direDrowRanger = false;
        nazwaDrowRanger = "DrowRanger";   
    }
}