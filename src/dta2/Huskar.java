
package dta2;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Huskar extends PrzyciskBohatera{
    
    static URL imgHuskar = Huskar.class.getResource("huskar.png");
   static URL imgHuskar2 = Huskar.class.getResource("huskar2.png");
    
   static ImageIcon icon9  = new ImageIcon(imgHuskar);
   
    static boolean radiantHuskar;
    static boolean direHuskar;
    static String nazwaHuskar;
   
    public void tworzenieHuskar(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Huskar");
        setBackground(new Color(153, 0, 0));
        setIcon(icon9);
        setRolloverIcon(new ImageIcon(imgHuskar2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantHuskar = false;
        direHuskar = false;
        nazwaHuskar = "Huskar";
            
    }
}
