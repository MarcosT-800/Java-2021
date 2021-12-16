/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemeplojcombobox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author BEM VINDO
 */
public class ExemploJComboBox extends JFrame{
      JComboBox lista;
      String cidades[] = {"Rio de janeiro", "Sâo Paulo", " Minas Gerais", "Espirito Santo", "Bahia", " Pernambuco", "Rio Grande do Sul", "Acre"};
      JButton exibir;
      JLabel rotulo;
      public ExemploJComboBox() {
          super("Exemplo de JComboBox");
          Container tela = getContentPane();
          setLayout(null);
          exibir = new JButton("Exibir;");
          rotulo = new JLabel("");
          lista = new JComboBox(cidades);
          lista.setMaximumRowCount(5);
          lista.setBounds(50,50,150,30);
          exibir.setBounds(270,50,100,30);
          rotulo.setBounds(50,150,200,30);
          exibir.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent e){
                  rotulo.setText("o estado é: " + lista.getSelectedItem().toString());
                  
              }
          });
          tela.add(lista);
          tela.add(exibir);
          tela.add(rotulo);
          setSize(400, 250);
          setVisible(true);
          

      }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExemploJComboBox app = new ExemploJComboBox();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

