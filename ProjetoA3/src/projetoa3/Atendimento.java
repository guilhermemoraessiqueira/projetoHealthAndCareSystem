package projetoa3;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import projetoa3.Menu.MenuPaciente.MenuPacienteEvento;
/**
 *
 * @author Guilherme
 */
public class Atendimento extends Paciente{
    
    private Date data_de_atendimento;
    private int prioridade;// 1- para sintomas || 2 para idosos e crianças ||3- check outros sintomas
    private int atendimento;
    

    public Atendimento(Date data_de_atendimento) {
        this.data_de_atendimento = data_de_atendimento;
    }

    public int getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(int atendimento) {
        this.atendimento = atendimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atendimento() {
        }

    public Date getData_de_atendimento() {
        return data_de_atendimento;
    }

    public void setData_de_atendimento(Date data_de_atendimento) {
        this.data_de_atendimento = data_de_atendimento;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void setCpf(MenuPacienteEvento cpf) {
    }

    public void setData_nasc() {
   }

    public void setData_de_atendimento(Calendar dataAtual) {
    }

    public void setData_de_atendimento(String format) {
    }

    public void setData_de_atendimento(DateTimeFormatter dataAtual) {
    }

 

   
    
    
    
    
}
