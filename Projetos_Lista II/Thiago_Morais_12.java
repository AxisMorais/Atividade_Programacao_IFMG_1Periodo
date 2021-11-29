package Lista;

import java.util.Scanner;

public class Thiago_Morais_12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
		   
		System.out.println("Informe a idade do nadador ");   
		idade= entrada.nextInt();
		
		if (idade < 5 ) {

			System.out.println("Idade Inválida");

		}
				
		if (idade >= 5 && idade <= 7) {

			System.out.println("Categoria: Infantil");

		} 
		
		else if (idade >= 8 && idade <= 10) {
           
			System.out.println("Categoria Pre Adolecente");	 
			
		}
		
		else if (idade >= 11 && idade <= 15) {

			System.out.println("Categoria: Adolescente ");

		} 
		
		else if (idade >= 16 && idade <= 40) {

			System.out.println("Categoria: Adulto ");
			
		} else if (idade > 40) {
			
			System.out.println("Categoria: Sênio ");
					
		}

		

	}
}
