package projetoa3.Tela.telaCadastroPaciente;

import projetoa3.Tela.NFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.Tela.NFrame;

/**
 *
 * @author Guilherme
 */
public class AplicacaoEventoCadast extends AplicacaoButtonCadastroPaciente{
        
    
		public AplicacaoEventoCadast()
		{
                 
                    //---------------------------------------------------------------------------
                    
			B1.addActionListener(this);// Adiciona ações ao botão
			B2.addActionListener(this);
			B3.addActionListener(this);
			
			
		}
		public void actionPerformed(ActionEvent e)//
		{
			if(e.getSource()==B1)
			{
				//JOptionPane.showMessageDialog(null, "Cadastro de Administrado:  \n Usuário: \n CPF: \n Nome \n ");
                                JOptionPane.showMessageDialog(null, "B1");
                                
     
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

			

		}

		public static void main ( String arg[])
		{
                    
			NFrame Fx = new AplicacaoEventoCadast();
			Fx. show();
		}

       
}
