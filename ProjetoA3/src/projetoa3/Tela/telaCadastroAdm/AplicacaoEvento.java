/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaCadastroAdm;

import projetoa3.Tela.NFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.Tela.NFrame;

/**
 *
 * @author Guilherme
 */
public class AplicacaoEvento extends AplicacaoButton implements ActionListener
	{
		AplicacaoEvento()
		{
			B1.addActionListener(this);// Adiciona ações ao botão
			B2.addActionListener(this);
			B3.addActionListener(this);
			B4.addActionListener(this);
			B5.addActionListener(this);
			B6.addActionListener(this);
			
		}
		public void actionPerformed(ActionEvent e)//
		{
			if(e.getSource()==B1)
			{
				//JOptionPane.showMessageDialog(null, "Cadastro de Administrado:  \n Usuário: \n CPF: \n Nome \n ");
                                JOptionPane.showMessageDialog(null, "Cadastro do Administrado: \n Usuário: "+ Tx1.getText() + "\n CPF: " + Tx2.getText() + "\n Nome: " + Tx3.getText());
                                Administrador administrador = new Administrador(Tx1.getText(), Tx2.getText(), parseInt(Tx3.getText()), Tx4.getText());
				
                               // Curso curso = new Curso(Integer.parseInt(Tx1.getText()),Tx2.getText(),Integer.parseInt(Tx3.getText()));
	    	                System.out.println("Usuário: "+ administrador.getUsuario()+ " CPF " + administrador.getCpf()+ " Nome " + administrador.getNome());
     
			}
			if(e.getSource()==B2)
			{
			
                        
                            
			JOptionPane.showMessageDialog(null, "Altere o que você precisa");
                        
                        
			Tx1.setText(" ");
			Tx2.setText(" ");
                     
			
			}
			if (e.getSource() == B3)
			{
				JOptionPane.showMessageDialog(null, "Botao 3");	
			}

			if(e.getSource()==B4)
			{
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
