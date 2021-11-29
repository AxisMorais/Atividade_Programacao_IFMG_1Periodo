package Thiago;

import java.util.Scanner;

//Calculo do fundo de Investimento JUROS COMPOSTO

public class Thiago_Morais_10 {

	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		double CAPITAL=2000, I=0.5, TEMPO=24, MONTANTE, CALC_TAXA ;
		
		CALC_TAXA = Math.pow( (1+I),TEMPO ); 
		
		MONTANTE = CAPITAL * CALC_TAXA;
				
		System.out.printf(" O valor da Média é %.2f", MONTANTE );
		
		
	}
	
	
}
