
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Venomancer extends PrzyciskBohatera{

   static URL imgVenomancer = Venomancer.class.getResource("venomancer.png");
   static URL imgVenomancer2 = Venomancer.class.getResource("venomancer2.png");
   
   static ImageIcon icon58 = new ImageIcon(imgVenomancer);
   
    static boolean radiantVenomancer;
    static boolean direVenomancer;
    static String nazwaVenomancer;
   
    public void tworzenieVenomancer(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Venomancer");
        setBackground(new Color(76, 153, 0));
        setIcon(icon58);
        setRolloverIcon(new ImageIcon(imgVenomancer2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantVenomancer = false;
        direVenomancer = false;
        nazwaVenomancer = "Venomancer";
            
    }
}