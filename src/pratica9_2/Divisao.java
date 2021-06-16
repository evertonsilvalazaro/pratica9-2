package pratica9_2;

import java.util.Scanner;

public class Divisao {
	Scanner sc = new Scanner(System.in);
	int numerador, denominador;
	int result;

	public int getNumerador() {
		return this.numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return this.denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public int getResult() {
		return this.result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void calculo() {
		if(this.denominador > 0 && this.denominador<10)
		{
			throw new ArithmeticException("O divisor não pode ser menor que 10");
		}
		this.result = this.getNumerador() / this.getDenominador();
	}
}
