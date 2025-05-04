package exercicios_Ag11;

import java.util.Scanner;

public class MatheusSousadaCruz_Ag11_DS1 {

	public static void main(String[] args) {
		int soma = 0, matriz [][] = new int[3][3];
		//criei a matriz
		
		Scanner bake = new Scanner (System.in);
		
		System.out.println("Digite os números da matriz!");
		
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz.length; c++) {
				System.out.print("Linha "+(l)+", Coluna "+(c)+": ");
				matriz[l][c] = bake.nextInt();
				// solicitei a digitação dos valores, mostrando onde cada um ia ficar
				
				soma += matriz[l][c];
				// juntei os valores inseridos à variável soma
			}
		}

		System.out.println("A soma de todos os números inseridos é: "+soma);
		// mostrei o resultado dos valores inseridos somados;
		
		System.out.println("obrigado professoraa :)");
		
	}
}
