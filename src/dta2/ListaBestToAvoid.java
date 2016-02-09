
package dta2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;

/**
 *
 * @author Roxven
 */
public class ListaBestToAvoid extends JComboBox {
    
    public void tworzenieListaBestToAvoid(){
       
        setBackground(new Color(255, 0, 0));
        setBorder(null);
        setOpaque(true);
        setBackground(new Color(255, 255, 255));
        setForeground(new Color(255, 0, 0));
        setFont(new Font("Candara", Font.BOLD, 16));
        setToolTipText("Heroes best to avoid");
        setMaximumRowCount(5);
        
    }
    
}