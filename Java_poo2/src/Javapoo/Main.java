package Javapoo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		night i = new night();
		String name;
		int years = 0;
		int dateborn = 0;
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa Java POO");
		i.dateborn = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
		i.getname(JOptionPane.showInputDialog("Informeu seu nome"));
		i.getall = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		
		
	}

	
	

}
