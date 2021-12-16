/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;
import javax.swing.JOptionPane;


/**
 *
 * @author BEM VINDO
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        //contador somando 
        for (int contador = 0; contador<=5; contador++){
            JOptionPane.showMessageDialog(null,"Contador: "+ contador);
        }
        
        //contador subtruindo 
           for(int i = 70; i>10; i--){
               System.out.println(i);
           }
    
}
}