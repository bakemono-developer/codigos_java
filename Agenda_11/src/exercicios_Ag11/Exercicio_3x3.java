package exercicios_Ag11;

import java.util.Scanner;

public class Exercicio_3x3 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int maior = 0, menor = 0;
		
		Scanner bake = new Scanner(System.in);
		
		System.out.println("Digite os números!");
		
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz.length; c++) {
				System.out.print((l+1)+"ª Linha: "
								+(c+1)+"ª Coluna: ");
				matriz[l][c] = bake.nextInt();
				
				if (l == 0 && c == 0) {
					maior = matriz[l][c];
					menor = matriz[l][c];
				}
				else if (maior < matriz[l][c]) {
					maior = matriz[l][c];
				}
				else if (menor > matriz[l][c]) {
					menor = matriz[l][c];
				}
			}
		}
		
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz.length; c++) {
				
				System.out.println("Você colocou:"
						+ "\nLinha "+(l+1)+", Linha "+(c+1)+": "+matriz[l][c]+"\n");
			}
		}
		
		System.out.println("O maior número da matriz é: "+maior);
		System.out.println("O menor número da matriz é "+menor);

	}

}
