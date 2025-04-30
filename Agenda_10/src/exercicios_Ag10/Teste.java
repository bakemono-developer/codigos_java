package exercicios_Ag10;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int num, i;
		String escolha;
		
		Scanner bake = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número para saber sua tabuada");
			num = bake.nextInt();
			
			for (i = 1; i <= 10 ; i++) {
				System.out.println(num+" x "+i+" = "+(num*i));
			}
			System.out.println("Deseja fazer mais uma vez?");
			escolha = bake.next();
			
			
		} while (escolha.equals("sim"));
		
		System.out.println("Muito obrigado!");
		
	}

}
