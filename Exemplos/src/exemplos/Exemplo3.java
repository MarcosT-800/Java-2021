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
public class Exemplo3 {
    public static void main(String[] args) {
        // TODO code application logic here
        int idade1, idade2;
        String nome1, nome2;
        
        nome1 = JOptionPane.showInputDialog("digite o nome da 1 pessoa: ");
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("digite a idade da 1 pessoa"));
        
        nome2 = JOptionPane.showInputDialog("digite o nome da 2 pessoa: ");
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("digite a idade da 2 pessoa"));
        
        String texto = pessoamaisvelha(nome1, idade1, nome2, idade2);
        
        JOptionPane.showMessageDialog(null,texto);
    }
    
    static String pessoamaisvelha(String n1,int id1, String n2, int id2)
    {
        if(id1 > id2)
            return n1+ " é a pessoa mais velha";
        else
            if(id2>id1)
                return n2+ " é a pessoa mais velha";
            else 
                return n1+ " e "+n2+ " tem a mesma idade";
    }
}
    
    

