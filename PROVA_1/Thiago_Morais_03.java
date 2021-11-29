package Prova;

import java.util.Scanner;

public class Thiago_Morais_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		  int num, Ultimo_algarismo;
	         
	         System.out.println("Informe o valor numérico ");
	         num =entrada.nextInt();
	         
	         
	         if (num > 9999) {
	        	 System.out.println("Número maior que 4 dígitos");
			 }
	         else {
	        	 Ultimo_algarismo =num % 10;
	        	 Ultimo_algarismo =Ultimo_algarismo +1;
	        	 System.out.println(" A menor base que pode ser representada é: " + Ultimo_algarismo);

	         }
			
			
			
		
	}
	
}
