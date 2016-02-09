
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Puck extends PrzyciskBohatera{
    
    static URL imgPuck = Puck.class.getResource("puck.png");
   static URL imgPuck2 = Puck.class.getResource("puck2.png");
    
   static ImageIcon icon72 = new ImageIcon(imgPuck);
   
    static boolean radiantPuck;
    static boolean direPuck;
    static String nazwaPuck;
   
    public void tworzeniePuck(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Puck");
        setBackground(new Color(0, 102, 204));
        setIcon(icon72);
        setRolloverIcon(new ImageIcon(imgPuck2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantPuck = false;
        direPuck = false;
        nazwaPuck = "Puck";
            
    }
}
