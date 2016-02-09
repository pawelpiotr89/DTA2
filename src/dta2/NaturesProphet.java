
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class NaturesProphet extends PrzyciskBohatera{
    
    static URL imgNaturesProphet = NaturesProphet.class.getResource("naturesprophet.png");
   static URL imgNaturesProphet2 = NaturesProphet.class.getResource("naturesprophet2.png");
    
   static ImageIcon icon79 = new ImageIcon(imgNaturesProphet);
   
    static boolean radiantNaturesProphet;
    static boolean direNaturesProphet;
    static String nazwaNaturesProphet;
   
    public void tworzenieNaturesProphet(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Natures Prophet");
        setBackground(new Color(0, 102, 204));
        setIcon(icon79);
        setRolloverIcon(new ImageIcon(imgNaturesProphet2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantNaturesProphet = false;
        direNaturesProphet = false;
        nazwaNaturesProphet = "Natures Prophet";
            
    }
}
