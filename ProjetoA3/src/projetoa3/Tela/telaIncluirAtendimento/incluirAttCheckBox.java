/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaIncluirAtendimento;

import javax.swing.JCheckBox;

/**
 *
 * @author Guilherme
 */
public class incluirAttCheckBox extends incluirAttLabel{
    JCheckBox check1 = new JCheckBox("Dor aguda moderada ou intensa");  //cod 3
    JCheckBox check2 = new JCheckBox("Agitação importante"); //cod 4
    JCheckBox check3 = new JCheckBox(" Falta de ar"); //cod 5
    JCheckBox check4 = new JCheckBox("Vômitos frequentes e incessantes"); //cod 6
    JCheckBox check5 = new JCheckBox("Sintomas urinários"); //cod 7
    JCheckBox check6 = new JCheckBox("Gastrointestinais agudos e intensos"); //cod 8
    JCheckBox check7 = new JCheckBox("Traumas leves a moderados"); //cod 9
    JCheckBox check8 = new JCheckBox("Ferimentos cortantes"); //cod 10
    JCheckBox check9 = new JCheckBox("Outros"); //cod 11
    
public incluirAttCheckBox(){
        add(check1);
        check1.setBounds(120, 70, 230, 15);
        
        add(check2);
        check2.setBounds(120, 85, 230, 15);
        
        add(check3);
        check3.setBounds(120, 100, 230, 15);
        
        add(check4);
        check4.setBounds(120, 115, 230, 15);
        
        add(check5);
        check5.setBounds(120, 130, 230, 15);
        
        add(check6);
        check6.setBounds(120, 145, 230, 15);
        
        add(check7);
        check7.setBounds(120, 160, 230, 15);
        
        add(check8);
        check8.setBounds(120, 175, 230, 15);
        
        add(check9);
        check9.setBounds(120, 190, 230, 15);
        
        
        //getContentPane().setLayout(null);
        
    }
    
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		new incluirAttCheckBox().show();

	}
}