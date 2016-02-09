
package dta2;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class Io extends PrzyciskBohatera{
    
    static URL imgIo = Io.class.getResource("io.png");
   static URL imgIo2 = Io.class.getResource("io2.png");
    
   static ImageIcon icon13  = new ImageIcon(imgIo);
   
    static boolean radiantIo;
    static boolean direIo;
    static String nazwaIo;
   
    public void tworzenieIo(){
   
        super.tworzeniePrzyciskuBohatera(); 
        setToolTipText("Io");
        setBackground(new Color(153, 0, 0));
        setIcon(icon13);
        setRolloverIcon(new ImageIcon(imgIo2));
        setRolloverEnabled(true);
        setEnabled(true);
        
        radiantIo = false;
        direIo = false;
        nazwaIo = "Io";   
    }
}