package exercicios_Ag11;

import javax.swing.JOptionPane;

public class Desafio_JOptionMatriz {

	public static void main(String[] args) {
		int linhas, colunas, matriz [][] = new int [2][2];
		String exibir = "";
		JOptionPane.showMessageDialog(null,"Inserindo dados na matriz!");
		
		for (colunas = 0; colunas < matriz.length; colunas++) {
			for (linhas = 0; linhas < matriz.length; linhas++) {
				matriz[linhas][colunas] = Integer.parseInt(JOptionPane.showInputDialog("Insira os dados:"
						+ "\nColuna "+(colunas+1)+": "
								+ "\nLinha "+(linhas+1)+":"));
			}
		}
		
		for (colunas = 0; colunas < matriz.length; colunas++) {
			for (linhas = 0; linhas < matriz.length; linhas++) {
				
				exibir += matriz[colunas][linhas]+" | ";

			}
			}
		JOptionPane.showMessageDialog(null, exibir);
	}

}
