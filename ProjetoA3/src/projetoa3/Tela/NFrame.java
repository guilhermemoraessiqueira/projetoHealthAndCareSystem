/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Guilherme
 */
public class NFrame extends JFrame {
    
    
        
    
    public NFrame(){
        
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone.png")).getImage());
        Color cor_borda = new Color(173, 216, 230);
        
        Container c = getContentPane();
        setLocation(100,50);
        setTitle("Health and Care System");
        setSize (500, 600);
        setUndecorated(true);
        c.setBackground (cor_borda);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
           
    
    }
           public static void main(String arg[]){
           new NFrame().show();


            }
    
}
