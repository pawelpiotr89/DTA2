package dta2;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
/**
 *
 * @author Roxven
 */
public class WybranaDruzyna extends JButton{
    
    
    public void tworzenieWybranaDruzyna(){
        
        setOpaque(true);
        setBackground(new Color(255, 255, 255));
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(45, 240));
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setToolTipText("Your Team");
          
    }
}