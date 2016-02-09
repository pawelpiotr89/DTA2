
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Roxven
 */
public class DirePostac5 extends JButton {
    
    static URL imgDP5 = DirePostac5.class.getResource("direPostac5.png");
    
    static ImageIcon dP5  = new ImageIcon(imgDP5);
    
    static boolean direPostacE;
    static String direNazwa5;
  
    public void tworzenieDirePostac5(){
        
     direPostacE = false;
     direNazwa5 = "";
       
     setBorder(null);
     setIcon(dP5);
     setDisabledIcon(dP5);
     setOpaque(true);
     setBackground(new Color(153, 0, 0));
     setEnabled(false);
     setToolTipText("Dire 5th Hero");
     
    }
}
