
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Roxven
 */
public class DirePostac4 extends JButton {
    
    static URL imgDP4 = DirePostac4.class.getResource("direPostac4.png");
    
    static ImageIcon dP4  = new ImageIcon(imgDP4);
    
    static boolean direPostacD;
    static String direNazwa4;
  
    public void tworzenieDirePostac4(){
        
     direPostacD = false;
     direNazwa4 = "";
       
     setBorder(null);
     setIcon(dP4);
     setDisabledIcon(dP4);
     setOpaque(true);
     setBackground(new Color(153, 0, 0));
     setEnabled(false);
     setToolTipText("Dire 4th Hero");
     
    }
}
