package exercicios_Ag10;

import java.util.Scanner;

public class Média {

	public static void main(String[] args) {
		float notas[] = new float[5];
		float media = 0;
		int i;
		
		Scanner bake = new Scanner (System.in);
		
		for (i = 0; i < notas.length; i++) {
			System.out.println("Digite a "+(i+1)+"ª nota:");
			notas[i] = bake.nextFloat();
			media = media + notas[i];
			
		}
		
		media = media / notas.length;
		
		System.out.println("A média final é: "+media);
		
		if (media >= 5) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO");
		}
		
		
		
		
	}

}
