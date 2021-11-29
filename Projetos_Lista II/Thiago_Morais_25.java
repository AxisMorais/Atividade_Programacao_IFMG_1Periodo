package Lista;

import java.util.Scanner;

public class Thiago_Morais_25 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double altura, Peso, Ideal = 0;
		char Genero;
		
		System.out.println(" Informe o valor da altura:");
		altura=entrada.nextDouble();
		
				
		System.out.println("Informe o Gênero: (M) para Masculino (F) para feminino ");
		Genero=entrada.next().charAt(0);
		
					 
 		if (Genero =='M') {
			Ideal = (altura * 72.7) - 58;
		}
		
		if (Genero =='F') {
			Ideal = (altura * 62.1) - 44.7;
		}
		 		 
	
		
		System.out.printf("O peso ideal deve ser de: %.2f", Ideal );
		
	}	
}
