
package dta2;

import java.awt.*;
import static java.awt.Color.white;
import java.io.FileNotFoundException;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Roxven
 */
public class RamkaProgramu extends JFrame {
    
    PanelGlowny panel1 = new PanelGlowny();
    
    URL imgRamkaProgramu = RamkaProgramu.class.getResource("Icon.png");

    Image img = new ImageIcon(imgRamkaProgramu).getImage();
    
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
      
        int wysokosc = screenSize.height;
        int szerokosc = screenSize.width; 
        int zmniejszacz = 270;
        int wartoscB = wysokosc-zmniejszacz;
        int wysokoscEkranu = 1080;
        int szerokoscEkranu = 1920;
    
    
    
    
    public void tworzenieramkiProgramu() throws FileNotFoundException{
        
        //
        //
        // program przeznaczony tylko dla rozdzielczosci 1920 x 1080
        // jezeli rozdzielczosc monitora jest inna program sie wylaczy
        //
        //
        if(szerokosc < szerokoscEkranu & szerokosc > szerokoscEkranu){
         
            System.exit(0);
            
        }
        
 
        setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new Dimension(szerokoscEkranu,zmniejszacz));
        setResizable(false);
        setLocation(0,wartoscB);
        setTitle("BestPicker v1.0 (Beta)");
        setIconImage(img);
        
        
        panel1.tworzeniePaneluGlownego();
        panel1.setBackground(white);
        add(panel1);
        pack();
        setVisible(true);
        
    }
    }
  

    
    


