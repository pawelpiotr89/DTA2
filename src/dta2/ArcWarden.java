
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class ArcWarden extends PrzyciskBohatera{
    
   static URL imgArcWarden = ArcWarden.class.getResource("arcwarden.png");
   static URL imgArcWarden2 = ArcWarden.class.getResource("arcwarden2.png");
    
   static ImageIcon icon112  = new ImageIcon(imgArcWarden);
   
    static boolean radiantArcWarden;
    static boolean direArcWarden;
    static String nazwaArcWarden;
   
    public void tworzenieArcWarden(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Arc Warden");
        setBackground(new Color(76, 153, 0));
        setIcon(icon112);
        setRolloverIcon(new ImageIcon(imgArcWarden2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantArcWarden = false;
        direArcWarden = false;
        nazwaArcWarden = "Arc Warden";     
    }
    
}