package exercicios_Ag09;

import java.util.Scanner;

public class Maior_Menorque {

	public static void main(String[] args) {
		int maior, menorque, qtd, i = 2;
		
		Scanner bake = new Scanner (System.in);
		
			System.out.println("Digite quantos números você vai digitar");
			qtd = bake.nextInt();
			
			System.out.println("Digite o 1º número");
			maior = bake.nextInt();
			
			while (i <= qtd) {
				System.out.println("digite o "+i+"º número");
				menorque = bake.nextInt();
				
				if (menorque > maior) {
					maior = menorque;
				}
				
				i++;
			}
			
			System.out.println("O número maior é: "+maior);
			
	}

}
