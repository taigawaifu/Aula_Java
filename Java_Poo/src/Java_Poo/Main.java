package Java_Poo; 

import javax.swing.JOptionPane;

public class Main {
		
	public static void main(String[] args) {
		//called class
		int tamanho =0 ;
		double maior = 0.0;
		
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe a notas  do alunho "));
		LivroDeNotas[] turma = new LivroDeNotas [tamanho];
		for(int i = 0 ; i<tamanho ; i++) {
			turma[i].Add_Aluno();
			turma[i] .Media();
			if(turma[i].Media >=maior) {
				maior = turma[i].Media();
				i++;
		
			}
			
		}
		for(int i = 0 ; i <tamanho ; i++) {
			if(turma[i].Media==maior) {
				JOptionPane.showMessageDialog(null, "A maior Nota e " + turma[i]);
				
			}
		}
		for(int i = 0 ; i<tamanho ; i++) {
			if(turma[i].status.equals("Reprovado")) {
				JOptionPane.showMessageDialog(null, "Estude mais amigos " + turma[i]);
			}
		}
		LivroDeNotas c1 = new LivroDeNotas();
		c1.setObs("Enviado dado para stringf");
		JOptionPane.showMessageDialog(null, c1);
		c1.setObs(JOptionPane.showInputDialog(c1));
		
	} 

}
