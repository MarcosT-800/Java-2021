package CadastroDeCliente;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
/**
 * @author Rosicléia Frasson
 */
public class CadastroDeCliente extends JFrame {
    JLabel Rotulo1, Rotulo2, Rotulo3, Rotulo4;
    JTextField Texto1, Texto2, Texto3, Texto4;
    JButton button1, button2, button3;
    JPanel painelFundo;
    JTable table;
    JScrollPane barraRolagem;
    ImageIcon icone;

   

    public CadastroDeCliente() {
        super ("Cadastro de Cliente");
       Container tela = getContentPane();
       setLayout(null);

        Rotulo1 = new JLabel("Nome");
        Rotulo2 = new JLabel("Endereço");
        Rotulo3 = new JLabel("Cidade");
        Rotulo4 = new JLabel("Estado");
        
        Texto1 = new JTextField(03);
        Texto2 = new JTextField(03);
        Texto3 = new JTextField(03);
        Texto4 = new JTextField(03);
        
        ImageIcon IncluirImage = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\InterfaceGrafica\\src\\interfacegrafica\\make_configuration_config_5893.png");
        ImageIcon LimparImage = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\InterfaceGrafica\\src\\interfacegrafica\\1486503744-backspace-clean-clear-delete-remove-erase_81258.png");
        ImageIcon SairImage = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\InterfaceGrafica\\src\\interfacegrafica\\1486505265-document-file-export-sending-exit-send_81434.png");
       
        button1 = new JButton(IncluirImage);
        button2 = new JButton(LimparImage);
        button3 = new JButton(SairImage);
        
        button1.setText("incluir");
        button2.setText("Limpar");
        button3.setText("Sair");
        
        Rotulo1.setBounds(50,100,130,20);
        Rotulo2.setBounds(50,130,130,20);
        Rotulo3.setBounds(50,160,80,20);
        Rotulo4.setBounds(50,190,80,20);
        
        Texto1.setBounds(200,100,130,20);
        Texto2.setBounds(200,130,130,20);
        Texto3.setBounds(200,160,130,20);
        Texto4.setBounds(200,190,130,20);
        
        button1.setBounds(50,340,130,20);
        button2.setBounds(200,340,130,20);
        button3.setBounds(350,340,130,20);
        
      
        
        button1.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               
        String nome = Texto1.getText();       
        String endereco = Texto2.getText(); 
        String cidade = Texto3.getText();  
        String estado = Texto4.getText();  
       JOptionPane.showMessageDialog(null," DADOS DO CLIENTE"
               + "\n Nome: " + nome
               +  "\n Endereco: " +endereco
               +  "\n Cidade: " +cidade
               +  "\n Estado: " +estado);
        
               
           }});
        
        button2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Texto1.setText(null);
                                                      Texto2.setText(null);
                                                      Texto3.setText(null);
                                                      Texto4.setText(null);
                                                   
                                                      
		}
	});
        
         button3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
                                                   
                                                      
		}
	});
        
       Object[][] dados = { // linhas
        {" ", " ","  ","  "},
        {" ", " "," "," "},
        {" ", " "," "," "},
        {" ", " "," "," "}};
         String[] colunas = {"Title1", "Title2","Title3","Title4"}; //colunas
        
        table = new JTable(dados,colunas);
        table.setPreferredScrollableViewportSize(new Dimension(300,200));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane=new JScrollPane(table);
        
        scrollPane.setBounds(30,220,480,100);
        
        tela.add(Rotulo1);
        tela.add(Rotulo2);
        tela.add(Rotulo3);
        tela.add(Rotulo4);
 
        
        tela.add(Texto1);
        tela.add(Texto2);
        tela.add(Texto3);
        tela.add(Texto4);
        
        tela.add(button1);
        tela.add(button2);
        tela.add(button3);

        tela.add(scrollPane);
        setSize(550, 550);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
       CadastroDeCliente app = new  CadastroDeCliente();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}