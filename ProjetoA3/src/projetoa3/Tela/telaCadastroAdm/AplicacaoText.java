package projetoa3.Tela.telaCadastroAdm;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AplicacaoText extends AplicacaoLabel {

    public JTextField Tx1, Tx2, Tx3, Tx4;

    public AplicacaoText() {
        Tx1 = new JTextField();
        this.Tx1 = Tx1;
        Tx1.setBounds(190, 120, 150, 20);

        Tx2 = new JPasswordField();
        this.Tx2 = Tx2;
        Tx2.setBounds(190, 160, 150, 20);

        Tx3 = new JTextField();
        this.Tx3 = Tx3;
        Tx3.setBounds(190, 200, 150, 20);

        Tx4 = new JTextField();
        this.Tx4 = Tx4;
        Tx4.setBounds(190, 240, 150, 20);

        getContentPane().add(Tx1);
        getContentPane().add(Tx2);
        getContentPane().add(Tx3);
        getContentPane().add(Tx4);
    }

}
