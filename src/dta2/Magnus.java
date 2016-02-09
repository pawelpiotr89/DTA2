
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Magnus extends PrzyciskBohatera{
    
    static URL imgMagnus = Magnus.class.getResource("magnus.png");
   static URL imgMagnus2 = Magnus.class.getResource("magnus2.png");
    
   static ImageIcon icon35 = new ImageIcon(imgMagnus);
   
    static boolean radiantMagnus;
    static boolean direMagnus;
    static String nazwaMagnus;
   
    public void tworzenieMagnus(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Magnus");
        setBackground(new Color(153, 0, 0));
        setIcon(icon35);
        setRolloverIcon(new ImageIcon(imgMagnus2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantMagnus = false;
        direMagnus = false;
        nazwaMagnus = "Magnus";    
    }
}

