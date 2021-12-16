/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_de_temperatura;

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
public class Conversor_de_Temperatura extends JFrame{

    /**
     * @param args the command line arguments
     */
 JLabel rotulo1, rotulo2, rotulo3,rotulo4, rotulo5,rotulo6, exibir1, exibir2, exibir3, exibir4;
   JTextField texto1, texto2, texto3, texto4, texto5;
   JButton calcular;
   public Conversor_de_Temperatura(){
       super("Conversor_de_Temperatura");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel("Graus Celsius ");
       rotulo2 = new JLabel("Graus Fahrenheit ");
       rotulo3 = new JLabel("Graus Kelvin ");
       rotulo4 = new JLabel("Conversor_de_Temperatura ");
    
       
       rotulo1.setForeground(Color.white);
       rotulo2.setForeground(Color.white);
       rotulo3.setForeground(Color.white);
       rotulo4.setForeground(Color.white);
      
       
       texto1= new JTextField(5);
       texto2= new JTextField(5);
       texto3= new JTextField(5);
       
       exibir1 = new JLabel("");
       exibir1.setForeground(Color.white);

       calcular = new JButton("Converter");
       
       rotulo1.setBounds(110,60,200,20); rotulo2.setBounds(110,90,200,20);
       rotulo3.setBounds(110,120,100,20); texto3.setBounds(212,120,80,20);
       rotulo4.setBounds(120,30,200,20); 
       
       texto1.setBounds(212,60,80,20); texto2.setBounds(212,90,80,20);
       exibir1.setBounds(350,100,200,20); calcular.setBounds(110,160,160,20);
       
       
       calcular.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double C,K, F;
               C=0;
               K=0;
               F=0;
               C = Double.parseDouble(texto1.getText());
              
               
               K = C + 273.15;
               F = (C * 9/5) + 32;
               
               texto2.setText(""+K);
               texto3.setText(""+F);
               
               
              
            
            
              
              
           }
           }
               
           
       );
   
   
 getContentPane().setBackground(Color.black);
  
   
   tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3); tela.add(rotulo4); 
   tela.add(texto1); tela.add(texto2); tela.add(texto3);
   tela.add(exibir1); tela.add(calcular);
   
  
    
   setSize(400,250);
   setLocationRelativeTo(null);
   setVisible(true);
   }

    public static void main(String[] args) {
        // TODO code application logic here
     Conversor_de_Temperatura app = new  Conversor_de_Temperatura();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


    

