package exercicios_Ag10;

import javax.swing.JOptionPane;


public class Convidados_1Modulo {

	public static void main(String[] args) {
		String ladoesq, ladodir, listafinal = "Os convidados são:\n";
		String convidados[] = new String[10];
		int i;
		
		for (i = 0; i < convidados.length; i++) {
			convidados[i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"º convidado");
			listafinal = listafinal + convidados[i]+"\n";
		
		}
		ladoesq = "Convidados do lado esquerdo:\n";
		ladodir = "Convidados do lado direito:\n";
		
		for (i = 0; i < convidados.length; i++) {
			
			
			
			if (i % 2 == 0) {
				ladoesq = ladoesq + convidados[i]+"\n";
			} else {
				ladodir = ladodir + convidados[i]+"\n";
			}
				
		}
		System.out.println(listafinal);
		
		System.out.println(ladoesq+"\n\n\n"+ladodir);
		
	}

}
