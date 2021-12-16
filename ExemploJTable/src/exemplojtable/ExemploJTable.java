/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojtable;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author BEM VINDO
 */
public class ExemploJTable extends JFrame {
    //variaveis para uso da JTable
    private JTable table;
    private final String colunas [ ] = {"Nome: ", "Idade: ", "Sexo:"};
    private final String dados [ ] [ ] = {
        {"Charles", "19","Masculino"},
        {"Galileu", "454", "Masculino"},
        {"Hawking", "76","Masculino"},
        {"Newton", "375","Masculino"},
        {"Kepler", "447","Masculino"},
        {"Einster", "139","Masculino"},
        {"Coperniucus", "545","Masculino"},
        {"Charles", "19","Masculino"}};
    
//Construtor da Classe, antes de executar o metodo Main(), irá construir o JFrame e a JTable

public ExemploJTable() {
setLayout(new FlowLayout());//tipo de Layout
setSize(new Dimension(600, 200));//tamanho do formulário
setLocationRelativeTo(null);//Centralizado
setTitle("Exemplo JTable");//titulo
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sentado a ação padrão de fechamento do Formulário Neste caso irá fechar o programa

//instaciando a JTable
table=new JTable(dados,colunas);
table.setPreferredScrollableViewportSize(new Dimension(500,100));//barra de rolagem
table.setFillsViewportHeight(true);

//adicionando a tabela em uma barra de rolagem, ficará envolta, pela mesma
JScrollPane scrollPane=new JScrollPane(table);
//adicionando ao JFrame "Formulario" a JTable "Tabela"
add(scrollPane);
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ExemploJTable().setVisible(true);
    }
    
}
