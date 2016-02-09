
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class KeeperOfTheLight extends PrzyciskBohatera{
    
   static URL imgKeeperOfTheLight = KeeperOfTheLight.class.getResource("keeperofthelight.png");
   static URL imgKeeperOfTheLight2 = KeeperOfTheLight.class.getResource("keeperofthelight2.png");
    
   static ImageIcon icon88  = new ImageIcon(imgKeeperOfTheLight);
   
    static boolean radiantKeeperOfTheLight;
    static boolean direKeeperOfTheLight;
    static String nazwaKeeperOfTheLight;
   
    public void tworzenieKeeperOfTheLight(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Keeper Of The Light");
        setBackground(new Color(0, 102, 204));
        setIcon(icon88);
        setRolloverIcon(new ImageIcon(imgKeeperOfTheLight2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantKeeperOfTheLight = false;
        direKeeperOfTheLight = false;
        nazwaKeeperOfTheLight = "Keeper Of The Light";
            
    }
}
