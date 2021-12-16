/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Impotando as classes 
package convertor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author BEM VINDO
 */
// classe principal que extende o JFrame
public class Convertor extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    //criando às variáveis 
   JLabel texto1, texto2, texto3,texto4, texto5;
   JTextField campo1, campo2, campo3, campo4, campo5;
   JButton somar;
   
   //metodo construtor
   public Convertor(){
       super("Convertor");
       Container tela = getContentPane();
       setLayout(null);
       
       //dando valores ao labels 
       texto1 = new JLabel("Valor em Reais:");
       texto2 = new JLabel("");
       texto3 = new JLabel("");
       texto4 = new JLabel("");
      
       //instanciando o Textfild
       campo1= new JTextField(5);
       
       //mostrando as cordenadas que cada um irá ocupar dentro do layout
       texto1.setBounds(80,60,220,20);
       texto2.setBounds(80,90,220,20);
       texto3.setBounds(80,120,220,20);
       texto4.setBounds(80,150,220,20);
       campo1.setBounds(180,60,80,20);
       

       //instaciando o botão somar 
       somar = new JButton("Ok");
       
        //mostrando as cordenadas que o botão irá ocupar dentro do layout
       somar.setBounds(160,180,110,20);
       
       //ação que o botão terá após clicar nele 
       somar.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
               //criando as variaveis
               double euro, dolar, libra, reais;
               dolar=0;
               euro=0;
               libra=0;
               reais=0;
               //dizendo que tudo que estiver no campo 1 será armazenado na variavel reais 
               reais = Integer.parseInt(campo1.getText());
              
               dolar = reais / 5.50;
               texto2.setText("O Valor em Dolares é : $ "+dolar);//mandando a ação da variavel dolar aparecer no Texto2 do layout
               
               euro = reais / 6.36;
               texto3.setText("O Valor em Euro é : € "+euro);//mandando a ação da variavel euro aparecer no Texto3 do layout
               
               libra = reais / 7.50;
               texto4.setText("O Valor em Libras é : £ "+libra);//mandando a ação da variavel libra aparecer no Texto4 do layout
               
           }
           }
       );
   
  //adicionando os componetes a tela para que eles fiquem visiveis, e não ocultos
   tela.add(campo1);
   tela.add(texto1); 
   tela.add(texto2);
   tela.add(texto3);
   tela.add(texto4);
   tela.add(somar);
   
  
   //propiedades do layout
   setSize(400,350);//tamanho e largura do layout
   setLocationRelativeTo(null);//em qual posição o layout irá aparecer na tela do usuário 
   setVisible(true);//tornando o layout visivel 
   }

   //metodo principal 
    public static void main(String[] args) {
        // TODO code application logic here
     Convertor app = new  Convertor();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//criando as propiedades de fechar minimalizar do layout
    }
}


