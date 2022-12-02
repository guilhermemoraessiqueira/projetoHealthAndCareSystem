/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaIncluirAtendimento;

import java.awt.event.KeyEvent;
import javax.swing.JButton;

/**
 *
 * @author Guilherme
 */
public class incluirAttButton extends incluirAttCheckBox {

    JButton B1, B2, B3;

    public incluirAttButton() {
        B1 = new JButton("Incluir");
        B1.setSize(80, 40);
        B1.setLocation(130, 210);
        B1.setMnemonic(KeyEvent.VK_I);

        B2 = new JButton("Cancelar");
        B2.setSize(100, 40);
        B2.setLocation(220, 210);
        B2.setMnemonic(KeyEvent.VK_A);

        B3 = new JButton("Voltar");
        B3.setSize(70, 20);
        B3.setLocation(2, 250);
        B3.setMnemonic(KeyEvent.VK_C);

        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);

    }

    public static void main(String arg[]) {
        new incluirAttButton().show();
    }

}
    
