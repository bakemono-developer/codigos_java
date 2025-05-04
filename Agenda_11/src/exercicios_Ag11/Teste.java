package exercicios_Ag11;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int matriz [][] = { {1,2}, {3,4} };
		int linha, coluna;
		
		for (linha = 0; linha < matriz.length; linha++) {
			
			for (coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Matriz["+(linha+1)+"] coluna["+(coluna+1)+"] = "+ matriz[linha][coluna]);
				
				
				
			}
			
			
		}
		

	}

}
