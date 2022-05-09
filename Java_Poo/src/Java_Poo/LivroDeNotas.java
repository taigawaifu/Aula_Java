package Java_Poo;

import javax.swing.JOptionPane;

public class LivroDeNotas {
	
	public static final double Media = 0;
	public static Object status;
	String nomealuno, st;
	private int n1, n2, n3, matricula;
	private double media;
	private String obs ="";
	public String getObs(){
		return obs;
		
	}
	public void  setObs(){
		 this.obs = obs;
	}
	
	
	public void Add_Aluno() {
		nomealuno = JOptionPane.showInputDialog("Informe um nome de aluno");
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno"));
		matricula = n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula"));
	}

	public double Media() {
		media = n1 + n2 + n3 / 3;

		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado" + nomealuno);
			st = ("Aluno AProvad");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado" + nomealuno);
			st = ("Aluno Reprovado");
		}
		return matricula;

	}

	public void status() {
		if (st.equals("Aluno aprovado")) {
			JOptionPane.showMessageDialog(null, "Parabnes voce aproou" + nomealuno);
		} else if (st.equals("Aluno reprovado")) {
			JOptionPane.showMessageDialog(null, "Parabnes voce Reprovoy" + nomealuno);

		}
	}
	public void setObs(String string) {
		// TODO Auto-generated method stub
		
	}
}
