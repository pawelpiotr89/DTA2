
package dta2;
import java.awt.*;
import java.net.URL;

import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Brewmaster extends PrzyciskBohatera{
    
    static URL imgBrewmaster = Brewmaster.class.getResource("brewmaster.png");
   static URL imgBrewmaster2 = Brewmaster.class.getResource("brewmaster2.png");
    
   static ImageIcon icon11  = new ImageIcon(imgBrewmaster);
   
    static boolean radiantBrewmaster;
    static boolean direBrewmaster;
    static String nazwaBrewmaster;
   
    public void tworzenieBrewmaster(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Brewmaster");
        setBackground(new Color(153, 0, 0));
        setIcon(icon11);
        setRolloverIcon(new ImageIcon(imgBrewmaster2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantBrewmaster = false;
        direBrewmaster = false;
        nazwaBrewmaster = "Brewmaster";    
    }
}