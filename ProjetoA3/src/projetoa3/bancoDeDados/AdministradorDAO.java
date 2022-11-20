/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.bancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.bancoDeDados.conexao;

/**
 *
 * @author Guilherme
 */
public class AdministradorDAO {
            private Connection  c;
            
             public AdministradorDAO(conexao conn) throws SQLException, ClassNotFoundException {
              c = conn.obtemConexao();
           }
             
         public void insert(Administrador administrador) {
            String sql =   "INSERT INTO administradores (usuario, senha, cpf, nome) VALUES (" +"\"" 
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
             String sql =   "SELECT * from administradores where cpf=" + administrador.getCpf();
             System.out.println(sql);
             try {

                    PreparedStatement ps = c.prepareStatement(sql);

                    ResultSet rs = ps.executeQuery();

                    while (rs.next()){
                        administrador.setNome(rs.getString("nome"));
                        administrador.setUsuario(rs.getString("usuario"));
                    }

                }   
                catch (Exception e){
                    e.printStackTrace();
                }
        
    }
     
 }
    

