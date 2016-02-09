/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dta2;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author Roxven
 */
public class DirePoleTekstowe extends JTextField {
    
 
    public void tworzenieDirePoleTekstowe(){
        
        setBackground(new Color(255, 255, 255));
        setForeground(new Color(0, 0, 0));
        setFont(new Font("Calibri", Font.BOLD, 18));
        setToolTipText("Dire win chance as 5 heroes team");
        setBorder(null);
        setOpaque(true);
        setEditable(false);
        
    }
    
}