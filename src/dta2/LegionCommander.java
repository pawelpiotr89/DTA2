
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class LegionCommander extends PrzyciskBohatera{
    
    static URL imgLegionCommander = LegionCommander.class.getResource("legioncommander.png");
   static URL imgLegionCommander2 = LegionCommander.class.getResource("legioncommander2.png");
    
   static ImageIcon icon19  = new ImageIcon(imgLegionCommander);
   
    static boolean radiantLegionCommander;
    static boolean direLegionCommander;
    static String nazwaLegionCommander;
   
    public void tworzenieLegionCommander(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Legion Commander");
        setBackground(new Color(153, 0, 0));
        setIcon(icon19);
        setRolloverIcon(new ImageIcon(imgLegionCommander2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantLegionCommander = false;
        direLegionCommander = false;
        nazwaLegionCommander = "Legion Commander";    
    }
}
