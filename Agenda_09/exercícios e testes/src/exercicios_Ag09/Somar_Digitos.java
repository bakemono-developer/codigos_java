package exercicios_Ag09;

import java.util.Scanner;

public class Somar_Digitos {

	public static void main(String[] args) {
		int num, soma;
		
		Scanner bake = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro!");
		num = bake.nextInt();
		
		soma = num % 10;
		
		while (num > 0) {
			num /= 10;
			soma = soma + (num % 10);
		}
		
		System.out.println("A soma dos números é: "+soma);;
	}

}
