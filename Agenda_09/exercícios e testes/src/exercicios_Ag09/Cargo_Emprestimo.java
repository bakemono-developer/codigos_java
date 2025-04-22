package exercicios_Ag09;

import java.util.Scanner;

public class Cargo_Emprestimo {

	public static void main(String[] args) {
		String nome, cargo; 
		float sal, empre;
		
		Scanner bake = new Scanner (System.in);
		
		System.out.println("Digite seu nome");
		nome = bake.next();
		
		System.out.println("Informe qual seu cargo entre:"
				+ "\nDono, "
				+ "\nGerente, "
				+ "\nEstagiáro");
		cargo = bake.next();
		
		while (!cargo.equals("dono") && !cargo.equals("gerente") && !cargo.equals("estagiario")) {
			System.out.println("Você digitou errado, tente novamente!");
			cargo = bake.next();
		}
		
		System.out.println("Agora, informe seu salário!");
		sal = bake.nextFloat();
		
		if (cargo.equals("dono")) {
			empre = sal * 30 / 100;
		}
		else if (cargo.equals("gerente")) {
			empre = sal * 20 / 100;
		} 
		else {
			empre = sal * 10 / 100;
		}
		
		System.out.println(nome+" o seu empréstimo é de: "+empre+"R$");
		
		
		
		

	}

}
