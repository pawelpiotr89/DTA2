
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class SkywrathMage extends PrzyciskBohatera{
    
    static URL imgSkywrathMage = SkywrathMage.class.getResource("skywrathmage.png");
   static URL imgSkywrathMage2 = SkywrathMage.class.getResource("skywrathmage2.png");
    
   static ImageIcon icon89 = new ImageIcon(imgSkywrathMage);
   
    static boolean radiantSkywrathMage;
    static boolean direSkywrathMage;
    static String nazwaSkywrathMage;
   
    public void tworzenieSkywrathMage(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Skywrath Mage");
        setBackground(new Color(0, 102, 204));
        setIcon(icon89);
        setRolloverIcon(new ImageIcon(imgSkywrathMage2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantSkywrathMage = false;
        direSkywrathMage = false;
        nazwaSkywrathMage = "Skywrath Mage";
            
    }
}
