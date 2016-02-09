
package dta2;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class TreantProtector extends PrzyciskBohatera{
    
    static URL imgTreantProtector = TreantProtector.class.getResource("treantprotector.png");
   static URL imgTreantProtector2 = TreantProtector.class.getResource("treantprotector2.png");
    
   static ImageIcon icon12 = new ImageIcon(imgTreantProtector);
   
    static boolean radiantTreantProtector;
    static boolean direTreantProtector;
    static String nazwaTreantProtector;
   
    public void tworzenieTreantProtector(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Treant Protector");
        setBackground(new Color(153, 0, 0));
        setIcon(icon12);
        setRolloverIcon(new ImageIcon(imgTreantProtector2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTreantProtector = false;
        direTreantProtector = false;
        nazwaTreantProtector = "Treant Protector";    
    }
}