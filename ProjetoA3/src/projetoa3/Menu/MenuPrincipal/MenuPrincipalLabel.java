package projetoa3.Menu.MenuPrincipal;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import projetoa3.Tela.NFrame;
import projetoa3.Tela.telaCadastroAdm.AplicacaoEvento;

public class MenuPrincipalLabel extends NFrame{
    JLabel L1;
    Color cor1 = new Color(13, 28, 102);
    
    public MenuPrincipalLabel(){
        
        L1 =new JLabel("Menu", JLabel.CENTER);
        L1.setFont(new Font ("Arial", Font.BOLD, 34));
        //L1.setBorder(BorderFactory.createLineBorder(cor1, 04));
        L1.setBackground (cor1);
        L1.setBounds(200,30,120,40);
        
        getContentPane().setLayout(null);
        getContentPane().add(L1);
        
    }   
}
