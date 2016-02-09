package dta2;

import java.awt.Color;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
/**
 *
 * @author Roxven
 */
public class RatioInfo extends JButton{
    
    static URL imgRatioInfo = RatioInfo.class.getResource("ratiooff.png");
    
    ImageIcon iconROFF  = new ImageIcon(imgRatioInfo);
   
    public void tworzenieRatioInfo(){
        
        setOpaque(true);
        setBackground(new Color(255, 255, 255));
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(45, 240));
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setToolTipText("Heroes win ratio");
        setIcon(iconROFF);
          
    }
}
