package Lista;

import java.util.Scanner;

public class Thiago_Morais_13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int Peso;
		double imc = 0 ;
		double altura;

		System.out.println("Informe o valor do valor do peso ");
		Peso = entrada.nextInt();

		System.out.println("Informe o valor do valor da altura ");
		altura = entrada.nextInt();

		imc = Peso / (altura = Math.pow(altura, 2));

		if (imc < 18.5) {

			System.out.println("Abaixo do peso");

		} else if (imc >= 18.5 && imc <= 25) {

			System.out.println("Peso Normal ");

		} else if (imc > 25 && imc <= 30) {

			System.out.println("Acima do peso");

		} else if (imc > 30) {

			System.out.println("Obesidade");

		}

	}

}
