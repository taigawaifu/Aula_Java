package Exerc2;

import javax.swing.JOptionPane;

public class exerc2 {

	public static void main(String[] args) {
		//Verifies
		int average = 0 , average2 = 0 , result = 0;
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa pra calcular as medias");
		average = 8 + 9 + 7;
		average2 = 4 + 5 + 6;
		result = (average+average2)/2;
		result = Integer.parseInt(JOptionPane.showInputDialog(null,"Sua media e" + result));
	

	}

}
