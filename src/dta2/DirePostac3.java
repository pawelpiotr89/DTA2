
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Roxven
 */
public class DirePostac3 extends JButton {
    
    static URL imgDP3 = DirePostac3.class.getResource("direPostac3.png");
    
    static ImageIcon dP3  = new ImageIcon(imgDP3);
    
    static boolean direPostacC;
    static String direNazwa3;
  
    public void tworzenieDirePostac3(){
        
     direPostacC = false;
     direNazwa3 = "";
       
     setBorder(null);
     setIcon(dP3);
     setDisabledIcon(dP3);
     setOpaque(true);
     setBackground(new Color(153, 0, 0));
     setEnabled(false);
     setToolTipText("Dire 3rd Hero");
     
    }
}
