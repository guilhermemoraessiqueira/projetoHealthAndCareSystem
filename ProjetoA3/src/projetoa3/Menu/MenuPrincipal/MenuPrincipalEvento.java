/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Menu.MenuPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import projetoa3.Menu.MenuPaciente.MenuPacienteEvento;
import projetoa3.Tela.NFrame;
import projetoa3.Tela.telaCadastroPaciente.AplicacaoEventoCadast;
import projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin.AplicacaoEventoLogin;

/**
 *
 * @author Guilherme
 */
public class MenuPrincipalEvento extends MenuPrincipalButton  implements ActionListener {
    
    public MenuPrincipalEvento() {
        B1.addActionListener(this);// incluir
        B2.addActionListener(this);// alterar
        B3.addActionListener(this);
        this.setResizable(false);

    }

   
    //ADMINISTRATIVO
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
               JOptionPane.showMessageDialog(null,"B1");
               AplicacaoEventoLogin t = new AplicacaoEventoLogin(); 
                t.setVisible(true);
                this.dispose();
        }

        if (e.getSource() == B2) {
            JOptionPane.showMessageDialog(null, "B2");
            MenuPacienteEvento t = new MenuPacienteEvento();
            t.setVisible(true);
            this.dispose();

        }

        
        //BOTAO 3 PARA CONSULTAR
        if (e.getSource() == B3) {
            JOptionPane.showMessageDialog(null,"VAI PARA FILA");
            
        }        
    }

    public static void main(String arg[]) {
        NFrame Fx = new MenuPrincipalEvento();
        Fx.show();
    }

}