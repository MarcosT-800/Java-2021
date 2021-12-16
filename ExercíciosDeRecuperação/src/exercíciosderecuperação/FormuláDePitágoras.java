/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercíciosderecuperação;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author BEM VINDO
 */
public class FormuláDePitágoras extends JFrame{
    
     JLabel rotulo1, rotulo2, rotulo3,rotulo4, rotulo5,rotulo6, exibir1, exibir2, exibir3, exibir4;
   JTextField texto1, texto2, texto3, texto4, texto5;
   JButton calcular, subtrair, dividir, multiplicar;
   public FormuláDePitágoras(){
       super("Formula de Pitágoras");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel("Valor de A: ");
       rotulo2 = new JLabel("Valor de B: ");
   
       rotulo4 = new JLabel("C': ");
   
       rotulo6 = new JLabel("FORMULÁ DE PITÁGORAS");
       texto1= new JTextField(5);
       texto2= new JTextField(5);
       
       texto4= new JTextField(5);
       
       
      
     
       calcular = new JButton("Calcular");
       
       rotulo1.setBounds(110,60,100,20); rotulo2.setBounds(110,90,100,20);
      
       rotulo4.setBounds(130,190,100,20); texto4.setBounds(150,190,150,20);
       
       rotulo6.setBounds(140,20,200,20); 
       texto1.setBounds(180,60,80,20); texto2.setBounds(180,90,80,20);
       calcular.setBounds(160,160,110,20);
       
       rotulo1.setForeground(Color.white);
       rotulo2.setForeground(Color.white);
     
       rotulo4.setForeground(Color.white);
   
       rotulo6.setForeground(Color.white);
       
       getContentPane().setBackground(Color.black);
       
       calcular.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double a, b, c;
               a=0;
               b=0;
               c=0;
 
               a = Integer.parseInt(texto1.getText());
               b = Integer.parseInt(texto2.getText());
               
               c = (a * a) + (b * b);
               
               texto4.setText("A hipotenusa é :"+ c);
               
                
               
              
               
               
               
              
           
               
           }
           }
       );
   
   

  
   
   tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo4);  tela.add(rotulo6);
   tela.add(texto1); tela.add(texto2); tela.add(texto4);
   tela.add(calcular);
   
  
    
   setSize(400,350);
   setLocationRelativeTo(null);
   setVisible(true);
   }

    public static void main(String[] args) {
        // TODO code application logic here
     FormuláDePitágoras app = new  FormuláDePitágoras();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



