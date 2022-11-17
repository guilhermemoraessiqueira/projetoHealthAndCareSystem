/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import projetoa3.Tela.NFrame;

/**
 *
 * @author Guilherme
 */
public class AplicacaoLabelLogin extends NFrameLogin{
    

    
	JLabel L1, L2,L3,L4; // Objeto Independente
	Color cor1 = new Color(13,28,102);
       
        
	public AplicacaoLabelLogin(){

		L1 =new JLabel("Login Administrativo", JLabel.CENTER);
		L1.setFont(new Font("Arial",Font.BOLD,16));
                //L1.setBorder(BorderFactory.createLineBorder(cor1,04));
                L1.setBackground(cor1);
		L1.setBounds(72,22,160,19);
		
		L2 =new JLabel("Usuário:",JLabel.LEFT);
                L2.setFont(new Font("arial",Font.BOLD,14));
                L2.setBounds(43,63,155,17);
		
		L3 =new JLabel("Senha:",JLabel.LEFT);
		L3.setFont(new Font("arial",Font.BOLD,14));
		L3.setBounds(46,100, 155,17);
                
               L4 =new javax.swing.JLabel();
               L4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo1.png")));
               L4.setBounds(0,0, 300,200);

		
		getContentPane().setLayout(null);
		getContentPane().add(L1); // getConterPane 
		getContentPane().add(L2);
		getContentPane().add(L3);
                
                


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AplicacaoLabelLogin().show();

	}
}
