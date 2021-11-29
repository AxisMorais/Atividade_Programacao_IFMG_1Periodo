package Thiago;

//Formulas da àrea do trapézio 

import java.util.Scanner;

public class Thiago_Morais_08 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		float B, b, h, v, A, VT;
		
		System.out.println("Informe o valor da base maior do trapézio:");
		B =entrada.nextFloat();
		
		System.out.println("Informe o valor da base menor do trapezio:");
		b =entrada.nextFloat();
		
		System.out.println("Informe o valor da altura trapezio:");
		h =entrada.nextFloat();
		
		System.out.println("Informe o valor de venda do metro quadrado");
		v =entrada.nextFloat();
		
		A= ((B*b*h)/2);
		VT=(A*v);
		
		
		System.out.printf(" O valor da Média é R$ %.2f", VT);
		
		
	}
	
	
	
}
