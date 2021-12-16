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
public class Funcionário {

    private String nome;
    private int salário;
    private String nasc;
    
    
    public Funcionário() {
        this("","","");
    }
    
    public Funcionário(String nome, String nasc, String salário ) {
        this.salário = 4000;
        this.nasc = "28/01/1965";
        this.nome = "Helena Reis";
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salário
     */
    public int getSalário() {
        return salário;
    }

    /**
     * @param salário the salário to set
     */
    public void setSalário(int salário) {
        this.salário = salário;
    }

    /**
     * @return the nasc
     */
    public String getNasc() {
        return nasc;
    }

    /**
     * @param nasc the nasc to set
     */
    public void setNasc(String nasc) {
        this.nasc = nasc;
    }
    
     public void nome(){
        System.out.println("Nome:"+nome);
    }
      public void nasc(){
        System.out.println("Nasc:"+nasc);
    }
       public void salário(){
        System.out.println("Salário:" +salário);
    }
    
     public void Calculardesconto(){
        System.out.println("Desconto:: ERRO!!!");
    }
     public void Informarsalário(){
        System.out.println("O salário é :"+ salário);
     }
     public void CalcularIdade(){
        System.out.println("A idade é:"+ (2021 - 1965));
     }
     

    }
    

