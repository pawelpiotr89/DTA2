
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Viper extends PrzyciskBohatera{
    
    static URL imgViper = Viper.class.getResource("viper.png");
   static URL imgViper2 = Viper.class.getResource("viper2.png");
    
   static ImageIcon icon61 = new ImageIcon(imgViper);
   
    static boolean radiantViper;
    static boolean direViper;
    static String nazwaViper;
   
    public void tworzenieViper(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Viper");
        setBackground(new Color(76, 153, 0));
        setIcon(icon61);
        setRolloverIcon(new ImageIcon(imgViper2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantViper = false;
        direViper = false;
        nazwaViper = "Viper";
            
    }
}