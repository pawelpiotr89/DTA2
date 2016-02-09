
package dta2;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class DragonKnight extends PrzyciskBohatera{
   
    static URL imgDragonKnight = DragonKnight.class.getResource("dragonknight.png");
   static URL imgDragonKnight2 = DragonKnight.class.getResource("dragonknight2.png");
    
   static ImageIcon icon7  = new ImageIcon(imgDragonKnight);
   
    static boolean radiantDk;
    static boolean direDk;
    static String nazwaDk;
   
    public void tworzenieDragonKnight(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Dragon Knight");
        setBackground(new Color(153, 0, 0));
        setIcon(icon7);
        setRolloverIcon(new ImageIcon(imgDragonKnight2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantDk = false;
        direDk = false;
        nazwaDk = "Dragon Knight";
            
    }
}