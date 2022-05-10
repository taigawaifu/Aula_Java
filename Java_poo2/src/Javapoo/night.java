package Javapoo;

import javax.swing.JOptionPane;

public class night {
	private String name;
	private double tall;
	int dateborn = 0;
	public double getall;

	public String setname() {
		return name;
	}

	public void getname(String name) {
		this.name = name;

	}

	public double settall() {
		return tall;
	}

	public void getall(double tall) {
		this.tall = tall;
	}

	public int setdateborn() {
		return dateborn;
	}

	public void getdaterbon(int dateborn) {
		dateborn = (Integer.parseInt(JOptionPane.showInputDialog("Informe sua data de nascismento")));
		dateborn -= setdateborn();
		this.dateborn = dateborn;
	}

}
