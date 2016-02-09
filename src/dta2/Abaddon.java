package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Abaddon extends PrzyciskBohatera{
   
   static URL imgAbaddon = Abaddon.class.getResource("abaddon.png");
   static URL imgAbaddon2 = Abaddon.class.getResource("abaddon2.png");
    
   static ImageIcon icon36  = new ImageIcon(imgAbaddon);
   
    static boolean radiantAbaddon;
    static boolean direAbaddon;
    static String nazwaAbaddon;
   
    public void tworzenieAbaddon(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Abaddon");
        setBackground(new Color(153, 0, 0));
        setIcon(icon36);
        setRolloverIcon(new ImageIcon(imgAbaddon2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantAbaddon = false;
        direAbaddon = false;
        nazwaAbaddon = "Abaddon";    
    }
    
}