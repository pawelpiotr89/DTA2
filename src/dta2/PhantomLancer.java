
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class PhantomLancer extends PrzyciskBohatera{
    
    static URL imgPhantomLancer = PhantomLancer.class.getResource("phantomlancer.png");
   static URL imgPhantomLancer2 = PhantomLancer.class.getResource("phantomlancer2.png");
    
   static ImageIcon icon42 = new ImageIcon(imgPhantomLancer);
   
    static boolean radiantPhantomLancer;
    static boolean direPhantomLancer;
    static String nazwaPhantomLancer;
   
    public void tworzeniePhantomLancer(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Phantom Lancer");
        setBackground(new Color(76, 153, 0));
        setIcon(icon42);
        setRolloverIcon(new ImageIcon(imgPhantomLancer2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantPhantomLancer = false;
        direPhantomLancer = false;
        nazwaPhantomLancer = "Phantom Lancer";
            
    }
}