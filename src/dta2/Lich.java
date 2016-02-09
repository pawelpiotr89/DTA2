
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Lich extends PrzyciskBohatera{
    
    static URL imgLich = Lich.class.getResource("lich.png");
   static URL imgLich2 = Lich.class.getResource("lich2.png");
    
   static ImageIcon icon93  = new ImageIcon(imgLich);
   
    static boolean radiantLich;
    static boolean direLich;
    static String nazwaLich;
   
    public void tworzenieLich(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Lich");
        setBackground(new Color(0, 102, 204));
        setIcon(icon93);
        setRolloverIcon(new ImageIcon(imgLich2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLich = false;
        direLich = false;
        nazwaLich = "Lich";
            
    }
}