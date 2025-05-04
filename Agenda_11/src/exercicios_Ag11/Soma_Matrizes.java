package exercicios_Ag11;

import java.util.Scanner;

public class Soma_Matrizes {

	public static void main(String[] args) {
		int matrizA [][] = new int [2][2];
		int matrizB [][] = new int [2][2];
		int soma [][] = new int [2][2];
		
		Scanner bake = new Scanner (System.in);
		
		System.out.println("Digite as posições para a primeira matriz:");
		
		for (int l = 0; l < matrizA.length; l++) {
			for (int c = 0; c < matrizA.length; c++) {
				System.out.print("Linha "+(l+1)+", Coluna "+(c+1)+": ");
				matrizA[l][c] = bake.nextInt();				
			}
		}
		
		System.out.println("Digite as posições da segunda matriz:");
		
		for (int l = 0; l < matrizB.length; l++) {
			for (int c = 0; c < matrizB.length; c++) {
				System.out.print("Linha "+(l+1)+", Coluna "+(c+1)+": ");
				matrizB[l][c] = bake.nextInt();				
			}
		}
		
		for (int l = 0; l < soma.length; l++) {
			for (int c = 0; c < soma.length; c++) {
				soma[l][c] = matrizA[l][c] + matrizB[l][c];
			}
		}
		for (int l = 0; l < soma.length; l++) {
			for (int c = 0; c < soma.length; c++) {
				System.out.println("A soma da Linha "+(l+1)+" e a Coluna "+(c+1)+" "
						+ "\ndas duas matrizes é: "+soma[l][c]);
				
				
			}
			}
		
	}
}
