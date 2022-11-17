/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.Tela.NFrame;
import projetoa3.Tela.telaCadastroAdm.AplicacaoButton;

/**
 *
 * @author Guilherme
 */
public class AplicacaoEventoLogin extends AplicacaoButtonLogin implements ActionListener
	{
		public AplicacaoEventoLogin()
		{
			B1.addActionListener(this);// Adiciona ações ao botão
			B2.addActionListener(this);
			
			
		}
		public void actionPerformed(ActionEvent e)//
		{
			if(e.getSource()==B1)
			{
				//JOptionPane.showMessageDialog(null, "Cadastro de Administrado:  \n Usuário: \n CPF: \n Nome \n ");
                                JOptionPane.showMessageDialog(null, "B1 LOGIN");
				
                               // Curso curso = new Curso(Integer.parseInt(Tx1.getText()),Tx2.getText(),Integer.parseInt(Tx3.getText()));
	    	               
			}
			if(e.getSource()==B2)
			{
			
                        
                            
			JOptionPane.showMessageDialog(null, "B2 CANCELAR");
                        
                        
			Tx1.setText(" ");
			Tx2.setText(" ");
                     
			
			}
		}

		public static void main ( String arg[])
		{
			NFrameLogin Fx = new AplicacaoEventoLogin();
			Fx. show();
		}

       
}
