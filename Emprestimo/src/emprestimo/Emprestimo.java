/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author BEM VINDO
 */
//classe que está extendendo o JFrame
public class Emprestimo extends JFrame{
//criando variáveis 
JLabel Rotulo1, Rotulo2, Rotulo3, Rotulo4, Rotulo5;
JTextField Texto1, Texto2, Texto3;
JComboBox lista;
JButton button1;
//metodo construtor 
public Emprestimo(){
        super("Emprestimo");
        Container tela = getContentPane();
        setLayout(null);
       
        //dando valores ao JLabel
        Rotulo1 = new JLabel("Nome:");
        Rotulo2 = new JLabel("Classe:");
        Rotulo3 = new JLabel("RM:");
        Rotulo4 = new JLabel("ALUNO:");
        Rotulo5 = new JLabel("EMPRESTIMO");
     
        //dando valores ao botão 
        button1 = new JButton("Emprestar");
        
       //mudando às propiedades da fonte do JLabel 
       Rotulo4.setFont(new Font("Serif", Font.BOLD, 15));
       Rotulo5.setFont(new Font("Serif", Font.PLAIN, 20));
       
       
       //mudando a cor dos rotulos para branco
       Rotulo1.setForeground(Color.white);
       Rotulo2.setForeground(Color.white);
       Rotulo3.setForeground(Color.white);
       Rotulo4.setForeground(Color.white);
       Rotulo5.setForeground(Color.white);
       
      //mudando a cor do layout para preto 
       getContentPane().setBackground(Color.black);
       
        
        Texto1 = new JTextField(03);
        Texto2 = new JTextField(03);
        Texto3 = new JTextField(03);
      
      
        //Criando a Lista JComboBox com o nome dos Livros 
        lista = new JComboBox();
        lista.addItem("1-Livros Harry Potter");
        lista.addItem("2-Livro Game of Thrones");
        lista.addItem("3-Livro Ladrão de Raios");
        lista.addItem("4-Livro Mar de Monstros");
        lista.addItem("5-Livro Labirinto do Fauno");
         
        //coodenadas que cada elemento devera ocupar no layout 
        lista.setBounds(330,50,130,20);
       
        Rotulo1.setBounds(50,80,130,20);
        Rotulo2.setBounds(50,110,130,20);
        Rotulo3.setBounds(50,140,130,20);
        Rotulo4.setBounds(50,50,130,20);
        Rotulo5.setBounds(170,20,330,20);
       
        Texto1.setBounds(180,80,130,20);
        Texto2.setBounds(180,110,130,20);
        Texto3.setBounds(180,140,130,20);
        
        button1.setBounds(110,190,130,20);
        
      //ação que o botão terá ao clicar nele
        button1.addActionListener(
      new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
           //Criando às variáveis      
           int  rm;
           
           //Criando uma variável e dizendo que ela é igual ao JComboBox e que ela tem que imprimir a opção que estiver Selecionado
            String Livro = (String) lista.getSelectedItem();
            
            //Criando uma variavel e dizendo vai armazenar tudo aquilo que for escrito no texto um que no caso é o nome do usuário
            String nome = (String) Texto1.getText();
            
            //Criando uma variavel e dizendo vai armazenar tudo aquilo que for escrito no texto um que no caso é a classe do usuário
            String classe = (String) Texto2.getText();
          
           //Dizendo que a variável rm vai armazenar tudo que for escrito no Texto3 que no caso é o RM do usuário
            rm = Integer.parseInt(Texto3.getText());
 
            //exibindo todas às variáveis assima na tela através de 5 rotulos
           JOptionPane.showMessageDialog(null, "O Livro Emprestado: "+Livro+ "\n O Nome do Aluno: "+nome+ "\n Classe do Aluno: "+ classe+ "\n RM do Aluno: "+ rm);
           
                
        }
    
});
        
        //adicionando os componentes ao layout para que fiquem visíveis 
        tela.add(Rotulo1);
        tela.add(Rotulo2);
        tela.add(Rotulo3);
        tela.add(Rotulo4);
        tela.add(Rotulo5);
      
      
        tela.add(Texto1);
        tela.add(Texto2);
        tela.add(Texto3);
        
        tela.add(button1);
        
        tela.add(lista);
        
        //propiedades da tela 
        setSize(500, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        
      
  } 
       

    /**
     * @param args the command line arguments
     */
//metodo principal 
    public static void main(String[] args) {
        // TODO code application logic here
        Emprestimo app = new Emprestimo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
