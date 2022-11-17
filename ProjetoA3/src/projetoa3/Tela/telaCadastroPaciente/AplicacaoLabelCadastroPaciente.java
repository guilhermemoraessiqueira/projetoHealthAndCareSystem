/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaCadastroPaciente;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import projetoa3.Tela.NFrame;

/**
 *
 * @author Guilherme
 */
public class AplicacaoLabelCadastroPaciente extends NFrame{
    
    JLabel L1, L2,L3,L4,L5,L6,L7,L8;
   Color cor1 = new Color(13,28,102);
       
        
	public AplicacaoLabelCadastroPaciente()
	{

		L1 =new JLabel("Cadastro Paciente", JLabel.CENTER);
		L1.setFont(new Font("Arial",Font.BOLD,16));
                L1.setBorder(BorderFactory.createLineBorder(cor1,04));
                L1.setBackground(cor1);
		L1.setBounds(100,30,300,30);
		
		L2 =new JLabel("Nome :",JLabel.RIGHT);
                L2.setFont(new Font("arial",Font.BOLD,14));
                L2.setBounds(70,120,100,20);
		
		L3 =new JLabel("CPF :",JLabel.RIGHT);
		L3.setFont(new Font("arial",Font.BOLD,14));
		L3.setBounds(70,160,100,20);
                
                L4 =new JLabel("Data de nasc. :",JLabel.RIGHT);
		L4.setFont(new Font("arial",Font.BOLD,14));
		L4.setBounds(70,200,110,20);
                
                L5 =new JLabel("Endereço :",JLabel.RIGHT);
		L5.setFont(new Font("arial",Font.BOLD,14));
		L5.setBounds(70,240,100,20);
                
                L6 =new JLabel("Deficiência :",JLabel.RIGHT);
		L6.setFont(new Font("arial",Font.BOLD,14));
		L6.setBounds(70,280,100,20);
                
                L7 =new JLabel("Se sim qual? :",JLabel.RIGHT);
		L7.setFont(new Font("arial",Font.BOLD,14));
		L7.setBounds(70,320,100,20);
                
                L8 =new JLabel("Sintomas :",JLabel.RIGHT);
		L8.setFont(new Font("arial",Font.BOLD,14));
		L8.setBounds(70,360,100,20);
                
                /*L9 =new javax.swing.JLabel();
                L9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone.png")));
                L9.setBounds(10,10,200,200);
		//L9.setFont(new Font("arial",Font.BOLD,14));
		//L9.setBounds(70,400,100,20);*/
                
                
		
		getContentPane().setLayout(null);
		getContentPane().add(L1); // getConterPane 
		getContentPane().add(L2);
		getContentPane().add(L3);
                getContentPane().add(L4);
		getContentPane().add(L5);
                getContentPane().add(L6);
                getContentPane().add(L7);
                getContentPane().add(L8);
                
               
                


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AplicacaoLabelCadastroPaciente().show();

	}
}

