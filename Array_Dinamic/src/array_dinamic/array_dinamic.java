package array_dinamic;

import javax.swing.JOptionPane;

public class array_dinamic {

	public static void main(String[] args) {
		// Verifies
		int size = 0, size2 = 0, controller = 0;
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa Java");
		size = Integer.parseInt(JOptionPane.showInputDialog(null, "INforme o tamanho da array"));
		String[] names = new String[size];
		// for 1
		for (int i = 0; i < size; i++) {
			names[i] = JOptionPane.showInputDialog("Informe um o conteudo da array");

		}
		controller = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterna a array? 1 - Yes 2- No"));
		if (controller == 1) {
			int new_size = 0;
			new_size =Integer.parseInt(JOptionPane.showInputDialog(null, "INforme o tamanho da array"));
			String[] names2 = new String[new_size];
			for (int i = 0; i < new_size; i++) {
				names2[i] = JOptionPane.showInputDialog("Informe um os itens para colocar na array");
			}
			// for 2
			for (int i = 0; i < size; i++) {
				names2[i] = names[i];
			}
			// for 4
			for (int i = 0; i < size2; i++) {
				JOptionPane.showMessageDialog(null, "Seus Nomes salvos são" + names2[i]);
			}
			// Exi4

		} else {
			for (int i = 0; i < size; i++) {
			JOptionPane.showMessageDialog(null, "Itens salvos \n" + names[i]);
			}
			
		}
		
	}

}
