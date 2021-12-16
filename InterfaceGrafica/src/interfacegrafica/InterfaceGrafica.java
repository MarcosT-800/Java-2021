/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author BEM VINDO
 */
public class InterfaceGrafica extends JFrame{
JLabel Rotulo1, Rotulo2, Rotulo3, Rotulo4, Rotulo5, Rotulo6, Rotulo7, Rotulo8, Rotulo9, Rotulo10, Rotulo11, Rotulo12;
JTextField Texto1, Texto2, Texto3, Texto4, Texto5, Texto6, Texto7, Texto8, Texto9, Texto10, Texto11, Texto12;
JRadioButton opcao1, opcao2;
JComboBox Campo8;
ImageIcon icone;
JFormattedTextField Campo9, Campo11, Campo12;
JButton button1, button2, button3, button4, button5;
public InterfaceGrafica(){
        super("INTERFACE GRÁFICA");
        Container tela = getContentPane();
        setLayout(null);
       
        Rotulo1 = new JLabel("Codigo do Cliente");
        Rotulo2 = new JLabel("Nome Completo");
        Rotulo3 = new JLabel("Endereço");
        Rotulo4 = new JLabel("Bairro");
        Rotulo5 = new JLabel("Cidade");
        Rotulo6 = new JLabel("Estado");
        Rotulo7 = new JLabel("C.E.P");
        Rotulo8 = new JLabel("Sexo");
        Rotulo9 = new JLabel("Celular");
        Rotulo10 = new JLabel("Telefone");
        Rotulo11 = new JLabel("Data do Aniversário");
        Rotulo12 = new JLabel("Data do Cadastro");
        
       
        
        Texto1 = new JTextField(03);
        Texto2 = new JTextField(03);
        Texto3 = new JTextField(03);
        Texto4 = new JTextField(03);
        Texto5 = new JTextField(03);
        Texto6 = new JTextField(03);
        Texto7 = new JTextField(03);
        Texto8 = new JTextField(03);
        Texto9 = new JTextField(03);
        Texto10 = new JTextField(03);
        Texto11 = new JTextField(03);
        Texto12 = new JTextField(03);
        
        Texto1.setBackground(Color.lightGray);
        Texto12.setText("___/___/_____");
         
        opcao1 = new JRadioButton();
        opcao2 = new JRadioButton();
        
        opcao1.setText("Masculino");
        opcao2.setText("Feminino");
        
        Campo8 = new JComboBox();
        Campo8.addItem("São Paulo (SP)");
        Campo8.addItem("Acre (AC)");
        Campo8.addItem("Alagoas (AL)");
        Campo8.addItem("Amapá (AP)");
        Campo8.addItem("Amazonas (AM)");
        Campo8.addItem("Bahia (BA)");
        Campo8.addItem("Ceará (CE)");
        Campo8.addItem("Distrito Federal (DF)");
        Campo8.addItem("Espírito Santo (ES)");
        Campo8.addItem("Goiás (GO)");
        Campo8.addItem("Maranhão (MA)");
        Campo8.addItem("Mato Grosso (MT)");
        Campo8.addItem("Mato Grosso do Sul (MS)");
        Campo8.addItem("Minas Gerais (MG)");
        Campo8.addItem("Pará (PA)");
        Campo8.addItem("Paraíba (PB)");
        Campo8.addItem("Paraná (PR)");
        Campo8.addItem("Pernambuco (PE)");
        Campo8.addItem("Piauí (PI)");
        Campo8.addItem("Rio de Janeiro (RJ)");
        Campo8.addItem("Rio Grande do Norte (RN)");
        Campo8.addItem("Rio Grande do Sul (RS)");
        Campo8.addItem("Rondônia (RO)");
        Campo8.addItem("Roraima (RR)");
        Campo8.addItem("Santa Catarina (SC)");
        Campo8.addItem("Sergipe (SE)");
        Campo8.addItem("Tocantins (TO)");
        
        Campo9 = new JFormattedTextField();
        Campo11 = new JFormattedTextField();
        Campo12 = new JFormattedTextField();
        
        ImageIcon IncluirImage = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\InterfaceGrafica\\src\\interfacegrafica\\make_configuration_config_5893.png");
        ImageIcon LimparImage = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\InterfaceGrafica\\src\\interfacegrafica\\1486503744-backspace-clean-clear-delete-remove-erase_81258.png");
        ImageIcon SairImage = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\InterfaceGrafica\\src\\interfacegrafica\\1486505265-document-file-export-sending-exit-send_81434.png");
        ImageIcon ConsultarImage = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\InterfaceGrafica\\src\\interfacegrafica\\Query_icon-icons.com_53746.png");
        ImageIcon ConsultarTodosImage = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\InterfaceGrafica\\src\\interfacegrafica\\3709749-advice-consult-mobile-service-system_108073.png");
        button1 = new JButton(IncluirImage);
        button2 = new JButton(LimparImage);
        button3 = new JButton(SairImage);
        button4 = new JButton(ConsultarImage);
        button5 = new JButton(ConsultarTodosImage);
        
        
        
        button1.setText("incluir");
        
        button2.setText("Limpar");
        button3.setText("Sair");
        button4.setText("Consultar");
        button5.setText("Consultar Todos");
        
       
       
        Rotulo1.setBounds(50,20,130,20);
        Rotulo2.setBounds(50,50,130,20);
        Rotulo3.setBounds(50,80,80,20);
        Rotulo4.setBounds(50,110,80,20);
        Rotulo5.setBounds(50,140,80,20);
        Rotulo6.setBounds(50,170,80,20);
        Rotulo7.setBounds(50,200,80,20);
        Rotulo8.setBounds(50,230,80,20);
        Rotulo9.setBounds(50,260,80,20);
        Rotulo10.setBounds(50,290,80,20);
        Rotulo11.setBounds(50,320,130,20);
        Rotulo12.setBounds(50,350,130,20);
        
        Texto1.setBounds(200,20,130,20);
        Texto2.setBounds(200,50,130,20);
        Texto3.setBounds(200,80,130,20);
        Texto4.setBounds(200,110,130,20);
        Texto5.setBounds(200,140,130,20);
        Texto7.setBounds(200,200,130,20);  
        Texto10.setBounds(200,290,130,20); 
        Texto11.setBounds(200,320,130,20); 
        Texto12.setBounds(200,350,130,20); 
        
        opcao1.setBounds(200,230,130,20);
        opcao2.setBounds(350,230,130,20);
        
        Campo8.setBounds(200,170,130,20);
        
        Campo9.setBounds(200,260,130,20); 
        Campo11.setBounds(200,320,130,20);
        Campo12.setBounds(200,350,130,20); 
        
        button1.setBounds(50,380,130,20);
        button2.setBounds(200,380,130,20);
        button3.setBounds(350,380,130,20);
        button4.setBounds(50,410,130,20);
        button5.setBounds(200,410,130,20);
        
        tela.add(Rotulo1);
        tela.add(Rotulo2);
        tela.add(Rotulo3);
        tela.add(Rotulo4);
        tela.add(Rotulo5);
        tela.add(Rotulo6);
        tela.add(Rotulo7);
        tela.add(Rotulo8);
        tela.add(Rotulo9);
        tela.add(Rotulo10);
        tela.add(Rotulo11);
        tela.add(Rotulo12); 
        
        tela.add(Texto1);
        tela.add(Texto2);
        tela.add(Texto3);
        tela.add(Texto4);
        tela.add(Texto5);
        tela.add(Texto6);
        tela.add(Texto7);
        tela.add(Texto8);
        tela.add(Texto9);
        tela.add(Texto10);
        tela.add(Texto11);
        tela.add(Texto12);
        
        tela.add(opcao1);
        tela.add(opcao2);
        
        
        tela.add(Campo8);
        
        tela.add(Campo9);
        tela.add(Campo11);
        tela.add(Campo12);
        
        tela.add(button1);
        tela.add(button2);
        tela.add(button3);
        tela.add(button4);
        tela.add(button5);
        
        setSize(500, 550);
        setVisible(true);
        setLocationRelativeTo(null);
        
      
  } 
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceGrafica app = new InterfaceGrafica();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
