
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Bristleback extends PrzyciskBohatera{
    
    static URL imgBristleback = Bristleback.class.getResource("bristleback.png");
   static URL imgBristleback2 = Bristleback.class.getResource("bristleback2.png");
    
   static ImageIcon icon16  = new ImageIcon(imgBristleback);
   
    static boolean radiantBristleback;
    static boolean direBristleback;
    static String nazwaBristleback;
   
    public void tworzenieBristleback(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Bristleback");
        setBackground(new Color(153, 0, 0));
        setIcon(icon16);
        setRolloverIcon(new ImageIcon(imgBristleback2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantBristleback = false;
        direBristleback = false;
        nazwaBristleback = "Bristleback";    
    }
}