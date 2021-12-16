/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//importando as classes
package poupanca;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author BEM VINDO
 */
//classe poupanca que extende o JFrame 
public class Poupanca extends JFrame{

    /**
     * @param args the command line arguments
     */
    //criando as variáveis 
   JLabel texto1, texto2, texto3,texto4, texto5;
   JTextField campo1, campo2, campo3, campo4, campo5;
   JButton somar;
   //metodo construtor
   public Poupanca(){
       super("Poupança");
       Container tela = getContentPane();
       setLayout(null);
       
       //dando valores aos labels 
       texto1 = new JLabel("Juros ao mês %:");
       texto2 = new JLabel("Números Anos:");
       texto3 = new JLabel("Depósito Mensal:");
       texto4 = new JLabel("Total Poupado R$:");
       texto5 = new JLabel("");
       
       //instanciando os TextFields
       campo1= new JTextField(5);
       campo2= new JTextField(5);
       campo3= new JTextField(5);
       campo4= new JTextField(5);
       campo5= new JTextField(5);
 
      
       //informando as coordenadas que cada label irá ficar no layout 
       texto1.setBounds(80,60,100,20);
       texto2.setBounds(80,90,100,20);
       texto3.setBounds(80,120,100,20);
       texto4.setBounds(80,150,180,20);
       texto5.setBounds(190,150,180,20);
       
       //informando as coordenadas que cada JTextFileld irá ficar no layout 
       campo1.setBounds(180,60,80,20);
       campo2.setBounds(180,90,80,20);
       campo3.setBounds(180,120,80,20); 
      
      //instanciando o botão somar e dando um valor a ele 
       somar = new JButton("Ok");
       ///informando as coordenadas que o botão irá ficar no layout 
       somar.setBounds(160,180,110,20);
       
        //ação que o botão terá após clicar nele 
       somar.addActionListener(
           new ActionListener(){
           public void actionPerformed(ActionEvent e){
                //criando as variaveis
               double juros, anos, deposito, total, total1;
               juros=0;
               total1=0;
               anos=0;
               deposito=0;
               total=0;
               
               //dizendo que tudo que estiver no campo 1,2,3 será armazenado na variavel juros, anos  e deposito 
               juros = Integer.parseInt(campo1.getText());
               anos = Integer.parseInt(campo2.getText());
               deposito= Integer.parseInt(campo3.getText());
               
              
               total1 = anos * 12;
               total = total1+((deposito * juros) * 100)/100;
               texto5.setText(total+"%"); //mandando a ação da variavel total aparecer no Texto5 do layout
               
           }
           }
       );
       
     //adicionando os componetes a tela para que eles fiquem visiveis, e não ocultos
   tela.add(campo1);
   tela.add(campo2); 
   tela.add(campo3);
   tela.add(campo4); 
   tela.add(texto1); 
   tela.add(texto2);
   tela.add(texto3);
   tela.add(texto4);
   tela.add(texto5);
   tela.add(somar);
   
  
    //propiedades do layout
   setSize(400,350);//tamanho e largura do layout
   setLocationRelativeTo(null);//em qual posição o layout irá aparecer na tela do usuário 
   setVisible(true);//tornando o layout visivel 
   }
  //metodo principal 
    public static void main(String[] args) {
        // TODO code application logic here
     Poupanca app = new  Poupanca();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//criando as propiedades de fechar minimalizar do layout
    }
}

