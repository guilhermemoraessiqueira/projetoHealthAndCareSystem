/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaCadastroPaciente;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme
 */
public class AplicacaoTextCadastroPaciente extends AplicacaoLabelCadastroPaciente{
    public JTextField Tx1, Tx2,Tx3,Tx4;
		

		public AplicacaoTextCadastroPaciente()
		{
			Tx1 = new JTextField();
			this.Tx1 = Tx1;
			Tx1.setBounds(190,120,150,20);

			Tx2 = new JPasswordField();
			this.Tx2 = Tx2;
			Tx2.setBounds(190,160,150,20);
                        
                        Tx3 = new JTextField();
			this.Tx3 = Tx3;
			Tx3.setBounds(190,320,150,20);
                        
                        Tx4 = new JTextField();
			this.Tx4 = Tx4;
			Tx4.setBounds(190,240,150,20);

						
			getContentPane().add(Tx1);//NOME
			getContentPane().add(Tx2);//CPF
                        getContentPane().add(Tx3); // SE SIM QUAL
                        getContentPane().add(Tx4); //ENDEREÇO
                         

			
		}

		public static void main(String arg[])
		{
			new AplicacaoTextCadastroPaciente().show();
		}

    
}
