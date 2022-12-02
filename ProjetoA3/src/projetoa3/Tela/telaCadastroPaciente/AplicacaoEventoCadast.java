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
import java.sql.SQLException;
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
                    // Adiciona ações aos botões
			B1.addActionListener(this);
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

                    SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
                    
                    
                    //----------------------------------------------------------------------------//
                    
			                 if (e.getSource() == B1) {
                        JOptionPane.showMessageDialog(null, "Botao 1");

                    }
			if(e.getSource()==B2)
			{
                            //instanciando textfields para o objeto paciente
                            paciente.setNome(Tx1.getText());
                            paciente.setCpf(Tx2.getText());                           
                            paciente.setEndereco(Tx4.getText());
                       
                            //tranformando comboBox em string format DATE
                            String dataComboBox = (String) comboDia.getSelectedItem() +"-"+ comboMes.getSelectedItem()+"-"+comboAno.getSelectedItem();   
                            System.out.println(dataComboBox);
                            
                             //INSTANCIANDO DATA EM PACIENTE
                            try {  
                                Date dataDate = formatter.parse(dataComboBox);
                                System.out.println(dataDate);
                                paciente.setData_nasc(dataDate);
                                System.out.println("INSTANCIADO "+paciente.getData_nasc());
                                
                                System.out.println("---------------");
                                
                                Calendar calendar = Calendar.getInstance();
                                System.out.println("DATA ATUAL "+formatter.format(calendar.getTime()));
                            } catch (ParseException ex) {
                                Logger.getLogger(AplicacaoEventoCadast.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                            
                            int resultado = JOptionPane.showConfirmDialog(null, "Cadastro do Administrado : \n Usuário: " + Tx1.getText() + "\n CPF: " + Tx2.getText() + "\n Nome: " + Tx3.getText());
        
                             if(resultado == JOptionPane.YES_OPTION){
                                try {
                                    pacienteBD = new PacienteDAO(conn);
                                    pacienteBD.insert(paciente);

                                } catch (SQLException ex) {
                                    Logger.getLogger(AplicacaoEventoCadast.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(AplicacaoEventoCadast.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ParseException ex) {
                                    Logger.getLogger(AplicacaoEventoCadast.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            if (resultado == JOptionPane.NO_OPTION) {
                                JOptionPane.showMessageDialog(null, "Cadastro cancelado");
                            }
                            
                            
                            
                            if(comboDef.getSelectedItem()=="Sim"){
                                paciente.setSe_sim_qual(Tx3.getText());
                                paciente.setDeficiencia(true);
                            }else{
                                paciente.setSe_sim_qual("");
                            }
                            
                            
                            System.out.println(paciente.getCpf());
                            System.out.println(paciente.getData_nasc());
                            System.out.println(paciente.getEndereco());
                            System.out.println(paciente.getNome());
                            System.out.println(paciente.getSe_sim_qual());
                            System.out.println(paciente.isDeficiencia());
			
                        
                        
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
