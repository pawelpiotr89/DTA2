
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class EmberSpirit extends PrzyciskBohatera{
    
    static URL imgEmberSpirit = EmberSpirit.class.getResource("emberspirit.png");
   static URL imgEmberSpirit2 = EmberSpirit.class.getResource("emberspirit2.png");
    
   static ImageIcon icon54  = new ImageIcon(imgEmberSpirit);
   
    static boolean radiantEmberSpirit;
    static boolean direEmberSpirit;
    static String nazwaEmberSpirit;
   
    public void tworzenieEmberSpirit(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Ember Spirit");
        setBackground(new Color(76, 153, 0));
        setIcon(icon54);
        setRolloverIcon(new ImageIcon(imgEmberSpirit2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantEmberSpirit = false;
        direEmberSpirit = false;
        nazwaEmberSpirit = "Ember Spirit";
            
    }
}