package Lista;

import java.util.Scanner;


public class Thiago_Morais_14 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		double D,Q, S = 0 , N = 0 ;
		final double  Pi = 3.1415;
		 
	    System.out.println("Informe o valor do Diamêtro");
		D =entrada.nextDouble();
		
		System.out.println("Informe o valor da Carga");
		Q =entrada.nextDouble();
		
		if (D > 100) {

			N = 2;
			S = ((4 * Q) / (Pi * (D = Math.pow(D, 2)))) * N;
		}
		else if (D < 50 ) {
		   N = 6;
		   S = ((4 * Q) / (Pi * (D = Math.pow(D, 2)))) * N;
		}
		else if (D>50 && D<=100) {
		   N =4;
		   S = ((4 * Q) / (Pi * (D = Math.pow(D, 2)))) * N;
		}
		
		System.out.println("O valor da Tensão (S) calculada é de " + S);
		
			
	}
	
    	
}
