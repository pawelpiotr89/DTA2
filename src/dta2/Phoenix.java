
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Phoenix extends PrzyciskBohatera{
    
    static URL imgPhoenix = Phoenix.class.getResource("phoenix.png");
   static URL imgPhoenix2 = Phoenix.class.getResource("phoenix2.png");
    
   static ImageIcon icon21 = new ImageIcon(imgPhoenix);
   
    static boolean radiantPhoenix;
    static boolean direPhoenix;
    static String nazwaPhoenix;
   
    public void tworzeniePhoenix(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Phoenix");
        setBackground(new Color(153, 0, 0));
        setIcon(icon21);
        setRolloverIcon(new ImageIcon(imgPhoenix2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantPhoenix = false;
        direPhoenix = false;
        nazwaPhoenix = "Phoenix";
        
    }
}
