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
                        // TODO add your handling code here:

                        //pega o login do usuário
                        String usuario = Tx1.getText();
                        //pega a senha do usuário
                        String senha = new String(Tx2.getText());

                        try {
                            //verifica se o usuário é válido
                            Administrador administrador = new Administrador(usuario, senha);
                            AdministradorDAO dao = new AdministradorDAO();

                            if (dao.existe(Administrador)) {
                                JOptionPane.showMessageDialog(null, "Bem vindo, " + usuario.getNome() + "!");
                                /*CRUDTela t = new CRUDTela();
                                t.setVisible(true);
                                this.dispose();*/
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuário inválido.");
                            }
                        } catch (Exception e) {
                            // Não é necessário essa parte
                            JOptionPane.showMessageDialog(null, "Problemas técnicos");
                        }
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
