
package dta2;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Clockwerk extends PrzyciskBohatera{
    
    static URL imgClockwerk = Clockwerk.class.getResource("clockwerk.png");
   static URL imgClockwerk2 = Clockwerk.class.getResource("clockwerk2.png");
    
    static ImageIcon icon8  = new ImageIcon(imgClockwerk);
    
    static boolean radiantClockwerk;
    static boolean direClockwerk;
    static String nazwaClockwerk;
   
    public void tworzenieClockwerk(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Clockwerk");
        setBackground(new Color(153, 0, 0));
        setIcon(icon8);
        setRolloverIcon(new ImageIcon(imgClockwerk2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantClockwerk = false;
        direClockwerk = false;
        nazwaClockwerk = "Clockwerk";
            
    }      
}