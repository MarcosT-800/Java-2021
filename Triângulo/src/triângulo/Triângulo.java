/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triângulo;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author BEM VINDO
 */
public class Triângulo extends JFrame{

    /**
     * @param args the command line arguments
     */
 JLabel rotulo1, rotulo2, rotulo3,rotulo4, rotulo5,rotulo6, exibir1, exibir2, exibir3, exibir4;
   JTextField texto1, texto2, texto3, texto4, texto5;
   JButton calcular;
   public Triângulo(){
       super("Triângulo");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel("Lado 1: ");
       rotulo2 = new JLabel("Lado 2: ");
       rotulo3 = new JLabel("Lado 3: ");
       rotulo4 = new JLabel("TRIÂNGULO ");
    
       
       rotulo1.setForeground(Color.white);
       rotulo2.setForeground(Color.white);
       rotulo3.setForeground(Color.white);
       rotulo4.setForeground(Color.white);
      
       
       texto1= new JTextField(5);
       texto2= new JTextField(5);
       texto3= new JTextField(5);
       
       exibir1 = new JLabel("");
       exibir1.setForeground(Color.white);

       calcular = new JButton("Verificar Tipo");
       
       rotulo1.setBounds(110,60,100,20); rotulo2.setBounds(110,90,100,20);
       rotulo3.setBounds(110,120,100,20); texto3.setBounds(180,120,80,20);
       rotulo4.setBounds(180,30,100,20); 
       
       texto1.setBounds(180,60,80,20); texto2.setBounds(180,90,80,20);
       exibir1.setBounds(350,100,200,20); calcular.setBounds(110,160,160,20);
       
       
       calcular.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double l1, l2, l3, resultado;
               l1=0;
               l2=0;
               l3=0;
               resultado=0;
               l1 = Integer.parseInt(texto1.getText());
               l2= Integer.parseInt(texto2.getText());
               l3 = Integer.parseInt(texto3.getText());
               exibir1.setVisible(true);
               if (l1==l2 && l1==l3 && l2==l1 && l2==l3 && l3==l1 && l3==l2) {
                   exibir1.setText("O triângulo é Equilatero");
               }
               if (l1==l2 && l1!=l3){
                     exibir1.setText("O triângulo é Isoceles");
               }
                if (l1==l3 && l1!=l2){
                     exibir1.setText("O triângulo é Isoceles");
               }
               if  (l2==l1 && l2!=l3 ){
                    exibir1.setText("O triângulo é Isoceles");
                   
               }
               if  (l3==l2 && l3!=l1 ){
                    exibir1.setText("O triângulo é Isoceles");
               }
                   
                 if  (l1!=l2 && l1!=l3 && l2!=l1 && l2!=l3 && l3!=l1 && l3!=l2){
                    exibir1.setText("O triângulo é Escaleno");
                 }
              
              
           }
           }
               
           
       );
   
   
 getContentPane().setBackground(Color.black);
  
   
   tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3); tela.add(rotulo4); 
   tela.add(texto1); tela.add(texto2); tela.add(texto3);
   tela.add(exibir1); tela.add(calcular);
   
  
    
   setSize(600,330);
   setLocationRelativeTo(null);
   setVisible(true);
   }

    public static void main(String[] args) {
        // TODO code application logic here
     Triângulo app = new  Triângulo();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

