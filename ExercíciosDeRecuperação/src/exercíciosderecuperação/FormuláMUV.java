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
public class FormuláMUV extends JFrame{   //Só falta arrumar a posição dos icones !!!
    
   JLabel rotulo1, rotulo2, rotulo3,rotulo4, rotulo5,rotulo6, rotulo7, rotulo8, rotulo9, rotulo10, rotulo11, rotulo12;
   JTextField texto1, texto2, texto3, texto4, texto5, texto6,  texto7,  texto8,  texto9,  texto10, texto11, texto12;
   JButton calcular, Calcular_aceleracao, Calcular_V0;
   public FormuláMUV(){
       super("Formula MUV");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel("Aceleração: ");
       rotulo2 = new JLabel("Tempo: ");
       rotulo3 = new JLabel("Velocidade Inicial:");
       rotulo4 = new JLabel("*DESCUBRA A ACELERAÇÃO*");
       rotulo5 = new JLabel("Tempo (T):");
       rotulo6 = new JLabel("Velocidade Final (VF):");
       rotulo7 = new JLabel("");
       rotulo8 = new JLabel("*DESCUBRA A VELOCIDADE INICIAL*");
       rotulo9 = new JLabel("Velocidade Final :");
       rotulo10 = new JLabel("Tempo:");
       rotulo11 = new JLabel("Aceleração:");
   
       rotulo12= new JLabel("*DESCUBRA A VELOCIDADE NO INSTANTE T*");
       
       rotulo1.setForeground(Color.white);
       rotulo2.setForeground(Color.white);
       rotulo3.setForeground(Color.white);
       rotulo4.setForeground(Color.white);
       rotulo5.setForeground(Color.white);
       rotulo6.setForeground(Color.white);
       rotulo7.setForeground(Color.white);
       rotulo8.setForeground(Color.white);
       rotulo9.setForeground(Color.white);
       rotulo10.setForeground(Color.white);
       rotulo11.setForeground(Color.white);
       rotulo12.setForeground(Color.white);
       
       getContentPane().setBackground(Color.black);
       
       texto1= new JTextField(5);
       texto2= new JTextField(5);
       texto3= new JTextField(5);
       texto4= new JTextField(5);
       texto5= new JTextField(5);
       texto6= new JTextField(5);
       texto7= new JTextField(5);
       texto8= new JTextField(5);
       texto9= new JTextField(5);
       texto10= new JTextField(5);
       texto11= new JTextField(5);
       texto12= new JTextField(5);
       
      
     
       calcular = new JButton("Calcular");
       Calcular_aceleracao = new JButton("Calcular");
       Calcular_V0 = new JButton("Calcular");
               
       rotulo1.setBounds(100,60,110,20); 
       rotulo2.setBounds(125,90,110,20);
       rotulo3.setBounds(70,120,105,20); 
       rotulo4.setBounds(170,230,200,20);
       rotulo5.setBounds(110,260,100,20);
       rotulo6.setBounds(55,290,200,20); 
       rotulo7.setBounds(50,320,200,20); 
       rotulo8.setBounds(155,400,240,20); 
       rotulo9.setBounds(70,430,200,20); 
       rotulo10.setBounds(125,460,200,20); 
       rotulo11.setBounds(105,490,200,20);
       rotulo12.setBounds(125,30,300,20); 
       texto1.setBounds(180,60,150,20); 
       texto2.setBounds(180,90,150,20);
       texto3.setBounds(180,120,150,20);
       texto4.setBounds(180,260,150,20);
       texto5.setBounds(180,290,150,20);
      
       texto6.setBounds(150,320,200,20); 
       texto7.setBounds(180,430,150,20); 
      
       texto9.setBounds(180,460,150,20); 
       texto10.setBounds(180,490,150,20); 
       texto11.setBounds(150,520,200,20); 
       texto12.setBounds(150,150,200,20); 
     
       
      
       
       calcular.setBounds(195,190,110,20);
       Calcular_aceleracao.setBounds(195,350,110,20);
       Calcular_V0.setBounds(195,550,110,20);
       
       
       calcular.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double  V0, V,  A, Vf, a, t;
               
               Vf=0;
               V0=0;
               a=0;
               t=0;
               V=0;
               A=0;
               
 
               
               a = Integer.parseInt(texto1.getText());
               t = Integer.parseInt(texto2.getText());
               V0 = Integer.parseInt(texto3.getText());
               
               Vf = V0 + (a*t);
               
               texto12.setText(" A velocidade no Instante T é: "+ Vf+"m/s");
               
             
            
         }
           }
       );
   
               
      
         Calcular_aceleracao.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double  V0, V,  A, Vf, a, t;
               
               Vf=0;
               V0=0;
               a=0;
               t=0;
               V=0;
               A=0;
               
               Vf = Integer.parseInt(texto4.getText());
               t = Integer.parseInt(texto5.getText());
               
              
               
                A = t / Vf;
               
               texto6.setText(" A aceleração é: "+ A+"m/s");
               
               
               
               
           
           
           
               
              
               
               
               
              
           
               
           }
           }
       );
   
    Calcular_V0.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double  V0, V,  A, Vf, a, t;
               
               Vf=0;
               V0=0;
               a=0;
               t=0;
               V=0;
               A=0;
               
                Vf = Integer.parseInt(texto7.getText());
                 t = Integer.parseInt(texto9.getText());
                 a = Integer.parseInt(texto10.getText());
                
               
               V0 =  Vf - (a* t);
               

                  texto11.setText(" A Velocidade Inicial é: "+ V0+"m/s");
        }
           }
       );
   
   tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3); tela.add(rotulo4);  tela.add(rotulo5); tela.add(rotulo6);
   tela.add(rotulo7); tela.add(rotulo8); tela.add(rotulo9); tela.add(rotulo10); tela.add(rotulo11); tela.add(rotulo12);
   tela.add(texto1); tela.add(texto2); tela.add(texto3); tela.add(texto4); tela.add(texto5); tela.add(texto6); tela.add(texto7);
   tela.add(texto8); tela.add(texto9); tela.add(texto10); tela.add(texto11); tela.add(texto12);
   tela.add(calcular); tela.add(Calcular_aceleracao); tela.add( Calcular_V0);
   
    
   setSize(500,700);
   setLocationRelativeTo(null);
   setVisible(true);
   }


public static void main(String[] args) {
        // TODO code application logic here
     FormuláMUV app = new  FormuláMUV();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
