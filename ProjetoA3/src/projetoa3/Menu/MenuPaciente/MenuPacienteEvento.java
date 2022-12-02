/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Menu.MenuPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projetoa3.Paciente;
import projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin.NFrameLogin;
import projetoa3.bancoDeDados.PacienteDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import projetoa3.Menu.MenuPrincipal.MenuPrincipalEvento;
import projetoa3.Tela.telaCadastroPaciente.AplicacaoEventoCadast;
import projetoa3.Tela.telaIncluirAtendimento.incluirAttEvento;

/**
 *
 * @author Guilherme
 */
public class MenuPacienteEvento extends MenuPacienteButton implements ActionListener {

    
    public MenuPacienteEvento(){
        B1.addActionListener((ActionListener) this);// voltar
        B2.addActionListener((ActionListener) this);// continuar
        B3.addActionListener((ActionListener) this);// cancelar
        this.setResizable(false);
        
        }
    
     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == B1) {
            MenuPrincipalEvento telaAnterior = new MenuPrincipalEvento();
            telaAnterior.setVisible(true);
            this.dispose();
        }
         if (e.getSource() == B2) {
             
             try {
                 String cpf = Tx1.getText();

                 Paciente paciente = new Paciente();
                 paciente.setCpf(cpf);

                 PacienteDAO dao = new PacienteDAO();
                 ResultSet rs = dao.atutenticacaoCpf(paciente);
                 
                 if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "VAI PARA TELA DE INCLUIR ATENDIMENTO");
                    incluirAttEvento telaAnterior = new incluirAttEvento();
                    telaAnterior.setVisible(true);
                    this.dispose();
                                      
                 } else {
                     JOptionPane.showMessageDialog(null, "VAI PARA TELA DE CADASTRO PACIENTE");
                 AplicacaoEventoCadast t = new AplicacaoEventoCadast();
                 t.setVisible(true);
                 this.dispose();
                 }
                 

             } catch (SQLException ea) {
                 JOptionPane.showMessageDialog(null, "ERRO MENU PACIENTE EVENTO");
             }
             
             
             
             

         }
        
        if (e.getSource() == B3) {
        }
        
    
}
  public static void main(String arg[]) {
        NFrameLogin Fx = new MenuPacienteEvento();
        Fx.show();
    }
}
