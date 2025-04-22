package exercicios_Ag09;

import javax.swing.JOptionPane;

public class Nota_0a10 {

	public static void main(String[] args) {
		int nota;
		int tentativa;
		int vezes = 0;
		
		    nota = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota de 0 a 10"));
		    
		    if (nota <= 10) {
		    	
		        
		do {
			tentativa = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota que você acha que é!")); 
			vezes++;
			
			if (nota == tentativa) {
				vezes = 10;
			}
			
		} while (vezes < 2);
		
		if (nota == tentativa) {
			JOptionPane.showMessageDialog(null, "Parabens, você acertou");
		} else {
			JOptionPane.showMessageDialog(null,"Que pena, a nota era "+nota);
		}
		
		    }
		    
		    else {
		    	JOptionPane.showMessageDialog(null, "digita de 1 a 10 bicho burro");
		    }
		
		
		
	}

}
