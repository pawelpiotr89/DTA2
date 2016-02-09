
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Lion extends PrzyciskBohatera{
    
    static URL imgLion = Lion.class.getResource("lion.png");
   static URL imgLion2 = Lion.class.getResource("lion2.png");
    
   static ImageIcon icon94 = new ImageIcon(imgLion);
   
    static boolean radiantLion;
    static boolean direLion;
    static String nazwaLion;
   
    public void tworzenieLion(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Lion");
        setBackground(new Color(0, 102, 204));
        setIcon(icon94);
        setRolloverIcon(new ImageIcon(imgLion2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLion = false;
        direLion = false;
        nazwaLion = "Lion";
            
    }
}
