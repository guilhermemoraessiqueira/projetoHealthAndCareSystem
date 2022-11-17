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
    JCheckBox check1 = new JCheckBox("Dor aguda moderada ou intensa");
    JCheckBox check2 = new JCheckBox("Agitação importante");
    JCheckBox check3 = new JCheckBox(" Falta de ar");
    JCheckBox check4 = new JCheckBox("Vômitos frequentes e incessantes");
    JCheckBox check5 = new JCheckBox("Sintomas urinários");
    JCheckBox check6 = new JCheckBox("Gastrointestinais agudos e intensos");
    JCheckBox check7 = new JCheckBox("Traumas leves a moderados");
    JCheckBox check8 = new JCheckBox("Ferimentos cortantes");
    JCheckBox check9 = new JCheckBox("Alterações sensoriais como diminuição súbita de audição ou visão");
    JCheckBox check10 = new JCheckBox("Sangramento vaginal em gestantes");
    
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
        
        
        //getContentPane().setLayout(null);
        getContentPane().add(check1);
    }
    
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AplicacaoCheckBoxCadastroPaciente().show();

	}
}
