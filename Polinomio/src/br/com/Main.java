package br.com;

public class Main {

	public static void main(String[] args) {
		Polinomio ex1 = new Polinomio(new double[]{4, -1, -1, 1, 1});
		ex1.calcularPrimeiraDerivada();
		
		Polinomio ex2 = new Polinomio(new double[]{5, -9, -7, 3});
		ex2.calcularPrimeiraDerivada();
	}
}
