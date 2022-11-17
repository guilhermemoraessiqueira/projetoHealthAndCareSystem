/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin;

import java.awt.event.KeyEvent;
import javax.swing.JButton;

/**
 *
 * @author Guilherme
 */
public class AplicacaoButtonLogin extends AplicacaoTextLogin{
    JButton B1, B2;
            public AplicacaoButtonLogin(){
                B1 =new JButton("Login");
			B1.setSize(85, 40);
			B1.setLocation(68,125);
			B1.setMnemonic(KeyEvent.VK_I);

			B2 =new JButton("Cancelar");
			B2.setSize(85, 40);
			B2.setLocation(168,125);
			B2.setMnemonic(KeyEvent.VK_A);
                        
                        getContentPane().add(B1);
			getContentPane().add(B2);
                        getContentPane().add(L4);
            }
 		public static void main(String arg[])
		{
			new AplicacaoButtonLogin().show();
		}

                    
}
