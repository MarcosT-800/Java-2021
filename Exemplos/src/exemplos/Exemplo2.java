/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Exemplo2 {
     public static void main(String[] args) {
        // TODO code application logic here
        int t;
        String p;
        p = JOptionPane.showInputDialog("digite uma palavra: ");
        t=tamanho(p);
        JOptionPane.showMessageDialog(null,p+ " possui" +t+ " caracteres ");
     }
     static void digite()
     {
         JOptionPane.showMessageDialog(null, "digite uma palavra ");
     }
     static int tamanho(String x)
     {
         return x.length();
     }
}
        
    

