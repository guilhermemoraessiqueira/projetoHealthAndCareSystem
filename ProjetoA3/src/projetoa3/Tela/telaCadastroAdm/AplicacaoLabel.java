package projetoa3.Tela.telaCadastroAdm;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import projetoa3.Tela.NFrame;

public class AplicacaoLabel extends NFrame{

    
	JLabel L1, L2,L3,L4,L5; // Objeto Independente
	Color cor1 = new Color(13,28,102);
       
        
	public AplicacaoLabel()
	{

		L1 =new JLabel("Cadastro de Administrador", JLabel.CENTER);
		L1.setFont(new Font("Arial",Font.BOLD,16));
                L1.setBorder(BorderFactory.createLineBorder(cor1,04));
                L1.setBackground(cor1);
		L1.setBounds(100,30,300,30);
		
		L2 =new JLabel("Usuário :",JLabel.RIGHT);
                L2.setFont(new Font("arial",Font.BOLD,14));
                L2.setBounds(70,120,100,20);
		
		L3 =new JLabel("Senha :",JLabel.RIGHT);
		L3.setFont(new Font("arial",Font.BOLD,14));
		L3.setBounds(70,160,100,20);
                
                L4 =new JLabel("CPF :",JLabel.RIGHT);
		L4.setFont(new Font("arial",Font.BOLD,14));
		L4.setBounds(70,200,100,20);
                
                L5 =new JLabel("Nome :",JLabel.RIGHT);
		L5.setFont(new Font("arial",Font.BOLD,14));
		L5.setBounds(70,240,100,20);
		
		getContentPane().setLayout(null);
		getContentPane().add(L1); // getConterPane 
		getContentPane().add(L2);
		getContentPane().add(L3);
                getContentPane().add(L4);
		getContentPane().add(L5);
	}
}
