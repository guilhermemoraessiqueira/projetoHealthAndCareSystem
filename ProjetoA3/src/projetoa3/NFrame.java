/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3;

import java.awt.Color;
import java.awt.Container;
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
        Color cor = new Color(255,255,255);
        
        Container c = getContentPane();
        setLocation(100,50);
        setTitle("Primeira tela!");
        setSize (500, 500);
        setUndecorated(true);
        c.setBackground (cor);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.cyan,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
           
    
    }
           public static void main(String arg[]){
           new NFrame().show();


            }
    
}
