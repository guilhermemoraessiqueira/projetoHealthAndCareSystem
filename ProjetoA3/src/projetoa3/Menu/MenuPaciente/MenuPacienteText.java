/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Menu.MenuPaciente;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import projetoa3.Tela.NFrame;
import projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin.NFrameLogin;

/**
 *
 * @author Guilherme
 */
public class MenuPacienteText extends MenuPacienteLabel{

    public JTextField Tx1;

    public MenuPacienteText() {
        Tx1 = new JTextField();
        this.Tx1 = Tx1;
        Tx1.setBounds(80, 80, 150, 20);

        getContentPane().add(Tx1);


    }
    public static void main(String arg[]) {
        NFrameLogin Fx = new MenuPacienteText();
        Fx.show();
    }

}

