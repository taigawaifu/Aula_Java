package exerc4;

import javax.swing.JOptionPane;

public class exerc4 {

	public static void main(String[] args) {
		// Verifies
		double ipi = 0, peca = 0, peca2 = 0, value = 0, value2 = 0, amount = 0, amount2 = 0 , result = 0;
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa");
		ipi = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o IPI A ser acresentado"));
		peca = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero da peça"));
		amount = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de peças"));
		value = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da peça"));
		peca2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o numero de peça2"));
		amount2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantida de de peças2"));
		value2 = Double.parseDouble(JOptionPane.showInputDialog("Informe  o valor da peça2"));
		result = (value*amount + value2*amount2)*(ipi/100 + 1)*5;
		JOptionPane.showMessageDialog(null, "Suas peças com valor de IPi para venda final e" + result);
		

	}

}
