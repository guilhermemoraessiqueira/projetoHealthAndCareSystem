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
import javax.swing.JOptionPane;
import projetoa3.Paciente;
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
            PacienteDAO pacienteBD;
            
    
		public AplicacaoEventoCadast(){
			B1.addActionListener(this);// Adiciona ações ao botão
			B2.addActionListener(this);
			B3.addActionListener(this);
                        comboDef.addActionListener(this);
                        this.setResizable(false);	
                         Tx3.setVisible(false);
                         L7.setVisible(false);
                         
                         
		}

		public void actionPerformed(ActionEvent e)//
		{
                    if(comboDef.getSelectedItem() == "Sim"){
                               Tx3.setVisible(true);
                               Tx3.revalidate();
                               L7.setVisible(true);
                               L7.revalidate();
                           }else{
                                    Tx3.setVisible(false);
                                    L7.setVisible(false);                           
                                }

                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    
                    
			if(e.getSource()==B1){
           /* try {
                pacienteBD = new PacienteDAO(conn);
                paciente.setCpf(Tx2.getText());
                pacienteBD.consulta(paciente);

                Tx1.setText("" + paciente.getNome());
                comboDia.setSelectedItem()("" + paciente.getNome());

            } catch (SQLException ex) {
                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AplicacaoEvento.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
			if(e.getSource()==B2)
			{
                            paciente.setNome(Tx1.getText());
                            paciente.setCpf(Tx2.getText());                         
                           paciente.setSe_sim_qual(Tx3.getText());
                       
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
