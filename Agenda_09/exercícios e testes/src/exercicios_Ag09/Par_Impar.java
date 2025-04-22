package exercicios_Ag09;

public class Par_Impar {

	public static void main(String[] args) {
		int num = 0;
		
		while (num < 100) {
			num++;
			
			if (num%2 == 0) {
			System.out.println("número par: "+num);
			}
			else {
			System.out.println("Número ímpar: "+num);
			}
		}
	}

}
