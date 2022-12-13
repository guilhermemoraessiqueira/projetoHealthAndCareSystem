package projetoa3.Tela.telaLoginAdm.AplicacaoTextLogin;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AplicacaoTextLogin extends AplicacaoLabelLogin{
    public JTextField Tx1;
    public JPasswordField Tx2;
    
            public AplicacaoTextLogin(){
                Tx1 = new JTextField();
			this.Tx1 = Tx1;
			Tx1.setBounds(103,61,162,20);

			Tx2 = new JPasswordField();
			this.Tx2 = Tx2;
			Tx2.setBounds(103,100,162,20);
                        
                        getContentPane().add(Tx1);
			getContentPane().add(Tx2);                    
		}   
}
