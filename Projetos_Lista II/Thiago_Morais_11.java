package Lista;

import java.util.Scanner;

public class Thiago_Morais_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x;
		double resultado;
		
		System.out.println("Informe o valor de X");
		x =entrada.nextInt();
		
		if (x < 1) {
			System.out.println("O valor de X é 1");
		}
		else if (x > 1 && x <= 2) {
			
			System.out.println("O valor de X é 2");
		}
		else if (x > 2 && x <= 3) {
			
			resultado = Math.pow(x,2);
			System.out.println("O valor de X é " + resultado);
			
		} else if (x >= 3){
			
			resultado = Math.pow(x,3);
			System.out.println("O valor de X é " + resultado);
		}
		
		
		
		
		
		
		
	}
}
