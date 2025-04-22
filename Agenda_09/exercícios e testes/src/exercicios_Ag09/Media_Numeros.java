package exercicios_Ag09;

import javax.swing.JOptionPane;

public class Media_Numeros {

	public static void main(String[] args) {
		String conti;
		float media = 0;
		int num, i = 0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));
			media = media + num;
			i++;
			
			conti = JOptionPane.showInputDialog("Deseja continuar? sim, ou não");
			
		} while (conti.equals("sim"));
		
		media = media / i;
		
		JOptionPane.showMessageDialog(null, "A média dos números é: "+media);

	}

}
