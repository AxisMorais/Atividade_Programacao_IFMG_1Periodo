package Prova;

import java.util.Scanner;

public class Thiago_Morais_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		  int num, Ultimo_algarismo;
	         
	         System.out.println("Informe o valor num�rico ");
	         num =entrada.nextInt();
	         
	         
	         if (num > 9999) {
	        	 System.out.println("N�mero maior que 4 d�gitos");
			 }
	         else {
	        	 Ultimo_algarismo =num % 10;
	        	 Ultimo_algarismo =Ultimo_algarismo +1;
	        	 System.out.println(" A menor base que pode ser representada �: " + Ultimo_algarismo);

	         }
			
			
			
		
	}
	
}
