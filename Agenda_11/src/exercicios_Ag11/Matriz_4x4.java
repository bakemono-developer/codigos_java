package exercicios_Ag11;

import java.util.Scanner;

public class Matriz_4x4 {

	public static void main(String[] args) {
		float num [][] = new float [4][4];
		int linha,coluna;
		
		Scanner bake = new Scanner (System.in);

		for (linha = 0; linha < num.length; linha++) {
			
			for (coluna = 0; coluna < num.length; coluna++) {
				System.out.println("Entre com o número"
						+ "\nlinha "+(linha+1)+": "
								+ "\ncoluna "+(coluna+1)+": ");
				
				num[linha][coluna] = bake.nextFloat();
			}
		}
		
		for (linha = 0; linha < num.length; linha++) {
			
			for (coluna = 0; coluna < num.length; coluna++) {
				
				System.out.println("Linha "+(linha+1)+": "
						+ "\nColuna "+(coluna+1)+": "
								+ "\nNúmero: "+num[linha][coluna]+"\n");

			}

			
		}
		

	}

}
