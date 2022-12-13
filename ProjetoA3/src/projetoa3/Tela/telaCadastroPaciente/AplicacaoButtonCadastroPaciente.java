package projetoa3.Tela.telaCadastroPaciente;

import java.awt.event.KeyEvent;
import javax.swing.JButton;

public class AplicacaoButtonCadastroPaciente extends AplicacaoCheckBoxCadastroPaciente{
    JButton B1, B2, B3;
		
		public AplicacaoButtonCadastroPaciente(){
					
			B1 =new JButton("Buscar");
			B1.setSize(80, 40);
			B1.setLocation(350,120);
			B1.setMnemonic(KeyEvent.VK_I);

			B2 =new JButton("Cadastrar");
			B2.setSize(100, 40);
			B2.setLocation(170,490);
			B2.setMnemonic(KeyEvent.VK_A);

			B3 =new JButton("Cancelar");
			B3.setSize(90,40);
			B3.setLocation(280,490);
			B3.setMnemonic(KeyEvent.VK_C);

                        getContentPane().add(B1);
			getContentPane().add(B2);
			getContentPane().add(B3);
			}          
}
