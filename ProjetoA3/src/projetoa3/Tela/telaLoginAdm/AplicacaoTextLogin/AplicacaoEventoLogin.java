package projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin;

import projetoa3.Administrador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import projetoa3.Menu.MenuPrincipal.MenuPrincipalEvento;
import projetoa3.bancoDeDados.AdministradorDAO;
import projetoa3.Tela.telaCadastroAdm.AplicacaoEvento;

public class AplicacaoEventoLogin extends AplicacaoButtonLogin implements ActionListener
	{
    
    
    
    
		public AplicacaoEventoLogin()
		{
			B1.addActionListener(this);// login
			B2.addActionListener(this);//cancelar
                        this.setResizable(false);
			
			
		}
		public void actionPerformed(ActionEvent e)//
		{
                    
                     
                   
			if (e.getSource() == B1) {
                            
                        //pega o usuario do usuário
                        String usuario = Tx1.getText();
                        //pega a senha do usuário
                        String senha = new String(Tx2.getPassword());
                            

                        try {
                            //verifica se o usuário é válido
                            Administrador administrador = new Administrador(usuario, senha);
                            AdministradorDAO dao = new AdministradorDAO();
                            System.out.println(senha);

                            if (dao.existe(administrador)) {
                                JOptionPane.showMessageDialog(null, "Bem vindo, " + administrador.getUsuario() + "!");
                                AplicacaoEvento t = new AplicacaoEvento();
                                t.setVisible(true);
                                
                                
                                
                                //AplicacaoEvento t = new AplicacaoEvento();
                               // t.setVisible(true);
                                //this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuário inválido.");
                            }
                        } catch (Exception es) {
                            // Não é necessário essa parte
                            JOptionPane.showMessageDialog(null, "Problemas técnicos");
                        }
                    }
                        
			if(e.getSource()==B2)
			{  
			JOptionPane.showMessageDialog(null, "B2 CANCELAR");
                            MenuPrincipalEvento telaAnterior = new MenuPrincipalEvento();
                            telaAnterior.setVisible(true);
                            this.dispose();
                        
			Tx1.setText("");
			Tx2.setText("");
			}       
		}

		public static void main ( String arg[]){
			NFrameLogin Fx = new AplicacaoEventoLogin();
			Fx. show();
}       
}
