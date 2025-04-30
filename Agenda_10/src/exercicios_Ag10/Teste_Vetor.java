package exercicios_Ag10;

import java.util.Scanner;

public class Teste_Vetor {

	public static void main(String[] largs) {
		int total = 0;
		int [] numeros = new int [100];
		
		Scanner bake = new Scanner (System.in);
		
		for (int i = 0 ; i < numeros.length; i++) {
			
			if (i % 2 != 0) {
				total = total + i;
			}

		}
		
		System.out.println("A soma dos números pares é "+total);
		
		}

	}


