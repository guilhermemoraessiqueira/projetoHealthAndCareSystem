/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Menu.MenuPrincipal;

import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import projetoa3.Tela.NFrame;

/**
 *
 * @author Guilherme
 */
public class MenuPrincipalButton extends MenuPrincipalLabel{
     
    JButton B1, B2, B3;
    
    public MenuPrincipalButton(){
        
        B1 = new JButton("Administrador");
        B1.setSize(115, 40);
        B1.setLocation( 10, 510);
        B1.setMnemonic(KeyEvent.VK_I);
        
        B2 = new JButton("Atendimento");
        B2.setSize(180, 60);
        B2.setLocation(160, 150);
        B2.setMnemonic(KeyEvent.VK_A);
        B2.setFont(new Font ("Arial", Font.BOLD, 23));
        
        B3 = new JButton("Consultar fila");
        B3.setSize(180, 60);
        B3.setLocation(160, 220);
        B3.setMnemonic(KeyEvent.VK_C);
        B3.setFont(new Font ("Arial", Font.BOLD, 20));
        
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        
    }
    
     /* public static void main(String arg[])
		{
			new MenuPrincipalButton().show();
		}*/
    
}
