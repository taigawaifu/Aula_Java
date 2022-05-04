package aula4;

import javax.swing.JOptionPane;

public class me_aula_4 {
	private static Integer Null(String s) {
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException null1) {
			return null;
		}

	}

	public static void main(String[] args) {
		// Verifies
		String random[] = new String[10];
		int random2;
		JOptionPane.showInternalMessageDialog(null, "Bem vindo ao programa random informe 10 numeros ou 10 Itens");
		for (int i = 0; i < random.length; i++) {
			random[i] = JOptionPane.showInputDialog(null);

		}
		for (int i = 0; i < random.length; i++) {
			JOptionPane.showMessageDialog(null, random[i]);
			Integer ii = Null(random[i]);
			if (ii == null) {
				JOptionPane.showMessageDialog(null, "Oque voce digitou e string" + ii);
			} else {
				JOptionPane.showMessageDialog(null, "Oque voce digiou e nuemro");
			}
		}

	}
}
