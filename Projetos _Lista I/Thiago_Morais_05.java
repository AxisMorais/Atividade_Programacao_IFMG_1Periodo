package Thiago;

import java.util.Scanner;

//Claculo do Salário

public class Thiago_Morais_05 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		
		double SAL_BASE, NOVO_SAL;
		
		System.out.println("Informe o valor do Salário Base");
		SAL_BASE= entrada.nextDouble(); 
		
		NOVO_SAL = SAL_BASE + (SAL_BASE * 0.10 );
		
		NOVO_SAL = (NOVO_SAL - (NOVO_SAL * 0.05));		
				
		System.out.printf(" O valor Calculado do novo salário é %.2f", NOVO_SAL );
		
		
	}

}
