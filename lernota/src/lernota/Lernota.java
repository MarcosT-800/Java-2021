/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernota;

//importando a classe JOptionpane
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas
 */
public class Lernota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//chamada do método main
        // TODO code application logic here
        lerNota();

    }
    static void lerNota() {//chamada do metodo lerNota
    //declarando variáveis 
    double n1,n2;
    String nome;
    
    nome=JOptionPane.showInputDialog(null,"digite um nome:");
        n1=Double.parseDouble(JOptionPane.showInputDialog(null,"digite a primeira Nota"));
        n2=Double.parseDouble(JOptionPane.showInputDialog(null,"digite a segunda Nota"));
        JOptionPane.showMessageDialog(null,nome);
     calcularmedia(n1,n2);//chamada do método calcularmedia
}
    private static void calcularmedia(double a1, double a2){ //criando metodo calcularmedia
        double md;
        md=(a1+a2)/2;
        if (md>=7)
            JOptionPane.showMessageDialog(null," aprovado " + md);
        else
            if (md<7)
                JOptionPane.showMessageDialog(null," reprovado " +md);
}
    
}
