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
public class EntradaSaidaDados {
 
public String entradaDados (String mensagemEntrada) {
    return JOptionPane.showInputDialog(mensagemEntrada);
}

public void saidaDados(String mensagemSaida) {
    JOptionPane.showMessageDialog(null, mensagemSaida);
	}

}