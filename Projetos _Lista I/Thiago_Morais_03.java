package Thiago;

import java.util.Scanner;

public class Thiago_Morais_03 {

// Multiplicação de Números reais
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		float N1, N2 , N3, CALCULO;
		
		System.out.println("Informe a primeira nota");
		N1 =entrada.nextFloat();
		
		System.out.println("Informe a segunda nota");
		N2 =entrada.nextFloat();
		
		System.out.println("Informe a Terceira nota");
		N3 =entrada.nextFloat();
		
		CALCULO= ((N1*N2)/N3);
				
		System.out.printf(" O valor Calculado é %.2f", CALCULO);
		
		
	}

}
