package LISTA_4;

import java.util.Scanner;

// Calculo do MDC

public class Thiago_Morais_17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int DIVISOR = 0, DIVIDENDO = 0, QUOCIENTE, RESTO=1  ;
		
		System.out.println("Informe o valor de A ");
		DIVIDENDO=entrada.nextInt();
		 
		System.out.println("Informe o valor de B");
		DIVISOR=entrada.nextInt();
		
		int Aux_1, Aux_2;
		Aux_1=DIVIDENDO; Aux_2 = DIVISOR;
	
		
		while (RESTO != 0 ) {
			
			RESTO = DIVIDENDO % DIVISOR;
			DIVIDENDO = DIVISOR ;
			DIVISOR = RESTO;
			
		}
				
		System.out.println( " Resultado do  MDC entre " + Aux_1 + " e " + Aux_2);
		System.out.println (DIVIDENDO);
			
			
		
		
		
		
		
		
		
	}
	
}
