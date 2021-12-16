/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class IMC extends JFrame {
/**
 *
 * @author BEM VINDO
 */
JLabel rotulo1, rotulo2, exibir1, exibir2, exibir3, exibir4;
   JTextField texto1, texto2;
   JButton somar;
   public IMC(){
       super("Exemplo de soma");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel("PESO: ");
       rotulo2 = new JLabel("ALTURA: ");
       texto1= new JTextField(5);
       texto2= new JTextField(5);
       exibir1 = new JLabel("");
       exibir2 = new JLabel("");
       exibir3 = new JLabel("");
       exibir4 = new JLabel("");
       somar = new JButton("CALCULAR");
       
       rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);
       texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
       exibir1.setBounds(50,120,200,20); somar.setBounds(150,100,80,20);
       exibir2.setBounds(50,140,200,20);
       exibir3.setBounds(50,160,200,20);
       exibir4.setBounds(50,180,200,20);
       
       somar.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double PESO,ALTURA, IMC;
               PESO=0;
               ALTURA=0;
               PESO = Double.parseDouble(texto1.getText());
               ALTURA = Double.parseDouble(texto2.getText());
               IMC = PESO / (ALTURA * ALTURA); 
               
             if(IMC<=18) {
                   exibir1.setText("O seu IMC é "+IMC);
                   exibir2.setText("Seu peso é Baixo");
             }
               
               
               if(IMC>=18.5 && IMC<=24.99){
                   exibir1.setText("O seu IMC é "+IMC);
                   exibir2.setText("Seu peso está ideal");
               }
               
                if(IMC>24.99) {
                   exibir1.setText("O seu IMC é "+IMC);
                   exibir2.setText("Seu peso está acima do ideall");
 
             }
               
               exibir1.setVisible(true);
               exibir2.setVisible(true);
              
               
                 
                         }
           }
       );
           
           
   exibir1.setVisible(false);
   exibir2.setVisible(false);
 
   
   tela.add(rotulo1); tela.add(rotulo2);
   tela.add(texto1); tela.add(texto2);
   tela.add(exibir1); tela.add(somar);
   tela.add(exibir2);
   
    
   setSize(400,250);
   setVisible(true);
       
   }
 

    public static void main(String[] args) {
        // TODO code application logic here
     IMC app = new  IMC();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


