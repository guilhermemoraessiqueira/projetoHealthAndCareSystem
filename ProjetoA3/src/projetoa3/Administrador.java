/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3;

import projetoa3.Pessoas;

/**
 *
 * @author Guilherme
 */
public class Administrador extends Pessoas {
    private String usuario;
    private String senha;

    public Administrador(String usuario, String senha, String cpf, String nome) {
        super(cpf, nome);
        this.usuario = usuario;
        this.senha = senha;
    }
    

    //--------------------------------------//
    
    public Administrador (){
        this.usuario = "";
        this.senha = "";
        this.cpf = "";
        this.nome = "";
        
    }

    public Administrador(String usuario, String senha) {
          }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    //metodos crud
       
    public boolean incluir(){
        return false;
    }    
    
    public boolean alterar(){
        return false;
    }    
        
    public boolean consultar(){
        return false;
    }
    
    public boolean excluir(){        
        return false;       
    }


    
  
    
    
}
