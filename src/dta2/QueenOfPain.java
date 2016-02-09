
package dta2;

import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class QueenOfPain extends PrzyciskBohatera{
    
    static URL imgQueenOfPain = QueenOfPain.class.getResource("queenofpain.png");
   static URL imgQueenOfPain2 = QueenOfPain.class.getResource("queenofpain2.png");
    
   static ImageIcon icon99 = new ImageIcon(imgQueenOfPain);
   
    static boolean radiantQueenOfPain;
    static boolean direQueenOfPain;
    static String nazwaQueenOfPain;
   
    public void tworzenieQueenOfPain(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Queen Of Pain");
        setBackground(new Color(0, 102, 204));
        setIcon(icon99);
        setRolloverIcon(new ImageIcon(imgQueenOfPain2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantQueenOfPain = false;
        direQueenOfPain = false;
        nazwaQueenOfPain = "Queen Of Pain";
            
    }
}
