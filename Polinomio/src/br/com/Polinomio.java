package br.com;

public class Polinomio {
	private double[] expressao;
	private int tamanho;
	private double[] primeiraDerivada;

	public Polinomio(double[] expressao) {
		this.expressao = expressao;
		this.tamanho = expressao.length;
		primeiraDerivada = new double[tamanho-1];
	}
	
	public void calcularPrimeiraDerivada(){
		int j = primeiraDerivada.length;
		System.out.print("P(x) = ");
		for (int i = 0; i < primeiraDerivada.length; i++) {
			primeiraDerivada[i] = expressao[i]*j;
			System.out.print(primeiraDerivada[i]+"x"+j+" ");
			j--;
		}
		System.out.println();
	}

	public double[] getExpressao() {
		return expressao;
	}

	public void setExpressao(double[] expressao) {
		this.expressao = expressao;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public double[] getPrimeiraDerivada() {
		return primeiraDerivada;
	}

	public void setPrimeiraDerivada(double[] primeiraDerivada) {
		this.primeiraDerivada = primeiraDerivada;
	}
}