
package dta2;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Kunkka extends PrzyciskBohatera{
    
    static URL imgKunkkat = Kunkka.class.getResource("kunkka.png");
   static URL imgKunkka2 = Kunkka.class.getResource("kunkka2.png");
    
    static ImageIcon icon5  = new ImageIcon(imgKunkkat);
   
    static boolean radiantKunkka;
    static boolean direKunkka;
    static String nazwaKunkka;
   
    public void tworzenieKunkka(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Kunkka");
        setIcon(icon5);
        setBackground(new Color(153, 0, 0));
        setRolloverIcon(new ImageIcon(imgKunkka2));
        setRolloverEnabled(true);
        setBackground(new Color(153, 0, 0));
        setEnabled(true);
           
        radiantKunkka = false;
        direKunkka = false;
        nazwaKunkka = "Kunkka";
            
    }
}