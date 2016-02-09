
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Dazzle extends PrzyciskBohatera{
    
    static URL imgDazzle = Dazzle.class.getResource("dazzle.png");
   static URL imgDazzle2 = Dazzle.class.getResource("dazzle2.png");
    
   static ImageIcon icon102  = new ImageIcon(imgDazzle);
   
    static boolean radiantDazzle;
    static boolean direDazzle;
    static String nazwaDazzle;
   
    public void tworzenieDazzle(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Dazzle");
        setBackground(new Color(0, 102, 204));
        setIcon(icon102);
        setRolloverIcon(new ImageIcon(imgDazzle2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantDazzle = false;
        direDazzle = false;
        nazwaDazzle = "Dazzle";
            
    }
}