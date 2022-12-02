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
public class Paciente extends Pessoas {

    private Date data_nasc;
    private boolean deficiencia;
    private String se_sim_qual;
    private String endereco;
     

    public Paciente(Date data_nasc, boolean deficiencia, String se_sim_qual, String cpf, String nome, String endereco) {
        super(cpf, nome);
        this.data_nasc = data_nasc;
        this.deficiencia = deficiencia;
        this.se_sim_qual = se_sim_qual;
        this.endereco = endereco;
    }

    public Paciente() {
     }

    public Paciente(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public boolean isDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(boolean deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getSe_sim_qual() {
        return se_sim_qual;
    }

    public void setSe_sim_qual(String se_sim_qual) {
        this.se_sim_qual = se_sim_qual;
    }

    public void incluirAtendimento() {
    }

    public void incluirCadastro() {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setData_nasc(String data) {
         }
    
    
    

}
