
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Necrophos extends PrzyciskBohatera{
    
    static URL imgNecrophos = Necrophos.class.getResource("necrophos.png");
   static URL imgNecrophos2 = Necrophos.class.getResource("necrophos2.png");
    
   static ImageIcon icon97 = new ImageIcon(imgNecrophos);
   
    static boolean radiantNecrophos;
    static boolean direNecrophos;
    static String nazwaNecrophos;
   
    public void tworzenieNecrophos(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Necrophos");
        setBackground(new Color(0, 102, 204));
        setIcon(icon97);
        setRolloverIcon(new ImageIcon(imgNecrophos2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantNecrophos = false;
        direNecrophos = false;
        nazwaNecrophos = "Necrophos";
            
    }
}