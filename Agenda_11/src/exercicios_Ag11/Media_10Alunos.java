package exercicios_Ag11;

import java.util.Scanner;

public class Media_10Alunos {

	public static void main(String[] args) {
		float media = 0, notas [][] = new float [10][4];
		
		Scanner bake = new Scanner (System.in);
		
		for (int l = 0; l < notas.length; l++) {
			
			
			for (int c = 0; c < 3; c++) {
				System.out.print("Nota do aluno "+(l+1)+", na disciplina "+(c+1)+": ");
				notas[l][c] = bake.nextFloat();	
			}
			for (int c = 0; c < 3; c++) {
				media += notas[l][c];
			}
			
			notas[l][3] = media / 3;
			
			media = 0;

		}
		

		
		for (int l = 0; l < notas.length; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Notas do aluno "+(l+1)+": "+notas[l][c]);	
			}
			System.out.println("Média: "+notas[l][3]+"\n");
		}
	}

}
