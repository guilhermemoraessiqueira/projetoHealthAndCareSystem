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
import projetoa3.Paciente;
import projetoa3.bancoDeDados.conexao;
/**
 *
 * @author Guilherme
 */
public class PacienteDAO {
    private Connection c;
    
    public PacienteDAO(conexao conn) throws SQLException, ClassNotFoundException {
              c = conn.obtemConexao();
           }

    public PacienteDAO() {
    }
             
         public void insert(Paciente paciente) {
            String sql =   "INSERT INTO pacientes (usuario, senha, cpf, nome) VALUES (" +"\"" 
                + paciente.getNome() + "\",\""
                + paciente.getCpf() + "\",\""
                + paciente.getData_nasc()+ "\",\""
                + paciente.getSe_sim_qual()+ "\");";
            
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
         public void consulta(Paciente paciente) {    
             String sql =   "SELECT * from administradores where cpf=" + paciente.getCpf();
             System.out.println(sql);
             try {

                    PreparedStatement ps = c.prepareStatement(sql);

                    ResultSet rs = ps.executeQuery();

                    while (rs.next()){
                        paciente.setNome(rs.getString("nome"));
                        //paciente.setData_nasc(rs.getString("Data de nasc"));
                        paciente.setDeficiencia(Boolean.getBoolean("deficiencia"));
                    }

                }   
                catch (Exception e){
                    e.printStackTrace();
                }
        
    }
         public ResultSet atutenticacaoCpf(Paciente paciente){
        Connection conn = new conexao().obtemConexao();
        
             try {
                 String sql = "SELECT * FROM pacientes WHERE cpf= ?";
                 PreparedStatement pstm = conn.prepareStatement(sql);
                 pstm.setString(1, paciente.getCpf());
                 
                 ResultSet rs = pstm.executeQuery();
                 return rs;
                 
             } catch (SQLException erro) {
                 JOptionPane.showMessageDialog(null, "classe pacienteDAO "+ erro);
                 return null;
                         
                 
             }
        
             
             
             
         }
       
    
    
   

}
