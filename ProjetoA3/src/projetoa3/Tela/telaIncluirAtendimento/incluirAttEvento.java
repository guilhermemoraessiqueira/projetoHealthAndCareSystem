/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaIncluirAtendimento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetoa3.Atendimento;
import projetoa3.Menu.MenuPaciente.MenuPacienteEvento;
import projetoa3.Tela.NFrame;
import projetoa3.bancoDeDados.AtendimentoDAO;
import projetoa3.bancoDeDados.conexao;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import projetoa3.Paciente;

/**
 *
 * @author Guilherme
 */
public class incluirAttEvento extends incluirAttButton implements ActionListener{
    
    
    Atendimento atendimento = new Atendimento();
    conexao conn = new conexao();
    AtendimentoDAO atendimentoBD;
           

    public incluirAttEvento(String cpf) throws ParseException {
        B1.addActionListener((ActionListener) this);// voltar
        B2.addActionListener((ActionListener) this);// continuar
        B3.addActionListener((ActionListener) this);// cancela
        
        atendimento.setCpf(cpf);
        System.out.println(atendimento.getCpf());
        
        //instanciar DATA
        Date date = new Date();                   
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String a = formatter.format(date);
        System.out.println(a);
        
        Date dataFormatada = formatter.parse(a);

        atendimento.setData_de_atendimento(dataFormatada);
        System.out.println(atendimento.getData_de_atendimento());
        
        
        
       
        
        
        
        
        
        //instanciar PRIORIDADE
        if(check9.isSelected()){
            atendimento.setPrioridade(3);
        }else{
         atendimento.setPrioridade(1);
        }
        
        //instanciar ATENDIMENTO
        atendimento.setAtendimento(1);
      }

    private incluirAttEvento() {
        }
         
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == B1) {
            //B INCLUIR
            
            
            
            JOptionPane.showMessageDialog(null,"INCLUIR");
            try {
                atendimentoBD = new AtendimentoDAO(conn);
                atendimentoBD.insert(atendimento);
            } catch (SQLException ex) {
                Logger.getLogger(incluirAttEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(incluirAttEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(incluirAttEvento.class.getName()).log(Level.SEVERE, null, ex);
            }

        }if (e.getSource() == B2) {//B CANCELAR
            JOptionPane.showMessageDialog(null, "cancelar");

        }if (e.getSource() == B3) { //B VOLTAR
            MenuPacienteEvento telaAnterior = new MenuPacienteEvento();
            telaAnterior.setVisible(true);
            this.dispose();
            

        }
        
    }public static void main(String arg[]) {
        NFrame Fx = new incluirAttEvento();
        Fx.show();
    }
    }
    

    
    
    
