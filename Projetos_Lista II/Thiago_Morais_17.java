package Lista;

import java.util.Scanner;

public class Thiago_Morais_17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System .in);
		
		int Lado_a, Lado_b, Lado_c;
		
		
		System.out.println("Informe o lado A");
		Lado_a =entrada.nextInt();
		

		System.out.println("Informe o lado b");
		Lado_b =entrada.nextInt();
		

		System.out.println("Informe o lado C");
		Lado_c =entrada.nextInt();
		
		
		
		if (Lado_a < Lado_b + Lado_c || Lado_b < Lado_a  + Lado_c  || Lado_c <Lado_a + Lado_b  ) {
			System.out.println( "É possível construir um triangulo com esses valorers");
			
			if (Lado_a == Lado_b && Lado_a == Lado_c  ) {
				System.out.println( "É possível construir um triangulo equilátero");
			}
			else if (Lado_a == Lado_b || Lado_b == Lado_a || Lado_c == Lado_a) {
				System.out.println( "É possível construir um triangulo isoceles");
			}
			else if (Lado_a != Lado_b || Lado_b != Lado_a || Lado_c != Lado_a) {
				System.out.println( "É possível construir um triangulo escaleno");
				
			}
		}
		else {
			System.out.println("Não é possível montar um triângulo");
		}
		
		
		
		
		
	}
	
	
}
