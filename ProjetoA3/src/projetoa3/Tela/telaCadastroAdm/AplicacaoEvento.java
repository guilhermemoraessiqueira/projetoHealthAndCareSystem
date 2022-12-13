package projetoa3.Tela.telaCadastroAdm;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.Menu.MenuPrincipal.MenuPrincipalEvento;
import projetoa3.bancoDeDados.AdministradorDAO;
import projetoa3.Tela.NFrame;
import projetoa3.bancoDeDados.conexao;

public class AplicacaoEvento extends AplicacaoButton implements ActionListener {

    Administrador administrador = new Administrador();
    conexao conn = new conexao();
    AdministradorDAO administradorBD;

    public AplicacaoEvento() {
        B1.addActionListener(this);// incluir
        B2.addActionListener(this);// alterar
        B3.addActionListener(this);// consultar
        B4.addActionListener(this);// excluir
        B5.addActionListener(this);// sair
        B6.addActionListener(this);// TODOS
        this.setResizable(false);

    }

   
    //BOTAO 1 PARA INCLUIR
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            administrador.setUsuario(Tx1.getText());
            administrador.setSenha(Tx2.getText());
            administrador.setCpf(Tx3.getText());
            administrador.setNome(Tx4.getText());

            //confirmação de cadastro
            int resultado = JOptionPane.showConfirmDialog(null, "Cadastro do Administrado : \n Usuário: " + Tx1.getText() + "\n CPF: " + Tx2.getText() + "\n Nome: " + Tx3.getText());
          
            
            if(resultado == JOptionPane.YES_OPTION){
            try {
                administradorBD = new AdministradorDAO(conn);
                administradorBD.insert(administrador);
                          
            } catch (SQLException ex) {
                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
            }
            }if (resultado == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado");
            }

            
            //conectando no banco e cadastrando
        }
        
        
        //BOTAO 2 PARA ALTERAR
        if (e.getSource() == B2) {

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

        
        //BOTAO 3 PARA CONSULTAR
        if (e.getSource() == B3) {
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

        
        //BOTAO 4 PARA EXLCUIR
        if (e.getSource() == B4) {
            try {
                administradorBD = new AdministradorDAO(conn);
                administrador.setCpf(Tx3.getText());
                administradorBD.exlcui(administrador);
                
                Tx1.setText(null);
                Tx2.setText(null);
                Tx3.setText(null);
                Tx4.setText(null);
                
                administrador.setUsuario("");
                administrador.setSenha("");
                administrador.setCpf("");
                administrador.setNome("");

            } catch (SQLException ex) {
                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        
        //BOTAO 5 PARA SAIR
        if (e.getSource() == B5) {
            MenuPrincipalEvento telaInicial = new MenuPrincipalEvento();
            telaInicial.setVisible(true);
            this.dispose();
        }
        
        
        //BOTAO 6 PARA MOSTRAR TODOS
        if (e.getSource() == B6) {
          
         try {
                         
                            administradorBD = new AdministradorDAO(conn);
                            ArrayList dados = administradorBD.listaAdministrador();
                            NFrame Fx = new Lista(dados);
			    Fx. show();
                            
                   
                            } catch (SQLException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
                            }
        }

    }

    public static void main(String arg[]) {
        NFrame Fx = new AplicacaoEvento();
        Fx.show();
    }

}