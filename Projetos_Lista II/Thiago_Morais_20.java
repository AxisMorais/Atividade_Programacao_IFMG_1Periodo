package Lista;

import java.util.Scanner;

public class Thiago_Morais_20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System .in);
		
		int Num_1, Num_2;
		double resto;
		
		System.out.println("Informe o priemiro valor");
		Num_1= entrada.nextInt();
		
		System.out.println("Informe o priemiro valor");
		Num_2= entrada.nextInt();
		
		resto = Num_1 % Num_2;
		
		if (resto == 0) {
			System.out.println("O número " + Num_1 + " é multiplo de " + Num_2);
		}
		else{
			System.out.println("O número " + Num_1 + " não é multiplo de " + Num_2);
		}
		
	}
	
	
}
