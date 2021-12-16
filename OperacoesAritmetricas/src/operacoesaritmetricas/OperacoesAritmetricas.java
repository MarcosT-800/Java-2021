/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoesaritmetricas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author BEM VINDO
 */
public class OperacoesAritmetricas extends JFrame {
   JLabel rotulo1, rotulo2, exibir1, exibir2, exibir3, exibir4;
   JTextField texto1, texto2;
   JButton somar, subtrair, dividir, multiplicar;
   public OperacoesAritmetricas(){
       super("Exemplo de soma");
       Container tela = getContentPane();
       setLayout(null);
       rotulo1 = new JLabel("1 Número: ");
       rotulo2 = new JLabel("2 Número: ");
       texto1= new JTextField(5);
       texto2= new JTextField(5);
       exibir1 = new JLabel("");
       exibir2 = new JLabel("");
       exibir3 = new JLabel("");
       exibir4 = new JLabel("");
       somar = new JButton("Somar");
       
       rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);
       texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
       exibir1.setBounds(50,120,200,20); somar.setBounds(150,100,80,20);
       exibir2.setBounds(50,140,200,20);
       exibir3.setBounds(50,160,200,20);
       exibir4.setBounds(50,180,200,20);
       
       somar.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int numero1,numero2,soma, subtrair, dividir, multiplicar;
               soma=0;
               subtrair=0;
               dividir=0;
               multiplicar=0;
               numero1 = Integer.parseInt(texto1.getText());
               numero2 = Integer.parseInt(texto2.getText());
               soma = numero1 + numero2;
               subtrair = numero1 - numero2;
               dividir = numero1 / numero2;
               multiplicar = numero1 * numero2;
               exibir1.setVisible(true);
               exibir2.setVisible(true);
               exibir3.setVisible(true);
               exibir4.setVisible(true);
               exibir1.setText("A Soma é: "+soma);
               exibir2.setText("A Subtração é: "+subtrair);
               exibir3.setText("A Divisão é: "+dividir);
               exibir4.setText("A Multiplicação é: "+multiplicar);
           }
           }
       );
           
           
   exibir1.setVisible(false);
   exibir2.setVisible(false);
   exibir3.setVisible(false);
   exibir4.setVisible(false);
   
   tela.add(rotulo1); tela.add(rotulo2);
   tela.add(texto1); tela.add(texto2);
   tela.add(exibir1); tela.add(somar);
   tela.add(exibir2);
   tela.add(exibir3);
   tela.add(exibir4);
    
   setSize(400,250);
   setVisible(true);
       
   }
 

    public static void main(String[] args) {
        // TODO code application logic here
     OperacoesAritmetricas app = new  OperacoesAritmetricas();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
