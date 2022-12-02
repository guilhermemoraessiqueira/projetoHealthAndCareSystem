/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaIncluirAtendimento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import projetoa3.Menu.MenuPaciente.MenuPacienteEvento;
import projetoa3.Tela.NFrame;

/**
 *
 * @author Guilherme
 */
public class incluirAttEvento extends incluirAttButton implements ActionListener{
    
    public incluirAttEvento(){
        B1.addActionListener((ActionListener) this);// voltar
        B2.addActionListener((ActionListener) this);// continuar
        B3.addActionListener((ActionListener) this);// cancelar    
        }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == B1) {//B INCLUIR
            JOptionPane.showMessageDialog(null, "INCLUIDO");

        }if (e.getSource() == B2) {//B CANCELAR
            JOptionPane.showMessageDialog(null, "CADASTRAR");

        }if (e.getSource() == B3) { //B VOLTAR
            MenuPacienteEvento telaAnterior = new MenuPacienteEvento();
            telaAnterior.setVisible(true);
            this.dispose();
            

        }
        
    }public static void main(String arg[]) {
        NFrame Fx = new incluirAttEvento();
        Fx.show();
    }
    }
    

    
    
    
