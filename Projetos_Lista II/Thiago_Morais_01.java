package Lista;

import java.util.Scanner;

//identificar se o numero digitado pelo usuário é positivo, negativo ou zero.

public class Thiago_Morais_01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int Numero;

		System.out.println("Informe o número:");
		Numero = entrada.nextInt();

		if (Numero > 0) {

			System.out.println("Número Positivo");

		} else if (Numero < 0) {
			System.out.println("Numero Negativo ");
		} else {
			System.out.println("Esse valor é Nulo - Zero ");
		}
	}

}
