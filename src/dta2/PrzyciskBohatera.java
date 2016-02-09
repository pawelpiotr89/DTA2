       
package dta2;


import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author Roxven
 */
public class PrzyciskBohatera extends JButton{
    
    
   
    public void tworzeniePrzyciskuBohatera(){
     
     setPreferredSize(new Dimension(45, 60));
     setBorder(null);
     setBorderPainted(false);
     setContentAreaFilled(false);
     setFocusPainted(false);
     setOpaque(true);
     setContentAreaFilled(false);
     setBorder(BorderFactory.createEmptyBorder());
     setMargin(new Insets(0, 0, 0, 0));
     requestFocusInWindow();
      
     }        
}
           
        


  
