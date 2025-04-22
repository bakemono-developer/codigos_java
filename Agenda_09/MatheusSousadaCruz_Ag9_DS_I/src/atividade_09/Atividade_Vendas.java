package atividade_09;

import javax.swing.JOptionPane;

public class Atividade_Vendas {

	public static void main(String[] args) {
		String nome, escolha;
		int x = 1, qtd = 0;
		float venda, adicional, comissao = 0, total = 0;
		// coloquei as variáveis
		
		nome = JOptionPane.showInputDialog("Digite seu nome");
		// solicitei nome
		
		do {
			venda = Float.parseFloat(JOptionPane.showInputDialog(nome+", digite o valor da "+x+"ª venda!"));
			total = total + venda;
			// pedi o valor da venda e somei ela ao total
			
			escolha = JOptionPane.showInputDialog("Houve mais alguma venda?");
			// solicitei se há mais vendas
			
			x++;
			qtd++;
			// aumentando a quantidade de vendas
			
           } while (escolha.equals("sim"));
		// o processo se mantém até o usuario digitar algo diferente de sim
		
		if (total < 1000) {
			comissao = total * 5 / 100;
			// caso for menor que 1000$ de venda, fiz que a porcentagem seja 5%
			
		}
		
		else if (total >= 1000 && total <= 5000) {
			comissao = total * 7 / 100;
			// caso esteja entre 1000$ e 5000$ de venda, fiz que a porcentagem seja 7%
		}
		
		else if (total > 5000) {
			comissao = total * 10 / 100;
			// caso for maior que 5000$ de venda, fiz que a porcentagem seja 5%
		}
		
		if (qtd > 10) {
			adicional = total * 2 / 100;
			comissao = comissao + adicional;
			// caso haja mais de 10 vendas, inclui o adicional de 2% e somei ao total da comissão
		}
		
		JOptionPane.showMessageDialog(null, nome+", aqui está um relatório:"
				+ "\nQuantidade de vendas: "+qtd+ " vendas!"
						+ "\nValor total em vendas: "+total+"R$"
								+ "\nValor total a receber de comissão: "+comissao+"R$");
		// mostrei todas as informações coletadas pelo programa

	}

}
