
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Roxven
 */
public class DirePostac2 extends JButton {
    
    static URL imgDP2 = DirePostac2.class.getResource("direPostac2.png");
    
    static ImageIcon dP2  = new ImageIcon(imgDP2);
   
    static boolean direPostacB;
    static String direNazwa2;
  
    public void tworzenieDirePostac2(){
        
     direPostacB = false;
     direNazwa2 = "";
       
     setBorder(null);
     setIcon(dP2);
     setDisabledIcon(dP2);
     setOpaque(true);
     setBackground(new Color(153, 0, 0));
     setEnabled(false);
     setToolTipText("Dire 2nd Hero");
     
    }
}
