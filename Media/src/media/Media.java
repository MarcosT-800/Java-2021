/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

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
public class Media extends JFrame {
   JLabel rotulo1, rotulo2, rotulo3, rotulo4, exibir1;
   JTextField texto1, texto2, texto3, texto4;
   JButton somar;
   public Media(){
       super("Media");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel("1 Nota ");
       rotulo2 = new JLabel("2 Nota ");
       rotulo3 = new JLabel("3 Nota ");
       rotulo4 = new JLabel("4 Nota ");
       texto1= new JTextField(5);
       texto2= new JTextField(5);
       texto3= new JTextField(5);
       texto4= new JTextField(5);
       exibir1 = new JLabel("");
      
       somar = new JButton("Calcular");
       
       rotulo1.setBounds(50,30,100,20); rotulo2.setBounds(50,60,100,20); rotulo3.setBounds(50,90,100,20); rotulo4.setBounds(50,120,100,20);
       texto1.setBounds(120,30,200,20); texto2.setBounds(120,60,200,20); texto3.setBounds(120,90,200,20); texto4.setBounds(120,120,200,20);
       exibir1.setBounds(50,190,200,20); somar.setBounds(150,170,100,20);
       
       
       somar.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int Nota1,Nota2,Nota3, Nota4, somar;
               somar=0;
               Nota1=0;
               Nota2=0;
               Nota4=0;
               Nota1 = Integer.parseInt(texto1.getText());
               Nota2 = Integer.parseInt(texto2.getText());
               Nota3 = Integer.parseInt(texto3.getText());
               Nota4 = Integer.parseInt(texto4.getText());
               somar = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
               
               exibir1.setVisible(true);
             
               exibir1.setText("A Media é: "+somar);
            
           }
           }
       );
           
           
   exibir1.setVisible(false);
  
   
   tela.add(rotulo1); tela.add(rotulo2);  tela.add(rotulo3); tela.add(rotulo4);
   tela.add(texto1); tela.add(texto2);  tela.add(texto3); tela.add(texto4);
   tela.add(exibir1); tela.add(somar);
  
    
   setSize(450,270);
   setLocationRelativeTo(null);
   setVisible(true);
       
   }
 

    public static void main(String[] args) {
        // TODO code application logic here
     Media app = new  Media();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
