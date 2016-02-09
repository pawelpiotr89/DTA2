
package dta2;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Roxven
 */
public class DirePostac1 extends JButton {
    
    static URL imgDP1 = DirePostac1.class.getResource("direPostac1.png");
    
    static ImageIcon dP1  = new ImageIcon(imgDP1);
    
    static boolean direPostacA;
    static String direNazwa1;
  
    public void tworzenieDirePostac1(){
        
        direPostacA = false;
        direNazwa1 = "";
       
     setBorder(null);
     setIcon(dP1);
     setDisabledIcon(dP1);
     setOpaque(true);
     setBackground(new Color(153, 0, 0));
     setEnabled(false);
     setToolTipText("Dire 1st Hero");
     
    }
}
