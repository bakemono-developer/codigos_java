package exercicios_Ag09;

import javax.swing.JOptionPane;

public class Palavra_Brincadeira {

	public static void main(String[] args) {
		String tentativa;
		String palavra;
		int vezes = 0;
		
		palavra = JOptionPane.showInputDialog("DIGITE A PALAVRA A SER DESCOBERTA");
		
		do {
			tentativa = JOptionPane.showInputDialog("DIGITE A PALAVRA CERTA");
			vezes++;
			if (palavra.equals(tentativa)) {
				vezes = 10;
		
			}
			
		} while (vezes < 5);
		
		if (vezes == 10) {
			JOptionPane.showMessageDialog(null, "PARÁBENS VOCÊ ACERTOU");
		} else {
			JOptionPane.showMessageDialog(null, "QUE PENA VOCÊ ERROU, A PALAVRA CERTA É "+palavra);
		}

		
	}

}
