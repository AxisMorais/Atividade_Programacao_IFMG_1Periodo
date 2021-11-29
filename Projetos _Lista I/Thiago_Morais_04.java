package Thiago;

import java.util.Scanner;

// Calculo da Média Ponderada

public class Thiago_Morais_04 {

	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		float N1, N2 , N3, P1, P2, P3,  MED_PON;
		
		System.out.println("Informe o primeiro valor");
		N1 =entrada.nextFloat();
		
		System.out.println("Informe a primeiro peso");
		P1 =entrada.nextFloat();
		
		System.out.println("Informe o segundo valor");
		N2 =entrada.nextFloat();
		
		System.out.println("Informe  o segundo peso");
		P2 =entrada.nextFloat();
		
		System.out.println("Informe o terceiro valor");
		N3 =entrada.nextFloat();
		
		System.out.println("Informe  o terceiro peso");
		P3 =entrada.nextFloat();
		
		MED_PON= ((N1*P1)+(N2*N2)+(N3*P3)/ (P1+P2+P3)); 
		
								
		System.out.printf(" O valor Calculado é %.2f", MED_PON);
		
		
	}
	
	
	
}
