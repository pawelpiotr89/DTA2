
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class NyxAssassin extends PrzyciskBohatera{
    
    static URL imgNyxAssassin = NyxAssassin.class.getResource("nyxassassin.png");
   static URL imgNyxAssassin2 = NyxAssassin.class.getResource("nyxassassin2.png");
    
   static ImageIcon icon67 = new ImageIcon(imgNyxAssassin);
   
    static boolean radiantNyxAssassin;
    static boolean direNyxAssassin;
    static String nazwaNyxAssassin;
   
    public void tworzenieNyxAssassin(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Nyx Assassin");
        setBackground(new Color(76, 153, 0));
        setIcon(icon67);
        setRolloverIcon(new ImageIcon(imgNyxAssassin2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantNyxAssassin = false;
        direNyxAssassin = false;
        nazwaNyxAssassin = "Nyx Assassin";
            
    }
}

