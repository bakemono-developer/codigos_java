package exercicios_Ag10;

import java.util.Scanner;

public class Multiplicar_por2 {

	public static void main(String[] args) {
		int numeros[] = new int [5];
		int i;
		
		Scanner bake = new Scanner (System.in);
		
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Escreva o "+(i+1)+"º número");
			numeros[i] = bake.nextInt();
		}
		
		for (i = 0; i < numeros.length; i++) {
			if (i % 2 == 0) {
				numeros[i] = numeros[i] * 2;
			}
			
			System.out.println((i+1)+"º número: "+numeros[i]);
		}
	
		
			}

}
