
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Lycan extends PrzyciskBohatera{
    
    static URL imgLycan = Lycan.class.getResource("lycan.png");
   static URL imgLycan2 = Lycan.class.getResource("lycan2.png");
    
   static ImageIcon icon32 = new ImageIcon(imgLycan);
   
    static boolean radiantLycan;
    static boolean direLycan;
    static String nazwaLycan;
   
    public void tworzenieLycan(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Lycan");
        setBackground(new Color(153, 0, 0));
        setIcon(icon32);
        setRolloverIcon(new ImageIcon(imgLycan2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLycan = false;
        direLycan = false;
        nazwaLycan = "Lycan";    
    }
}