/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3;

import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Atendimento {
    private Date data_de_atendimento;
    //private array prioridade_de_atendimento;

    public Atendimento(Date data_de_atendimento) {
        this.data_de_atendimento = data_de_atendimento;
    }

    public Date getData_de_atendimento() {
        return data_de_atendimento;
    }

    public void setData_de_atendimento(Date data_de_atendimento) {
        this.data_de_atendimento = data_de_atendimento;
    }
    
    
    
}
