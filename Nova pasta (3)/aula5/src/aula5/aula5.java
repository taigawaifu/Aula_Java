package aula5;

import javax.swing.JOptionPane;

public class aula5 {

	public static void main(String[] args) {
		//Verifies
		int years = 0 , result = 0,days = 0;
		years = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));  
		days = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe quando dias voce tem"))
		result = (years*365*30+days);
		JOptionPane.showMessageDialog(null,"Voce tem tanto anos  em dias" + result);
		
		
		
		

	}

}
