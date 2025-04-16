package exercicíos_e_testes;

import java.util.Scanner;

public class Medias {

	public static void main(String[] args) {
		String nome;
		double nota1, nota2, media;
		int cont;
		
		Scanner bake = new Scanner (System.in);
		
		for (cont = 0; cont <=2; cont++) {
			
			System.out.println("digite seu nome");
			nome = bake.next();
			
			System.out.println("digite sua primeira nota");
			nota1 = bake.nextDouble();
			
			System.out.println("digite sua segunda nota");
			nota2 = bake.nextDouble();
			
			media = (nota1+nota2)/2;
			
			System.out.println("sua média é "+media);
			
			if (media >= 5) {
				System.out.println("passou legalzin");
			}
			else {
				System.out.println("po pitbicha, passou não");
			}
			
			
			
		}
		
	}
}
		