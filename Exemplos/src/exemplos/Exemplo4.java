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
public class Exemplo4 {
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("entre com um numero"));
        
        if (Restopordois(num) == 0)
           JOptionPane.showMessageDialog(null,"o numero é par");
           
           else
           JOptionPane.showMessageDialog(null,"o numero é impar");
    }
    
    static int Restopordois(int a)
    {
        return a % 2;
    }
}
           
    

