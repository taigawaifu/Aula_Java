package Aula3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Verifies
		/*
		 * String s; s = "Ana dos Santos"; String s2 = "Roberto Padilha"; //main
		 * System.out.println("Igual " + s.equals("Ana dos Santos"));
		 * System.out.println("Tamanhos de s" + s.length());
		 * System.out.println("Caracter na posição 5 de s2" + s.charAt(5) );
		 */

		/*
		 * int a = 5; boolean b = (a == 10); System.out.println(!b); int c = 10 % 3;
		 * System.out.println(c); double d = 15.3; d+=10; System.out.println(d); boolean
		 * e = (d > 100 && d <= 500); System.out.println(e);
		 */

		/*
		 * int i = 1; int j = 2; int k = ++j ; System.out.println("k" + j);
		 * System.out.println("j " + j); int l = i++; System.out.println("l " + l);
		 * System.out.println("i" + i); k++; System.out.println("K" + k);
		 */

		 String num1 , num2, num3;
		 int resultado = 0;
		 JOptionPane.showMessageDialog(null, "Informe 3 numeors");
		 num1 = Integer.parseInt(JOptionPane.showInputDialog("nummero 2"));
		 num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
		 num3 = Double.parseDouble(JOptionPane.showInputDialog("Nuemro3"));
		 resultado = (num1*=num2/num3);
		 JOptionPane.showMessageDialog(null, "Seu resultado e" + resultado);

		// resultado = (num1*=num21/num31);
		// JOptionPane.showMessageDialog(null,"Seu resultado e" + resultado);

		/* String a = "10";
		double a1 = Double.parseDouble(a);
		int a2 = Integer.parseInt(a);
		float a3 = 0;
		Float.parseFloat(a);
		int resultado = 0;
		JOptionPane.showMessageDialog(null, "Informe 3 nuemros");
		JOptionPane.showInputDialog(null, "Numero 1" + a1);
		JOptionPane.showInputDialog(null, "Numero 2" + a2);
		JOptionPane.showInputDialog(null, "Numero 3" + a3);
		resultado = (int) (a1 += a2 * a3);
		JOptionPane.showMessageDialog(null, "Seu resultado é" + resultado);
		*/

		/**
		 * bloco de notas //Verifies linha 6 //main linha 10 programa 1 linha 16
		 * programa 2 linha 28
		 */
	}

}
