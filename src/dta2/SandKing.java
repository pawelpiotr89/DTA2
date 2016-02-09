
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class SandKing extends PrzyciskBohatera{
    
    static URL imgSandKing = SandKing.class.getResource("sandking.png");
   static URL imgSandKing2 = SandKing.class.getResource("sandking2.png");
    
   static ImageIcon icon24 = new ImageIcon(imgSandKing);
   
    static boolean radiantSandKing;
    static boolean direSandKing;
    static String nazwaSandKing;
   
    public void tworzenieSandKing(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Sand King");
        setBackground(new Color(153, 0, 0));
        setIcon(icon24);
        setRolloverIcon(new ImageIcon(imgSandKing2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSandKing = false;
        direSandKing = false;
        nazwaSandKing = "Sand King";   
    }
}
