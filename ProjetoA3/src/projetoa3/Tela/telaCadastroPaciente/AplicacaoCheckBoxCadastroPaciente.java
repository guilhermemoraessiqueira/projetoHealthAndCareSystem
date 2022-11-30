/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaCadastroPaciente;

import javax.swing.JCheckBox;

/**
 *
 * @author Guilherme
 */
public class AplicacaoCheckBoxCadastroPaciente extends AplicacaoComboBoxCadastroPaciente{
    JCheckBox check1 = new JCheckBox("Dor aguda moderada ou intensa");  //cod 3
    JCheckBox check2 = new JCheckBox("Agitação importante"); //cod 4
    JCheckBox check3 = new JCheckBox(" Falta de ar"); //cod 5
    JCheckBox check4 = new JCheckBox("Vômitos frequentes e incessantes"); //cod 6
    JCheckBox check5 = new JCheckBox("Sintomas urinários"); //cod 7
    JCheckBox check6 = new JCheckBox("Gastrointestinais agudos e intensos"); //cod 8
    JCheckBox check7 = new JCheckBox("Traumas leves a moderados"); //cod 9
    JCheckBox check8 = new JCheckBox("Ferimentos cortantes"); //cod 10
    JCheckBox check9 = new JCheckBox("Outros"); //cod 11
    
    
    public AplicacaoCheckBoxCadastroPaciente(){
        add(check1);
        check1.setBounds(190, 345, 230, 15);
        
        add(check2);
        check2.setBounds(190, 360, 230, 15);
        
        add(check3);
        check3.setBounds(190, 375, 230, 15);
        
        add(check4);
        check4.setBounds(190, 390, 230, 15);
        
        add(check5);
        check5.setBounds(190, 405, 230, 15);
        
        add(check6);
        check6.setBounds(190, 420, 230, 15);
        
        add(check7);
        check7.setBounds(190, 435, 230, 15);
        
        add(check8);
        check8.setBounds(190, 450, 230, 15);
        
        add(check9);
        check9.setBounds(190, 465, 230, 15);
        
        
        //getContentPane().setLayout(null);
        
    }
    
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AplicacaoCheckBoxCadastroPaciente().show();

	}
}
