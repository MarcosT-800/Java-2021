/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodemenu5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploDeMenu5 extends JFrame{
    
JMenuBar barra;
JMenu opcoes, fonte, cor, estilo, tamanho;
JMenuItem limpar, sair, azul, verde, vermelho, amarelo, preto; 
JCheckBoxMenuItem nomeE[ ];
        ButtonGroup grupor, grupoE;
        JRadioButtonMenuItem tamanhoF[];
        String tam[] = {"12","14","16","18"};
        String est[] = {"Normal", "Negrito", "Itálico", "Negrito e Itálico" };
        JTextArea texto;
JPanel painel;
JScrollPane rolagem;
int estilofonte, tamfonte;

//

public ExemploDeMenu5 () {
super ("Exemplo de Menus executando ações");
Container tela = getContentPane();
tela.setLayout (null);
estilofonte=Font. PLAIN; 
tamfonte=12;
barra = new JMenuBar();
setJMenuBar (barra);
opcoes = new JMenu ("Opções");
barra.add (opcoes);
limpar = new JMenuItem("Limpar");
fonte = new JMenu ("Fonte");
cor = new JMenu ("Cor");
azul = new JMenuItem("Azul");
verde = new JMenuItem("Verde");
vermelho = new JMenuItem("Vermelho");
amarelo = new JMenuItem("Amarelo");
preto = new JMenuItem("Preto");

//
TratadorE tratestilo = new TratadorE ();
   estilo = new JMenu ("Estilo"); 
   grupoE = new ButtonGroup();
   nomeE = new JCheckBoxMenuItem[4];
    for (int i = 0; i < 4; i++) { //
    nomeE[i] = new JCheckBoxMenuItem(est[i]);
    estilo.add(nomeE[i]);
    grupoE.add(nomeE[i]); 
    nomeE[i].addItemListener((ItemListener) tratestilo);
}

//
TratadorT trattamanho = new TratadorT();
tamanho = new JMenu ("Tamanho");
grupoT = new ButtonGroup();
tamanho = new JRadioButtonMenuItem[4];
for (int i - 0; i < 4; i++) {
    tamanhoF[1] =new JRadioButtonMenuItem(tam[1]);
}
tamanho.add(tamanhos[1]):
grupoT.add(tamanho[i]); 
tamanhof[i].addItemListener (trattamanho) ; }
sair = new JMenuItem("Sair"); 
opcoes.setMnemonic (KeyEvent. VK 0); 
limpar.setMnemonic (KeyEvent. VK_L); 
fonte.getMnemonic (KeyEvent.VK ) :
sair.setMnemonic (KeyEvent. VK_S);
cor.setMnemonic (KeyEvent.VK C);
estilo.setMnemonic (KeyEvent. VK E) ;
tamanho.setMnemonic (KeyEvent. VK_T);
opcoes.add(limpar):
opcoes.add(fonte); 
opcoes.addSeparator();
opcoes.add(sair):
cor.add (azul);
cor.add (verde); 
cor.add (vermelho);
cor.add(amarelo):
cor.add (preto):
fonte.add(cor);
fonte.add(estilo);
Conte.add(tamanho);

texto = new JTextArea (10, 20);
rolagem = new JScrollPane(texto);
rolagem.setVerticalScrollBar Policy (JScrollpane. VERTICAL_SCROLLBAR ALWAYS); 
rolagem.setHorizontalScrollBar Policy (JScroll Pane. HORIZONTAL SCROLLBAR ALWAYS);
painel - new JPanel();
painel.add (rolagem);
painel.setBounds (30, 30, 250, 250);
tela.add(painel);

limpar.addActionListener(new ActionListener() !
public void action Performed (ActionEvent e)! texto.setText(""); texto.request Focus(); });
azul.addActionListener(new ActionListener() {
public void actionPerformed (ActionEvent e) { texto.setForeground (Color.blue): repaint():) )):
verde.addActionListener(new ActionListener() {
public void action Performed (ActionEvent e)! texto.setForeground (Color.green); repaint(); });
vermelho.addActionListener(new ActionListener() !
public void actionPerformed (ActionEvent e) { texto. setForeground (Color.zed): repaint():)):
amarelo.addActionListener (new ActionListener() {
public void action Performed (ActionEvent e) { texto. setForeground (Color.yellow): repaint(); } });
preto.addActionListener(new ActionListener()
public void action Performed (ActionEvent e)! texto. setForeground (Color.black); repaint(); } });
sair. addActionListener(new ActionListener() { public void action Performed (ActionEvent e) int resposta: resposta-JOptionPane. showConfirmDialog(null,"Deseja realmente sair?", "Mensa
+ " do Programa", JOptionPane. YES_NO_OPTION); if (respost--6)
System.exit(0); } });
setSize(500, 300): setLocationRelativeTo(null); setVisible(true); }
public static void main(String args[])
ExemploDeMenu5 app = new ExemploDeMenu(); app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); }

private class Tratador e implements ItemListener
public void itemStateChanged (ItemEvent e) { 11 (nomeE[0] . 18Selected()) estilofonte Font. PLAIN; if(nome[1].15Selected()) estilofonte= Font. BOLD; if (nomeE [2].isSelected()) estilofonte-Font. ITALIC; 11 (nome [3] . 18Selected()) estilofonte Font. BOLD+Font.ITALIC; texto set Font (nere Font ( estilofonte repaint(); } }
private class Tratadort implements ItemListener!
public void itemstateChanged (ItemEvent e) if (tamanhof[0].isSelected()) tamfonte-12; if (tamanhof[1].18Selected()) tamfonte-14; if (tamanhoF[2). 1sSelected()) tamfonte= 16; if (tamanhof[3].isSelected()) tamfonte- 18; texto.setFont(new Font("", estilofonte, tamfonte)); repaint(); } }


