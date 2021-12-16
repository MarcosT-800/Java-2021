/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativo.menu.comissão;

/**
 *
 * @author Lucas
 */
public class Vendedor {

    private double nome;
    private double salarioBase;
    
public Vendedor(double nome, double salarioBase){
    this.nome = nome;
    this.salarioBase = salarioBase;
}
    /**
     * @return the nome
     */
    public double getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(double nome) {
        this.nome = nome;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public void CriarVendedor(double nome, double salarioBase){
    }
    
    public void CalcularComissao(double nome, double salarioBase){
     System.out.println("");
    }
    public void MostrarVendedor(double nome){
      this.getNome();
    }
            
    public void sair(){
        System.exit(0);
    }

}

   