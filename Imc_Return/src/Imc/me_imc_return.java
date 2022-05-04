package Imc;

import javax.swing.JOptionPane;

public class me_imc_return {

	public static double (double base, double altura) {
		double area = base * altura;
		return area;

	}
	
	public static double calculaperimetro (double base , double altura) {
		return 2 * base + 2 * altura;
	}

	public static void main(String[] args) {
		int altura = 0 , base = 0 ;
			
		altura = Integer.parseInt(JOptionPane.showInputDialog("informe suaAltura \n"));
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base \n"));
		
		double a = calculaarea(base, altura);
		
	}
}
