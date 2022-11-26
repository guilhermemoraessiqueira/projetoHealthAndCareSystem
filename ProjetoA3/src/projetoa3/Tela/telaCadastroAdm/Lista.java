/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoa3.Tela.telaCadastroAdm;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import projetoa3.Administrador;
import projetoa3.Tela.NFrame;

/**
 *
 * @author Guilherme
 */
public class Lista extends NFrame {
	JLabel L2;
	DefaultListModel lista ;
	JList itens;
	JPanel P1;
	
	public Lista(ArrayList<Administrador> dados)
	{
	      // Altera o titulo da pagina
		setTitle("Lista");
		L2 = new JLabel("Cadastro dos administradores");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
                setResizable(false);
                 setSize(400,500);
                
		L2.setSize(300,20);
		L2.setLocation(10,20);
		L2.setForeground(Color.black);
                
		// Acrescenta o objeto lista de seleção
	        lista = new DefaultListModel();
                
                for (int i=0;i<dados.size();i++)
                {       String cpf = dados.get(i).getCpf();
                        String nome = dados.get(i).getNome();
                        String usuario = dados.get(i).getUsuario();
               		lista.addElement(nome + "-"+nome);
                }	
	        itens = new JList(lista);
		itens.setSize(140,200);
		itens.setLocation(5,10);
		itens.setBackground(new Color(208,255,255));
		
		P1 = new JPanel();
		P1.setBounds(20,50,150,330);
		P1.setBackground(new Color(208,255,255));
		P1.setBorder(BorderFactory.createLineBorder(Color.black,2));
		P1.setLayout(null);
		P1.add(itens);
		
		 
		getContentPane().setBackground(Color.yellow);
		getContentPane().setLayout(null);
		getContentPane().add(L2);
		getContentPane().add(P1);
		
		
	}
		
}
