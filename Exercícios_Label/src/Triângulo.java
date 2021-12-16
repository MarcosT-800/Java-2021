/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author BEM VINDO
 */
public class Triângulo extends JFrame {
   JLabel rotulo1, rotulo2, rotulo3,rotulo4, rotulo5,rotulo6, exibir1, exibir2, exibir3, exibir4;
   JTextField texto1, texto2, texto3, texto4, texto5;
   JButton calcular, subtrair, dividir, multiplicar;
   public Triângulo(){
       super("Triângulo");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel(" Lado 1: ");
       rotulo2 = new JLabel("Lado 2: ");
       rotulo3 = new JLabel("Lado 3: ");
       rotulo4 = new JLabel("Lado 4: ");
       rotulo6 = new JLabel("TRIÂNGULO");
       
       rotulo1.setForeground(Color.white);
       rotulo2.setForeground(Color.white);
       rotulo3.setForeground(Color.white);
       rotulo4.setForeground(Color.white);
       rotulo6.setForeground(Color.white);
       
       texto1= new JTextField(5);
       texto2= new JTextField(5);
       texto3= new JTextField(5);
       texto4= new JTextField(5);
       texto5= new JTextField(5);
       
       exibir1 = new JLabel("");
       exibir2 = new JLabel("");
       exibir3 = new JLabel("");
       exibir4 = new JLabel("");
      exibir1.setForeground(Color.white);
      
       ImageIcon Calcular = new ImageIcon("C:\\Users\\BEM VINDO\\Documents\\NetBeansProjects\\Exercícios_Label\\src\\exercícios_label\\Calculator_30001.png");
       calcular = new JButton(Calcular);
     
       calcular.setText("Calcular");
       
       rotulo1.setBounds(110,60,100,20); rotulo2.setBounds(110,90,100,20);
       rotulo3.setBounds(110,120,100,20); texto3.setBounds(180,120,80,20);
       rotulo6.setBounds(190,20,200,20); 
       texto1.setBounds(180,60,80,20); texto2.setBounds(180,90,80,20);
       exibir1.setBounds(340,90,200,20); calcular.setBounds(153,190,135,20);
       exibir2.setBounds(50,140,200,20);
       exibir3.setBounds(50,160,200,20);
       exibir4.setBounds(50,180,200,20);
       
       
       calcular.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double L1, L2, L3;
               int isoceles, Equilátero, Tipo;
               L1=0;
               L2=0;
               L3=0;
               Tipo=0;
               isoceles=0;
               Equilátero=0;
               L1 = Integer.parseInt(texto1.getText());
               L2 = Integer.parseInt(texto2.getText());
               L3 = Integer.parseInt(texto3.getText());
             
               
               if (L1 == L2 && L2 == L3) {
                   
               exibir1.setText("O triângulo é Equilatero ");
                   
               }
               
               if (L1 == L2 && L1 !=L3) {
               exibir1.setText("O triângulo é isoceles ");
               }
               
               if (L2 == L3 && L2 !=L1) {
               exibir1.setText("O triângulo é isoceles  ");
               }
               
               if (L3 == L1 && L3 !=L2) {
               exibir1.setText("O triângulo é isoceles  ");
               }
               
               if (L3 == L2 && L3 !=L1) {
               exibir1.setText("O triângulo é isoceles  ");
               }
               
               if (L1 !=  L2 && L1 != L3 && L2 != L1 && L2!=L1 && L2 != L3 && L3 != L1 && L3 != L2) {
               exibir1.setText("O triângulo é Escaleno  ");
                   
               }   
           }
           }
       );
   
   
 getContentPane().setBackground(Color.black);
  
   
   tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3); tela.add(rotulo4); tela.add(rotulo6);
   tela.add(texto1); tela.add(texto2); tela.add(texto3); tela.add(texto4);
   tela.add(exibir1); tela.add(calcular);
   
  
    
   setSize(500,300);
   setLocationRelativeTo(null);
   setVisible(true);
   }


    public static void main(String[] args) {
        // TODO code application logic here
     Triângulo app = new Triângulo();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
