package exerc6;

import javax.swing.JOptionPane;

public class exerc6 {

	public static void main(String[] args) {
		//Verifies
		int num1 = 0,result = 0;
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa");
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero"));
		result = --num1 ; num1++;
		JOptionPane.showMessageDialog(null, "Numero" + result);

	}

}
