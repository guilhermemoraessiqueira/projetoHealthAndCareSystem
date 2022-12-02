/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Menu.MenuPaciente;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin.NFrameLogin;

/**
 *
 * @author Guilherme
 */
public class MenuPacienteLabel extends NFrameLogin{
    
    
    JLabel L1;
    Color cor1 = new Color(13,28,102);
    
    public MenuPacienteLabel(){
        
        //setSize (300, 350);
        
        L1 = new JLabel("Digite seu CPF", JLabel.CENTER);
        L1.setFont(new Font("Arial", Font.BOLD, 16));
        L1.setBorder(BorderFactory.createLineBorder(cor1, 04));
        L1.setBackground(cor1);
        L1.setBounds(50, 30, 200, 30);
		
        getContentPane().setLayout(null);
	getContentPane().add(L1);
        
    }

    
}
