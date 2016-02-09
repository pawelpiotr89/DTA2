
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Enchantress extends PrzyciskBohatera{
    
    static URL imgEnchantress = Enchantress.class.getResource("enchantress.png");
   static URL imgEnchantress2 = Enchantress.class.getResource("enchantress2.png");
    
   static ImageIcon icon80  = new ImageIcon(imgEnchantress);
   
    static boolean radiantEnchantress;
    static boolean direEnchantress;
    static String nazwaEnchantress;
   
    public void tworzenieEnchantress(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Enchantress");
        setBackground(new Color(0, 102, 204));
        setIcon(icon80);
        setRolloverIcon(new ImageIcon(imgEnchantress2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantEnchantress = false;
        direEnchantress = false;
        nazwaEnchantress = "Enchantress";
            
    }
}
