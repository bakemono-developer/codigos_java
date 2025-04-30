package exercicios_Ag10;

import java.util.Scanner;

public class Assento_Onibus {

	public static void main(String[] args) {
		String assentos[] = new String[5];
		int i;
		
		Scanner bake = new Scanner (System.in);
		
		for (i = 0; i < assentos.length; i++) {
			System.out.println("Digite o nome que sentará no assento "+i+": ");
			assentos[i] = bake.nextLine();
		}
		for (i = 0; i < assentos.length; i++) {
			System.out.println("Assento "+i+": "+assentos[i]);
		}
		

	}

}
