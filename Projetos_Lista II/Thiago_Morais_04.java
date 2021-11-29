package Lista;

import java.util.Scanner;

// Cálculo da equação de segundo grau 

public class Thiago_Morais_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b , c,  delta, r1 = 0, r2 = 0; 
		
		System.out.println("Informe o valor dos coeficientes a,b , c");
		
		a=entrada.nextDouble();
		b= entrada.nextDouble();
		c= entrada.nextDouble();
		
		if (a == 0) {
			System.out.println("Não é uam função do 2º Grau");
			if (b == 0) {
				System.out.println("Não é uma função do 1º Grau");
			} else {
				r1 = (-c / b);
				System.out.println("A raiz da equação do  1º Grau é: " + r1);
			}

		} else {
			delta = (Math.pow(b, 2)) - (4 * a * c);

			if (delta < 0) {
				System.out.println("Não existe há raizes reais");
			} else {
				r1 = (-b + Math.sqrt(delta)) / (2 * a);
				r2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("O valor da primera raiz é: " + r1);
				System.out.println("O valor da segunda raiz é de:" + r2);
			}
			
		}

	}

}
