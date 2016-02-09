
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class OutworldDevourer extends PrzyciskBohatera{
    
    static URL imgOutworldDevourer = OutworldDevourer.class.getResource("outworlddevourer.png");
   static URL imgOutworldDevourer2 = OutworldDevourer.class.getResource("outworlddevourer2.png");
    
   static ImageIcon icon108 = new ImageIcon(imgOutworldDevourer);
   
    static boolean radiantOutworldDevourer;
    static boolean direOutworldDevourer;
    static String nazwaOutworldDevourer;
   
    public void tworzenieOutworldDevourer(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Outworld Devourer");
        setBackground(new Color(0, 102, 204));
        setIcon(icon108);
        setRolloverIcon(new ImageIcon(imgOutworldDevourer2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantOutworldDevourer = false;
        direOutworldDevourer = false;
        nazwaOutworldDevourer = "Outworld Devourer";
            
    }
}
