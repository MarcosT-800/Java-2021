/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_exercicios;

/**
 *
 * @author Lucas
 */
//classe animal
public class Animal { 
String nome;
float comprimento;
int numerodepatas;
String cor;
String ambiente;
float velocidadeMedia;

//metodo contrutor 
public Animal(String nome, float comprimento, int numerodepatas, String cor, String ambiente, float velocidadeMedia) {
    this.nome = nome;
    this.comprimento = comprimento;
    this.numerodepatas = numerodepatas;
    this.cor = cor;
    this.ambiente = ambiente;
    this.velocidadeMedia = velocidadeMedia;
 }                                                 

//metodo getter e setter
 public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumerodepatas() {
        return numerodepatas;
    }

    public void setNumerodepatas(int numerodepatas) {
        this.numerodepatas = numerodepatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
    
 //Criação do metodo Dados
    public static void dados(){
     System.out.println("Nome: ");
     System.out.println(" Comprimento: ");
     System.out.println("Numero de patas: ");
     System.out.println(" Cor: " );
     System.out.println("Ambiente: ");
     System.out.println("Velocidade Media: ");
    }
   
    //Classe Peixe herdando a Classe Animal
    public class Peixe extends Animal {
    private String caracteristica;
    //metodo contrudor herdando a Classe Animal
    public Peixe(String nome, float comprimento, int numerodepatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
    super(nome, comprimento, numerodepatas, cor, ambiente, velocidadeMedia);
        
        this.nome = nome;
        this.comprimento = comprimento;
        this.numerodepatas = numerodepatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
        this.caracteristica = caracteristica;
    }
   //getter e setter do atributo caracteristica
    public String getCracteristica()
    {
        return this.caracteristica;
    }
   
    public void setCaracteristica(String caracteristica)
    {
        this.caracteristica = caracteristica;
    }
   //Metodo que exibirá os dados do peixe
    public void dadosPeixe()
    {
        String str = "Dados do Peixe: Nome: " + this.nome + "Comprimento: " + this.comprimento +
                     "Número de patas: " + this.numerodepatas + "Cor: " + this.cor +
                     "Ambiente: " + this.ambiente + "Velocidade Média: " + this.velocidadeMedia + " km/h" +
                     "Caracteristica: " + this.caracteristica;
           
           
        System.out.println(str);
    }
}
    //Metodo Mamifero com herança da classe Animal
    public class Mamifero extends Animal{
        String alimento;
        //metodo construtor da classe Mamifero herdando a Classe Animal
        public Mamifero(String nome, float comprimento, int numerodepatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
            super(nome, comprimento, numerodepatas, cor, ambiente, velocidadeMedia);
            
            
        }
        //getter e setter do atributo alimento
        public String getAlimento() {
            return alimento;
        }

        public void setAlimento(String alimento) {
            this.alimento = alimento;
        }
        //Metodo que exibirá os dados do Mamifero
        public void dadosMamifero() {
        String str = "Dados do Mamifero: Nome: " + this.nome + " Comprimento: " + this.comprimento +
                     "Número de patas: " + this.numerodepatas + "Cor: " + this.cor +
                     "Ambiente: " + this.ambiente + "Velocidade Média: " + this.velocidadeMedia + " km/h" +
                     "Alimentos: " + this.alimento;
           
        System.out.println(str);  
        
     }
   }
  
}
 


