package Exerc3;

import javax.swing.JOptionPane;

public class exerc3 {

	public static void main(String[] args) {
		//Verifies 
		double money = 0 , result = 0;
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa");
		money = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salario"));
		result = money*=0.001;
		JOptionPane.showMessageDialog(null, "Seu salario e reajustado e " + result);
		
	}

}
