/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.bancoDeDados;

import java.sql.Connection;
import java.sql.SQLException;
import projetoa3.Atendimento;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Guilherme
 */
public class AtendimentoDAO {
    private Connection c;
    
    public AtendimentoDAO(conexao conn) throws SQLException, ClassNotFoundException {      
        c = conn.obtemConexao();
    }
    
    public AtendimentoDAO(){
        
    }

    public void insert(Atendimento atendimento)throws ParseException {

                SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");  
                String dataFormatada = formatador.format(atendimento.getData_de_atendimento());
                  
        
        String sql = "INSERT INTO atendimentos (pacientes_cpf, data_atendimento, prioridade, atendimento) VALUES (" + "\""
                               
                + atendimento.getCpf() + "\",\""
                + dataFormatada+ "\",\""
                + atendimento.getPrioridade()+ "\",\""
                + atendimento.getAtendimento() + "\");";

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
}
