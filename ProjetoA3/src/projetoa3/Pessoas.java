/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3;

/**
 *
 * @author Guilherme
 */
public class Pessoas {

    protected String cpf;
    protected String nome;

    public Pessoas(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Pessoas() {
        this.cpf = "";
        this.nome = "";
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

}
