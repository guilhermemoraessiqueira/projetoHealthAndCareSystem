/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Menu.MenuPaciente;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin.NFrameLogin;

/**
 *
 * @author Guilherme
 */
public class MenuPacienteButton extends MenuPacienteText{
    
    JButton B1, B2, B3;
    
    public MenuPacienteButton() {

        B1 = new JButton("Voltar");
        B1.setSize(70, 20);
        B1.setLocation(5, 145);
        B1.setMnemonic(KeyEvent.VK_I);

        B2 = new JButton("Continuar");
        B2.setSize(90, 30);
        B2.setLocation(60, 105);
        B2.setMnemonic(KeyEvent.VK_A);

        B3 = new JButton("Canelar");
        B3.setSize(90, 30);
        B3.setLocation(160, 105);
        B3.setMnemonic(KeyEvent.VK_C);
    
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
    
}
    public static void main(String arg[]) {
        NFrameLogin Fx = new MenuPacienteButton();
        Fx.show();
    }
    
}
