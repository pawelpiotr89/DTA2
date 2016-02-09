
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class WraithKing extends PrzyciskBohatera{
    
    static URL imgWraithKing = WraithKing.class.getResource("wraithking.png");
   static URL imgWraithKing2 = WraithKing.class.getResource("wraithking2.png");
    
   static ImageIcon icon27 = new ImageIcon(imgWraithKing);
   
    static boolean radiantWraithKing;
    static boolean direWraithKing;
    static String nazwaWraithKing;
   
    public void tworzenieWraithKing(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Wraith King");
        setBackground(new Color(153, 0, 0));
        setIcon(icon27);
        setRolloverIcon(new ImageIcon(imgWraithKing2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantWraithKing = false;
        direWraithKing = false;
        nazwaWraithKing = "Wraith King";    
    }
}