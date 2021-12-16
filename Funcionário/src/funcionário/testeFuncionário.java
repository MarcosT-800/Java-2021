/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionário;

/**
 *
 * @author Lucas
 */
public class testeFuncionário {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Funcionário testeFuncionário = new Funcionário();
        
         testeFuncionário.nome();
         testeFuncionário.nasc();
         testeFuncionário.salário();
         
         
         testeFuncionário.Calculardesconto();
         testeFuncionário.Informarsalário();
         testeFuncionário.CalcularIdade();
         
         
        
    }
}
