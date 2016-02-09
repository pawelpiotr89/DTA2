
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Pudge extends PrzyciskBohatera{
    
    static URL imgPudge = Pudge.class.getResource("pudge.png");
   static URL imgPudge2 = Pudge.class.getResource("pudge2.png");
    
   static ImageIcon icon23 = new ImageIcon(imgPudge);
   
    static boolean radiantPudge;
    static boolean direPudge;
    static String nazwaPudge;
   
    public void tworzeniePudge(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Pudge");
        setBackground(new Color(153, 0, 0));
        setIcon(icon23);
        setRolloverIcon(new ImageIcon(imgPudge2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantPudge = false;
        direPudge = false;
        nazwaPudge = "Pudge";    
    }
}
