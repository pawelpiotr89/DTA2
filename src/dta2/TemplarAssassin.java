
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class TemplarAssassin extends PrzyciskBohatera{
    
    static URL imgTemplarAssassin = TemplarAssassin.class.getResource("templarassassin.png");
   static URL imgTemplarAssassin2 = TemplarAssassin.class.getResource("templarassassin2.png");
    
   static ImageIcon icon46 = new ImageIcon(imgTemplarAssassin);
   
    static boolean radiantTemplarAssassin;
    static boolean direTemplarAssassin;
    static String nazwaTemplarAssassin;
   
    public void tworzenieTemplarAssassin(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Templar Assassin");
        setBackground(new Color(76, 153, 0));
        setIcon(icon46);
        setRolloverIcon(new ImageIcon(imgTemplarAssassin2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantTemplarAssassin = false;
        direTemplarAssassin = false;
        nazwaTemplarAssassin = "TemplarAssassin";
            
    }
}