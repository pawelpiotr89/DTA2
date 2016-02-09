package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Tiny extends PrzyciskBohatera{
    
    static URL imgTiny = Tiny.class.getResource("tiny.png");
   static URL imgTiny2 = Tiny.class.getResource("tiny2.png");
    
   static ImageIcon icon4  = new ImageIcon(imgTiny);
   
    static boolean radiantTiny;
    static boolean direTiny;
    static String nazwaTiny;
   
    public void tworzenieTiny(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Tiny");
        setBackground(new Color(153, 0, 0));
        setIcon(icon4);
        setRolloverIcon(new ImageIcon(imgTiny2));
        setRolloverEnabled(true);
        setEnabled(true);
           
        radiantTiny = false;
        direTiny = false;
        nazwaTiny = "Tiny";
            
    }
}