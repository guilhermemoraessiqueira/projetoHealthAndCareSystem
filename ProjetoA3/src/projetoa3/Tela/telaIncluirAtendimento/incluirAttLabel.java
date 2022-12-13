package projetoa3.Tela.telaIncluirAtendimento;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import projetoa3.Tela.NFrame;

public class incluirAttLabel extends NFrame{
    JLabel L1,L2;
    
    Color cor1 = new Color(13,28,102);
    
    public incluirAttLabel(){
        setSize(400,300);
        setResizable(false);
     L1 =new JLabel("Atendimento", JLabel.CENTER);
		L1.setFont(new Font("Arial",Font.BOLD,16));
                L1.setBorder(BorderFactory.createLineBorder(cor1,04));
                L1.setBackground(cor1);
		L1.setBounds(80,30,240,30);
		
		L2 =new JLabel("Sintomas :",JLabel.RIGHT);
                L2.setFont(new Font("arial",Font.BOLD,14));
                L2.setBounds(10,120,100,20);
                
                getContentPane().setLayout(null);
		getContentPane().add(L1); // getConterPane 
		getContentPane().add(L2);
    }
} 
