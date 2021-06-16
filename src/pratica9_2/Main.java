package pratica9_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Divisao divi = new Divisao();

		try {
			System.out.println("Digite um numero ");
			divi.setNumerador(sc.nextInt());

			System.out.println("Digite o segundo numero ");
			divi.setDenominador(sc.nextInt());

			divi.calculo();

			System.out.println("O resultado da divisão é ");

			System.out.println(divi.getResult());

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
