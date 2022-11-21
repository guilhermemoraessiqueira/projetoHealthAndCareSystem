/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaCadastroAdm;

import projetoa3.Tela.NFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.bancoDeDados.AdministradorDAO;
import projetoa3.Tela.NFrame;
import projetoa3.bancoDeDados.conexao;

/**
 *
 * @author Guilherme
 */
public class AplicacaoEvento extends AplicacaoButton implements ActionListener
	{
    
            Administrador administrador = new Administrador();
            conexao conn = new conexao();
            AdministradorDAO administradorBD;
        
            
                        
		public AplicacaoEvento()
		{
			B1.addActionListener(this);// incluir
			B2.addActionListener(this);// alterar
			B3.addActionListener(this);// consultar
			B4.addActionListener(this);// excluir
			B5.addActionListener(this);// sair
			B6.addActionListener(this);// TODOS
			
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==B1)
			{
                            administrador.setUsuario(Tx1.getText());
                            administrador.setSenha(Tx2.getText());
                            administrador.setCpf(Tx3.getText());
                            administrador.setNome(Tx4.getText());
                            
                            System.out.println(administrador.getUsuario());
                            System.out.println(administrador.getSenha());
                            System.out.println(administrador.getCpf());
                            System.out.println(administrador.getNome());
                            
                            try {
                                administradorBD = new AdministradorDAO(conn);
                                administradorBD.altera(administrador);
                            } catch (SQLException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            //confirmação de cadastro
                            JOptionPane.showMessageDialog(null, "Cadastro do Administrado : \n Usuário: "+ Tx1.getText() + "\n CPF: " + Tx2.getText() + "\n Nome: " + Tx3.getText());
                            
                            
                           //conectando no banco e cadastrando
                            
                            

			}
                        //Alterar
			if(e.getSource()==B2)
			{
                            
                            
                            administrador.setUsuario(Tx1.getText());
                            administrador.setSenha(Tx2.getText());
                            administrador.setNome(Tx4.getText());
                            administrador.setCpf(Tx3.getText());
                            
                            try {
                                administradorBD = new AdministradorDAO(conn);
                                administradorBD.altera(administrador);

                            
                            
                            
                            
                            } catch (SQLException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        
			
                     
			
			}
                        
                        //consultar
			if (e.getSource() == B3)
			{
				JOptionPane.showMessageDialog(null, "Botao 3");
                                
                                try {
                            administradorBD = new AdministradorDAO(conn);
                            administrador.setCpf(Tx3.getText());
                            administradorBD.consulta(administrador);
                            
                            Tx1.setText("" + administrador.getUsuario());
                            Tx4.setText("" + administrador.getNome());
                            
                            } catch (SQLException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}

			if(e.getSource()==B4)
			{
                            try {
                            administradorBD = new AdministradorDAO(conn);
                            administrador.setCpf(Tx3.getText());
                            administradorBD.exlcui(administrador);
                            
                            Tx1.setText("" + administrador.getUsuario());
                            Tx4.setText("" + administrador.getNome());
                            
                            } catch (SQLException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            
				JOptionPane.showMessageDialog(null, "Botao 4");	
				
			}

			if (e.getSource() == B5)
			{
				
				this.dispose();
			}
			if (e.getSource() == B6)
			{
				JOptionPane.showMessageDialog(null, "Botao 6");
				
			}

		}

		public static void main ( String arg[])
		{
			NFrame Fx = new AplicacaoEvento();
			Fx. show();
		}

       
}
