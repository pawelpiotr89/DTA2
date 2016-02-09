
package dta2;

import java.awt.Color;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Roxven
 */
public class WinRatioPrzycisk extends JButton {
    
    static URL imgWinRatioPrzycisk1 = WinRatioPrzycisk.class.getResource("addwinratio.png");
    static URL imgWinRatioPrzycisk2 = WinRatioPrzycisk.class.getResource("removewinratio.png");
    static URL imgWinRatioPrzycisk3 = WinRatioPrzycisk.class.getResource("addwinratio1.png");
    static URL imgWinRatioPrzycisk4 = WinRatioPrzycisk.class.getResource("removewinratio1.png");
    static URL imgWinRatioPrzycisk5 = WinRatioPrzycisk.class.getResource("addwinratio2.png");
    static URL imgWinRatioPrzycisk6 = WinRatioPrzycisk.class.getResource("removewinratio2.png");
    
    static ImageIcon awr  = new ImageIcon(imgWinRatioPrzycisk1);
    static ImageIcon rwr  = new ImageIcon(imgWinRatioPrzycisk2);
    static ImageIcon awr1  = new ImageIcon(imgWinRatioPrzycisk3);
    static ImageIcon rwr1  = new ImageIcon(imgWinRatioPrzycisk4);
    static ImageIcon awr2  = new ImageIcon(imgWinRatioPrzycisk5);
    static ImageIcon rwr2  = new ImageIcon(imgWinRatioPrzycisk6);
    
    static boolean przyciskAdd = false;
 
    public void tworzenieWinRatioPrzycisk(){
        
        setOpaque(true);
        setBackground(new Color(255, 255, 255));
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(45, 240));
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
     
     
    }  
}

class AddWRP extends WinRatioPrzycisk{
    
    public void tworzenieAddWRP(){
        
         super.tworzenieWinRatioPrzycisk();
         setIcon(awr);
         setDisabledIcon(awr2);
         setToolTipText("Add Win Ratio to Pick and Avoid Index");
         setRolloverIcon(awr1);
         setRolloverEnabled(true);
         
    }
}

class RemoveWRP extends WinRatioPrzycisk{
    
    public void tworzenieRemoveWRP(){
        
         super.tworzenieWinRatioPrzycisk();
         setIcon(rwr);
         setDisabledIcon(rwr2);
         setToolTipText("Remove Win Ratio from Pick and Avoid Index");
         setRolloverIcon(rwr1);
         setRolloverEnabled(true);
         
    }
}

