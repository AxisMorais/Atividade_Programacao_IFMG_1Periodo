package Lista;
import java.util.Scanner;

// Cálculo da Raiz e da potência

public class Thiago_Morais_03 {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double NUM_1, NUM_2, raiz, quadrado;
		
		System.out.println("Informe o valor do primeiro núpumero");
		NUM_1= entrada.nextDouble();
		
		System.out.println("Informe o valor do primeiro núpumero");
		NUM_2 =entrada.nextDouble();
		
		
		if (NUM_1 > NUM_2) {
			
			quadrado = Math.pow(NUM_2, 2);
			System.out.println("O Quadrado do menor é:  " + quadrado);

			if (NUM_1 >= 0) {
				raiz = Math.sqrt(NUM_1);
				System.out.println("A raiz do maior é :" + raiz);
			} else {
				System.out.println("O maior número não possui raiz real");
			}
		}

		else if (NUM_2 > NUM_1) {
			quadrado = Math.pow(NUM_1, 2);
			System.out.println("O quadrado do menor é" + quadrado);
			if (NUM_2 > 0) {
				raiz = Math.sqrt(NUM_2);
				System.out.println("A raiz do maior é :" + raiz);
			}
		}
	}

}
