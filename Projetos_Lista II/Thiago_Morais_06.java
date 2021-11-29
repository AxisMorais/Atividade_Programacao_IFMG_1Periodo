package Lista;

import java.util.Scanner;

//Calculadora Simples

public class Thiago_Morais_06 {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		int operação;
		double Num_1, Num_2, resultado;
		
		System.out.println("Informe o item de acordo com as categorias das operações:");
		System.out.println("1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão");
		operação = entrada.nextInt();
		
		
		System.out.println("Informe o valor do primeiro número: ");
		Num_1 = entrada.nextDouble();
		
		
		System.out.println("Informe o valor do número: ");
		Num_2 = entrada.nextDouble();
				
		switch (operação) {
		case 1: {
			resultado = Num_1 + Num_2;
			System.out.println("Resultado da soma: " + resultado);
			break;
		}

		case 2: {
			resultado = Num_1 - Num_2;
			System.out.println("Resultado da Subtração : " + resultado);
			break;

		}
		case 3: {
			resultado = Num_1 * Num_2;
			System.out.println("Resultado da Multiplicação: " + resultado);
			break;

		}
		case 4: {
			resultado = Num_1 / Num_2;
			System.out.println("Resultado da Divisão: " + resultado);
			break;

		}
		
		
		}
	}
	
}
