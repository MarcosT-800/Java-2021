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
public class FormulaDeBhaskara extends JFrame{

    /**
     * @param args the command line arguments
     */
   JLabel rotulo1, rotulo2, rotulo3,rotulo4, rotulo5,rotulo6, exibir1, exibir2, exibir3, exibir4;
   JTextField texto1, texto2, texto3, texto4, texto5;
   JButton calcular, subtrair, dividir, multiplicar;
   public FormulaDeBhaskara(){
       super("Formula de Bhaskara");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel("Valor de A: ");
       rotulo2 = new JLabel("Valor de B: ");
       rotulo3 = new JLabel("Valor de C: ");
       rotulo4 = new JLabel("X': ");
       rotulo5 = new JLabel("X'': ");
       rotulo6 = new JLabel("FORMULÁ DE BHASKARÁ");
       
       rotulo1.setForeground(Color.white);
       rotulo2.setForeground(Color.white);
       rotulo3.setForeground(Color.white);
       rotulo4.setForeground(Color.white);
       rotulo5.setForeground(Color.white);
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
     
       calcular = new JButton("Calcular");
       
       rotulo1.setBounds(110,60,100,20); rotulo2.setBounds(110,90,100,20);
       rotulo3.setBounds(110,120,100,20); texto3.setBounds(180,120,80,20);
       rotulo4.setBounds(130,190,100,20); texto4.setBounds(150,190,150,20);
       rotulo5.setBounds(130,220,100,20); texto5.setBounds(150,220,150,20);
       rotulo6.setBounds(140,20,200,20); 
       texto1.setBounds(180,60,80,20); texto2.setBounds(180,90,80,20);
       exibir1.setBounds(50,120,200,20); calcular.setBounds(160,160,110,20);
       exibir2.setBounds(50,140,200,20);
       exibir3.setBounds(50,160,200,20);
       exibir4.setBounds(50,180,200,20);
       
       
       calcular.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double a, b, c, x1, x2, delta;
               a=0;
               b=0;
               c=0;
               x1=0;
               x2=0;
               a = Integer.parseInt(texto1.getText());
               b = Integer.parseInt(texto2.getText());
               c = Integer.parseInt(texto3.getText());
               delta = Math.pow(b, 2) - (4 * a * c);
               if (delta > 0) {
                   x1 = (-b + Math.sqrt(delta)) / (2 * a);
                   x2 = (-b - Math.sqrt(delta)) / (2* a);
                   texto4.setText(" "+ x1);
                   texto5.setText(" "+ x2);
               }
                if (delta == 0) {
                  x1 = -b / (2 * a);
                   texto4.setText(""+x1);
                   texto5.setText(" "+x1);
                  
               }
               if (delta < 0) {
                   texto4.setText("Com estes Números");
                   texto5.setText("Não há resultado reais");
              }
               
                
               
              
               
               
               
              
           
               
           }
           }
       );
   
   
 getContentPane().setBackground(Color.black);
  
   
   tela.add(rotulo1); tela.add(rotulo2); tela.add(rotulo3); tela.add(rotulo4); tela.add(rotulo5); tela.add(rotulo6);
   tela.add(texto1); tela.add(texto2); tela.add(texto3); tela.add(texto4); tela.add(texto5);
   tela.add(exibir1); tela.add(calcular);
   
  
    
   setSize(400,350);
   setLocationRelativeTo(null);
   setVisible(true);
   }

    public static void main(String[] args) {
        // TODO code application logic here
     FormulaDeBhaskara app = new  FormulaDeBhaskara();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

