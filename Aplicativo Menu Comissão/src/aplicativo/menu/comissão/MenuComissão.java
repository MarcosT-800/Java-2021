/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativo.menu.comissão;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas
 */
public class MenuComissão {
    private  Vendedor Vendedor;
    private int opcao;
    private  ConversorNumeros conversor;
    private  EntradaSaidaDados io;

public MenuComissão(){
	this.opcao = -1;
	this.conversor = new ConversorNumeros();
	this.io = new EntradaSaidaDados();
	}
    
public void executarControleComissão(){
    do{
     this.executarMenuPrincipal();
     this.avaliarOpcaoEscolhida();
	}while(this.opcao!=0);
	
}
  private void executarMenuPrincipal (){
    String mensagemMenu = "Selecione uma opcao"

    +"\n 1-  Criar Vendedor "
    +"\n 2 - Realizar Cálculo de Comissão de Vendedor"
    +"\n 3 - Exibir Vendedor"
    +"\n 0 - Sair";
    String entradaDados = io.entradaDados(mensagemMenu);
    this.opcao = conversor.StringToInt(entradaDados);
}
    
 
   private void avaliarOpcaoEscolhida(){
    String saida;
    String nome;
    int sb;
    int comissao;
    double ValorVendido;
    String total = null;
    if(this.opcao != 0 && this.opcao<=4 && this.opcao==1){
    String mensagemEntrada = "Escolha uma das opcoes";
}
    
 switch(this.opcao){
     case 1:
     nome = JOptionPane.showInputDialog("Digite seu nome");
     sb = Integer.parseInt(JOptionPane.showInputDialog("digite o salário"));
     ValorVendido = Integer.parseInt(JOptionPane.showInputDialog("digite a valor vendido"));
     total = (nome + sb);
     
     break;
     
     case 2:
     JOptionPane.showMessageDialog(null, "A comissão é:");
    
     break;
     
     case 3:
     JOptionPane.showMessageDialog(null, "O vendedor é:"+ total);
     break;
       
       case 5:
          Vendedor.sair();
        default:
          io.saidaDados("Você selecionou sair até mais :D");
           break;
 
    
    }
    }

}
