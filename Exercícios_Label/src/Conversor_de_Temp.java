
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author BEM VINDO
 */
public class Conversor_de_Temp extends JFrame {
   JLabel rotulo1, rotulo2, rotulo3,rotulo4, rotulo5,rotulo6, exibir1, exibir2, exibir3, exibir4;
   JTextField texto1, texto2, texto3, texto4, texto5;
   JButton calcular, subtrair, dividir, multiplicar;
   ImageIcon Icon;
   public Conversor_de_Temp(){
       super("Media");
       Container tela = getContentPane();
       setLayout(null);
     
       rotulo3 = new JLabel("Graus Celcius: ");
       rotulo4 = new JLabel("Graus Farenheit: ");
       rotulo5 = new JLabel("Graus Kelvin: ");
       rotulo6 = new JLabel("Conversor De Temperatura");
       
      
      
       rotulo3.setForeground(Color.white);
       rotulo4.setForeground(Color.white);
       rotulo5.setForeground(Color.white);
       rotulo6.setForeground(Color.white);
       
      
      
       texto3= new JTextField(5);
       texto4= new JTextField(5);
       texto5= new JTextField(5);
       
       exibir1 = new JLabel("");
       exibir2 = new JLabel("");
       exibir3 = new JLabel("");
       exibir4 = new JLabel("");
     
       ImageIcon Calcular = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\Exercícios_Label\\src\\exercícios_label\\Calculator_30001.png");
       calcular = new JButton(Calcular);
       calcular.setText("Calcular");
       
      
       rotulo3.setBounds(110,120,100,20); texto3.setBounds(180,120,80,20);
       rotulo4.setBounds(110,150,100,20); texto4.setBounds(180,150,80,20);
       rotulo5.setBounds(110,220,100,20); texto5.setBounds(180,220,80,20);
       rotulo6.setBounds(140,90,200,20); 
       exibir1.setBounds(50,120,200,20); calcular.setBounds(143,190,135,20);
       exibir2.setBounds(50,140,200,20);
       exibir3.setBounds(50,160,200,20);
       exibir4.setBounds(50,180,200,20);
       
       
       calcular.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double N1, N2, N3, N4, Média;
               N1=0;
               N2=0;
               N3=0;
               N4=0;
               Média=0;
             
               N2 = Integer.parseInt(texto2.getText());
               N3 = Integer.parseInt(texto3.getText());
               N4 = Integer.parseInt(texto4.getText());
               
             Média = (N1 + N2 + N3 + N4) / 4;
                
             texto5.setText("Nota :"+ Média);
              
               
               
               
              
           
               
           }
           }
       );
   
   
 getContentPane().setBackground(Color.black);
  
   
  tela.add(rotulo3); tela.add(rotulo4); tela.add(rotulo5); tela.add(rotulo6);
  tela.add(texto3); tela.add(texto4); tela.add(texto5);
  tela.add(exibir1); tela.add(calcular);
   
  
    
   setSize(400,300);
   setLocationRelativeTo(null);
   setVisible(true);
   }


    public static void main(String[] args) {
        // TODO code application logic here
     Conversor_de_Temp app = new Conversor_de_Temp();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
