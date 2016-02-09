
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class CrystalMaiden extends PrzyciskBohatera{
    
    static URL imgCrystalMaiden = CrystalMaiden.class.getResource("crystalmaiden.png");
   static URL imgCrystalMaiden2 = CrystalMaiden.class.getResource("crystalmaiden2.png");
    
   static ImageIcon icon71  = new ImageIcon(imgCrystalMaiden);
   
    static boolean radiantCrystalMaiden;
    static boolean direCrystalMaiden;
    static String nazwaCrystalMaiden;
   
    public void tworzenieCrystalMaiden(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Crystal Maiden");
        setBackground(new Color(0, 102, 204));
        setIcon(icon71);
        setRolloverIcon(new ImageIcon(imgCrystalMaiden2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantCrystalMaiden = false;
        direCrystalMaiden = false;
        nazwaCrystalMaiden = "Crystal Maiden";
            
    }
}
