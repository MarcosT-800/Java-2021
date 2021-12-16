/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojlist;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author BEM VINDO
 */
public class ExemploJlist2 extends JFrame{
    
      JList lista;
      String cidades[] = {"Rio de janeiro", "Sâo Paulo", " Minas Gerais", "Espirito Santo", "Bahia", " Pernambuco", "Rio Grande do Sul", "Acre"};
      JButton exibir;
      JLabel rotulo;
      public ExemploJlist2(){
          super("Exemplo de List");
          Container tela = getContentPane();
          setLayout(null);
          exibir = new JButton("Exibir;");
          lista = new JList(cidades);
          lista.setVisibleRowCount(5);
          JScrollPane painelRolagem = new JScrollPane(lista);
          lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
          painelRolagem.setBounds(40,50,150,100);
          exibir.setBounds(270,50,100,30);
          exibir.addActionListener(
          new ActionListener(){
              public void actionPerformed(ActionEvent e){
                 Object selecionados[] = lista.getSelectedValues();
                 String resultados = "Valores Selecionados:\n";
                 for(int i=0;i<selecionados.length;i++)
                     resultados += selecionados[i].toString()+"\n";
               JOptionPane.showMessageDialog(null, resultados);
              
                  
              }
          });
          tela.add(painelRolagem);
          tela.add(exibir);
          setSize(400, 250);
          setVisible(true);
          

      }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExemploJlist2 app = new ExemploJlist2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

    

