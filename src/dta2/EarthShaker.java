package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.ImageIcon;
/**
 *
 * @author Roxven
 */
public class EarthShaker extends PrzyciskBohatera {
   
   static URL imgES = EarthShaker.class.getResource("es.png");
   URL imgES2 = EarthShaker.class.getResource("es2.png");
   
   static ImageIcon icon1  = new ImageIcon(imgES);
   
    static boolean radiantEs;
    static boolean direEs;
    static String nazwaEs;
   
    public void tworzenieEarthShaker(){
        
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Earth Shaker");
        setBackground(new Color(153, 0, 0));
        setIcon(icon1);
        setRolloverIcon(new ImageIcon(imgES2));
        setRolloverEnabled(true);
        setEnabled(true);
           
        radiantEs = false;
        direEs = false;
        nazwaEs = "Earth Shaker";
}
}
 
