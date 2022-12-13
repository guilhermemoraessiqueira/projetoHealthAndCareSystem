package projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class NFrameLogin extends JFrame {
    
    public NFrameLogin(){
        
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone.png")).getImage());
        
        
        Color cor_borda = new Color(173, 216, 230);
        
        Container c = getContentPane();
        setLocation(100,50);
        setTitle("Login sistema");
        setSize (300, 200);
        setUndecorated(true);
        c.setBackground (cor_borda);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  
}
