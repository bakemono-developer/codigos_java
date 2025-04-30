package exercicios_Ag10;

import java.util.Scanner;

public class Digite_Numero {

	public static void main(String[] args) {
		int i, soma = 0;
		int numeros[] = new int[4];
		
		Scanner bake = new Scanner (System.in);
		
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número de posição "+i+":");
			numeros[i] = bake.nextInt();
		}
	
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Posição "+i+": "+numeros[i]);
			if (numeros[i] % 2 == 0) {
				soma = soma + numeros[i];
		}
		
		
		}
		
		System.out.println("A soma dos números pares é: "+soma);
		
		
		 

	}

}
