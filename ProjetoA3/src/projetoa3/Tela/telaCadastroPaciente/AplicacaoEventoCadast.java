package projetoa3.Tela.telaCadastroPaciente;


import projetoa3.Tela.NFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import projetoa3.Administrador;
import projetoa3.Paciente;
import projetoa3.bancoDeDados.AdministradorDAO;
import projetoa3.Tela.NFrame;
import projetoa3.bancoDeDados.PacienteDAO;
import projetoa3.bancoDeDados.conexao;

/**
 *
 * @author Guilherme
 */
public class AplicacaoEventoCadast extends AplicacaoButtonCadastroPaciente implements ActionListener{
        
            Paciente paciente = new Paciente();
            conexao conn = new conexao();
            PacienteDAO pacienteDAO;
            
    
		public AplicacaoEventoCadast()
		{
                 
                    //
                    
			B1.addActionListener(this);// Adiciona ações ao botão
			B2.addActionListener(this);
			B3.addActionListener(this);
                        this.setResizable(false);
			
			
		}
		public void actionPerformed(ActionEvent e)//
		{
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			if(e.getSource()==B1){
                            
                            
                            
			
                    }
			if(e.getSource()==B2)
			{
                            paciente.setNome(Tx1.getText());
                            paciente.setCpf(Tx2.getText());
                            
                            
                            String data = (String) comboDia.getSelectedItem() +"/"+ comboMes.getSelectedItem()+"/"+comboAno.getSelectedItem();
                            
                            System.out.println(data);
                            
                            try {
                                
                                Date date = formatter.parse(data);
                                System.out.println(date);
                                
                                System.out.println("---------------");
                                
                                Calendar calendar = Calendar.getInstance();
                                System.out.println("DATA ATUAL "+formatter.format(calendar.getTime()));
                            } catch (ParseException ex) {
                                Logger.getLogger(AplicacaoEventoCadast.class.getName()).log(Level.SEVERE, null, ex);
                            }
			
                        
                            
			
                        
                        
			Tx1.setText("");
			Tx2.setText("");
                     
			
			}
			if (e.getSource() == B3)
			{
				JOptionPane.showMessageDialog(null, "Botao 3");	
			}

			

		}

		public static void main ( String arg[])
		{
                    
			NFrame Fx = new AplicacaoEventoCadast();
			Fx. show();
		}

       
}
