package projetoa3.Tela.telaCadastroPaciente;


import projetoa3.Tela.NFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.bancoDeDados.AdministradorDAO;
import projetoa3.Tela.NFrame;
import projetoa3.bancoDeDados.conexao;

/**
 *
 * @author Guilherme
 */
public class AplicacaoEventoCadast extends AplicacaoButtonCadastroPaciente implements ActionListener{
        
            Administrador administrador = new Administrador();
            conexao conn = new conexao();
            AdministradorDAO administradorDAO;
            
    
		public AplicacaoEventoCadast()
		{
                 
                    //---------------------------------------------------------------------------
                    
			B1.addActionListener(this);// Adiciona ações ao botão
			B2.addActionListener(this);
			B3.addActionListener(this);
                        this.setResizable(false);
			
			
		}
		public void actionPerformed(ActionEvent e)//
		{
			if(e.getSource()==B1)
			{
                            administrador.setCpf(Tx1.getText());
                            System.out.println(administrador.getCpf());
                            
                                
     
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
