package exercicios_Ag10;

import java.util.Scanner;

public class Leitura_Inversa {

	public static void main(String[] args) {
		int inverso [] = new int [5];
		int i;
		
		Scanner bake = new Scanner (System.in);
		
		for (i = 0; i < inverso.length; i++) {
		System.out.println("Escreva o "+(i+1)+"º valor");
		inverso[i] = bake.nextInt();
		}
		
		
		for (i = inverso.length - 1; i >= 0; i--) {
			System.out.println("A ordem inversa dos números colocados é: "+inverso[i]);
		}
	
		

	}

}
