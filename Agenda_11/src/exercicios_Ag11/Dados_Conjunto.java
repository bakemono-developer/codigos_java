package exercicios_Ag11;

import java.util.Scanner;

public class Dados_Conjunto {

	public static void main(String[] args) {
		 String dados = "Nome: ", nome [][] = new String [2][3];
		 
		 Scanner bake = new Scanner (System.in);
		 
		 for (int l = 0; l < nome.length; l++) {
			 System.out.println("Digite seu nome completo");
				 nome[l][0] = bake.nextLine();
			 System.out.println("Digite o nome da cidade");
				 nome[l][1] = bake.nextLine();
			 System.out.println("Digite o estado");
				 nome[l][2] = bake.nextLine();
				 
			 }
		 
		 for (int l = 0; l < nome.length; l++) {
			 for (int c = 0; c < nome.length; c++) {
				 dados += nome[l][c];
				 
				 if (c == 1) {
					 dados += " Cidade: ";
				 }
				 else if (c == 2) {
					 dados += " Estado: ";
				 }
			 }
		 }
		    System.out.println("Dados: "+dados+"\n");
		 
		 } 
	}

