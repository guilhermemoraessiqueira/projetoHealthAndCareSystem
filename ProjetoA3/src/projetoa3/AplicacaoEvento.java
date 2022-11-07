/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class AplicacaoEvento extends AplicacaoButton implements ActionListener
	{
		AplicacaoEvento()
		{
			B1.addActionListener(this);// Adiciona ações ao botão
			B2.addActionListener(this);
			B3.addActionListener(this);
			B4.addActionListener(this);
			B5.addActionListener(this);
			B6.addActionListener(this);
			
		}
		public void actionPerformed(ActionEvent e)//
		{
			if(e.getSource()==B1)
			{
				JOptionPane.showMessageDialog(null, "Botao 1");
				
                               // Curso curso = new Curso(Integer.parseInt(Tx1.getText()),Tx2.getText(),Integer.parseInt(Tx3.getText()));
	    	                //System.out.println("Curso:"+ curso.getCodigo()+ "-" + curso.getNome()+ "-" + curso.getPeriodo());
     
			}
			if(e.getSource()==B2)
			{
				
			JOptionPane.showMessageDialog(null, "Botao 2");
			Tx1.setText(" ");
			Tx2.setText(" ");
			
			}
			if (e.getSource() == B3)
			{
				JOptionPane.showMessageDialog(null, "Botao 3");	
			}

			if(e.getSource()==B4)
			{
				JOptionPane.showMessageDialog(null, "Botao 4");	
				
			}

			if (e.getSource() == B5)
			{
				
				this.dispose();
			}
			if (e.getSource() == B6)
			{
				JOptionPane.showMessageDialog(null, "Botao 6");
				
			}

		}

		public static void main ( String arg[])
		{
			NFrame Fx = new AplicacaoEvento();
			Fx. show();
		}

       
}
