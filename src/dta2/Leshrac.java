
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Leshrac extends PrzyciskBohatera{
    
    static URL imgLeshrac = Leshrac.class.getResource("leshrac.png");
   static URL imgLeshrac2 = Leshrac.class.getResource("leshrac2.png");
    
   static ImageIcon icon103  = new ImageIcon(imgLeshrac);
   
    static boolean radiantLeshrac;
    static boolean direLeshrac;
    static String nazwaLeshrac;
   
    public void tworzenieLeshrac(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Leshrac");
        setBackground(new Color(0, 102, 204));
        setIcon(icon103);
        setRolloverIcon(new ImageIcon(imgLeshrac2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLeshrac = false;
        direLeshrac = false;
        nazwaLeshrac = "Leshrac";
            
    }
}