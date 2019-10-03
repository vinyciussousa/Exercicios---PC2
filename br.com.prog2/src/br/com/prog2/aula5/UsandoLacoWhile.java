package br.com.prog2.aula5;

import javax.swing.JOptionPane;

public class UsandoLacoWhile {

	public static void main(String[] args) {
		String frase = "";
		while(!frase.equalsIgnoreCase("Sair")) {
			frase = JOptionPane.showInputDialog("Digite uma frase\n"+
					"(Para abandonar o programa digite \'Sair\')");
			if(!frase.equalsIgnoreCase("Sair")) {
				JOptionPane.showMessageDialog(null, frase);
			}
		}

	}

}
