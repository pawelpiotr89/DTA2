
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class PhantomAssassin extends PrzyciskBohatera{
    
    static URL imgPhantomAssassin = PhantomAssassin.class.getResource("phantomassassin.png");
   static URL imgPhantomAssassin2 = PhantomAssassin.class.getResource("phantomassassin2.png");
    
   static ImageIcon icon60 = new ImageIcon(imgPhantomAssassin);
   
    static boolean radiantPhantomAssassin;
    static boolean direPhantomAssassin;
    static String nazwaPhantomAssassin;
   
    public void tworzeniePhantomAssassin(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Phantom Assassin");
        setBackground(new Color(76, 153, 0));
        setIcon(icon60);
        setRolloverIcon(new ImageIcon(imgPhantomAssassin2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantPhantomAssassin = false;
        direPhantomAssassin = false;
        nazwaPhantomAssassin = "Phantom Assassin";
            
    }
}
