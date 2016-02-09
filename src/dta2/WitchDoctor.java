
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class WitchDoctor extends PrzyciskBohatera{
    
    static URL imgWitchDoctor = WitchDoctor.class.getResource("witchdoctor.png");
   static URL imgWitchDoctor2 = WitchDoctor.class.getResource("witchdoctor2.png");
    
   static ImageIcon icon95 = new ImageIcon(imgWitchDoctor);
   
    static boolean radiantWitchDoctor;
    static boolean direWitchDoctor;
    static String nazwaWitchDoctor;
   
    public void tworzenieWitchDoctor(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Witch Doctor");
        setBackground(new Color(0, 102, 204));
        setIcon(icon95);
        setRolloverIcon(new ImageIcon(imgWitchDoctor2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantWitchDoctor = false;
        direWitchDoctor = false;
        nazwaWitchDoctor = "Witch Doctor";
            
    }
}