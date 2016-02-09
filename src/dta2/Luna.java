
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Luna extends PrzyciskBohatera{
    
    static URL imgLuna = Luna.class.getResource("luna.png");
   static URL imgLuna2 = Luna.class.getResource("luna2.png");
    
   static ImageIcon icon47 = new ImageIcon(imgLuna);
   
    static boolean radiantLuna;
    static boolean direLuna;
    static String nazwaLuna;
   
    public void tworzenieLuna(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Luna");
        setBackground(new Color(76, 153, 0));
        setIcon(icon47);
        setRolloverIcon(new ImageIcon(imgLuna2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLuna = false;
        direLuna = false;
        nazwaLuna = "Luna";
            
    }
}