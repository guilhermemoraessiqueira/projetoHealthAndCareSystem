/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.bancoDeDados.conexao;

/**
 *
 * @author Guilherme
 */
public class AdministradorDAO {

    private Connection c;
    
    public AdministradorDAO(conexao conn) throws SQLException, ClassNotFoundException {
        c = conn.obtemConexao();
    }
    
    public AdministradorDAO(){
        
    }

    public void insert(Administrador administrador) {
        String sql = "INSERT INTO administradores (usuario, senha, cpf, nome) VALUES (" + "\""
                + administrador.getUsuario() + "\",\""
                + administrador.getSenha() + "\",\""
                + administrador.getCpf() + "\",\""
                + administrador.getNome() + "\");";

        System.out.println(sql);
        

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            ps.close();
            c.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consulta(Administrador administrador) {
        String sql = "SELECT * from administradores where cpf= " + " \"" + administrador.getCpf() + "\";";
        System.out.println(sql);
        System.out.println(administrador.getCpf());
        try {

            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                administrador.setNome(rs.getString("nome"));
                administrador.setUsuario(rs.getString("usuario"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void altera(Administrador administrador) throws SQLException {

        //query para alterar
        String sql = "UPDATE administradores SET usuario = ?, senha = ?, nome = ?" + " WHERE cpf = ? ";

        PreparedStatement pstm = null;

        try {
            //classe para executar query
            pstm = (PreparedStatement) c.prepareStatement(sql);

            //adicionar os valores para atualizar
            pstm.setString(1, administrador.getUsuario());
            pstm.setString(2, administrador.getSenha());
            pstm.setString(3, administrador.getNome());

            //qual cpf que 
            pstm.setString(4, administrador.getCpf());

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (c != null) {
                    c.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void exlcui(Administrador administrador) throws SQLException {

        int resultado = JOptionPane.showInternalConfirmDialog(null, "Deseja realmente exlcuir o administrador: " + administrador.getUsuario() + "\n"+ "Nome:" + administrador.getNome() + "\n"+ "CPF:" + administrador.getCpf());

        String sql = "DELETE FROM administradores WHERE cpf =?";
        System.out.println(sql);

        PreparedStatement pstm = null;

        if (resultado == JOptionPane.YES_OPTION) {
            System.out.println("CONFIRMAÇÃO DA EXCLUSAO ACEITA PELO USUARIO");
            try {

                //classe para executar query
                pstm = (PreparedStatement) c.prepareStatement(sql);

                //qual cpf que deseja excluir
                pstm.setString(1, administrador.getCpf());
                
                

                pstm.execute();
                
                

            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        if (resultado == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Cancelado");

        }        
    }
    
    public ArrayList listaAdministrador(){
        ArrayList<Administrador> dados = new ArrayList();
        String sql = "SELECT * FROM administradores";

        try {
              PreparedStatement ps = c.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

            rs = ps.executeQuery();
            while (rs.next())
            {   Administrador administrador = new Administrador();
            
                administrador.setCpf(rs.getString("cpf"));
                administrador.setNome(rs.getString("nome"));
                administrador.setUsuario(rs.getString("usuario"));
                System.out.println(administrador.getNome());
                
                dados.add(administrador);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dados;
       }
    
    
    
    public boolean existe (Administrador administador) throws Exception{
      
       String sql = "SELECT * FROM administradores WHERE senha = ? AND usuario = ?";
       
        System.out.println(sql);
      
        
        
       
       try (Connection conn = conexao.obtemConexao();
               PreparedStatement pq = conn.prepareStatement(sql)){         
           pq.setString(1, administador.getSenha());
           pq.setString(2, administador.getUsuario());
           System.out.println(pq);
           
           try (ResultSet rs = pq.executeQuery()){
               return rs.next();
           }
       }
    }
    
   

}



