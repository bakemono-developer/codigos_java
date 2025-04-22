package atividade_09;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int num, i = 1;
		
		Scanner bake = new Scanner (System.in);
		
		System.out.println("Digite um número de 6 a 10 para saber sua tabuada!");
		num = bake.nextInt();
		
		if (num >= 6 && num <= 10) {
			
			while (i <= 10) {
				System.out.println(num+" x "+i+" = "+(num*i));
				i++;
			}	
		}
		
		else {
			System.out.println("Número errado");
		}
		
	}

}
