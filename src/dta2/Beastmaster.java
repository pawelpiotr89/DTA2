package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Beastmaster extends PrzyciskBohatera{
    
    static URL imgBeastmaster = Beastmaster.class.getResource("beastmaster.png");
   static URL imgBeastmaster2 = Beastmaster.class.getResource("beastmaster2.png");
    
   static ImageIcon icon6  = new ImageIcon(imgBeastmaster);
   
    static boolean radiantBeastmaster;
    static boolean direBeastmaster;
    static String nazwaBeastmaster;
   
    public void tworzenieBeastmaster(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Beastmaster");
        setBackground(new Color(153, 0, 0));
        setIcon(icon6);
        setRolloverIcon(new ImageIcon(imgBeastmaster2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantBeastmaster = false;
        direBeastmaster = false;
        nazwaBeastmaster = "Beastmaster";
            
    }
}