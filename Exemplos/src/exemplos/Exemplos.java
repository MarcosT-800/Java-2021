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
public class Exemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        dobro(a);
    }
    
    static void digite()
    {
        JOptionPane.showMessageDialog(null, "digite um numero:: ");
    }
    static void dobro(int n)
    {
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "dobro de " +n+ "é" +d);
    }
    
}
