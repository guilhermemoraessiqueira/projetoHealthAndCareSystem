/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaCadastroPaciente;


import javax.swing.JComboBox;


/**
 *
 * @author Guilherme
 */
public class AplicacaoComboBoxCadastroPaciente extends AplicacaoTextCadastroPaciente{
    //classe rap de int
    JComboBox<Integer> comboDia = new JComboBox<>();
    JComboBox<String> comboMes = new JComboBox<>();
    JComboBox<Integer> comboAno = new JComboBox<>();
    JComboBox<String> comboDef = new JComboBox<>(); //se possui ou n deficiencia

    
    public AplicacaoComboBoxCadastroPaciente (){
        add(comboDia);
        
        
        //adicionando itens ao dia
        comboDia.addItem(1);
        comboDia.addItem(2);
        comboDia.addItem(3);
        comboDia.addItem(4);
        comboDia.addItem(5);
        comboDia.addItem(6);
        comboDia.addItem(7);
        comboDia.addItem(8);
        comboDia.addItem(9);
        comboDia.addItem(10);
        comboDia.addItem(11);
        comboDia.addItem(12);
        comboDia.addItem(13);
        comboDia.addItem(14);
        comboDia.addItem(15);
        comboDia.addItem(16);
        comboDia.addItem(17);
        comboDia.addItem(18);
        comboDia.addItem(19);
        comboDia.addItem(20);
        comboDia.addItem(21);
        comboDia.addItem(22);
        comboDia.addItem(23);
        comboDia.addItem(24);
        comboDia.addItem(25);
        comboDia.addItem(26);
        comboDia.addItem(27);
        comboDia.addItem(28);
        comboDia.addItem(29);
        comboDia.addItem(30);
        comboDia.addItem(31);
        //colocando o item 1 como selecionado ao inicializar
        comboDia.setSelectedIndex(0);
        comboDia.setBounds(190, 200, 40, 20);
        
        add(comboMes);
        
        //adicionando itens ao mes
        comboMes.addItem("jan");
        comboMes.addItem("fev");
        comboMes.addItem("mar");
        comboMes.addItem("abr");
        comboMes.addItem("maio");
        comboMes.addItem("jun");
        comboMes.addItem("jul");
        comboMes.addItem("ago");
        comboMes.addItem("set");
        comboMes.addItem("out");
        comboMes.addItem("nov");
        comboMes.addItem("dez");
        
        
        //colocando o item 1 como selecionado ao inicializar
        comboMes.setSelectedIndex(0);
        comboMes.setBounds(240, 200, 50, 20);
        
        add(comboAno);
        
        //adicionando itens ao ano
        comboAno.addItem(1911);
        
        //colocando o item 1 como selecionado ao inicializar
        comboAno.setSelectedIndex(0);
        comboAno.setBounds(300, 200, 60, 20);
        
        
        add(comboDef);
        
        //adicionando itens 
        comboDef.addItem(" ");
        comboDef.addItem("Sim");
        comboDef.addItem("Não");
        
        //colocando o item 1 como selecionado ao inicializar
        comboDef.setSelectedIndex(0);
        comboDef.setBounds(190, 280, 50, 20);
        
        
        
        getContentPane().add(comboDef);
        getContentPane().add(comboDia);
        getContentPane().add(comboMes);
        getContentPane().add(comboAno);

    }
    
    public static void main(String[] args) {
        new AplicacaoComboBoxCadastroPaciente().show();
    }
    
}
