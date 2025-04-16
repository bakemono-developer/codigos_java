package exercicíos_e_testes;

import java.util.Scanner;

public class sla1 {

	public static void main(String[] args) {
		int i, num;
		
		Scanner bake = new Scanner (System.in);
		
		System.out.println("Digita um número de 6 a 10 para descobrir sua tabuada");
		num = bake.nextInt();
		
		for (i = 0; i <=10; i++) {
			
			System.out.println(num+ " x " +i+ " = " +num*i);
		


}

}
	
}