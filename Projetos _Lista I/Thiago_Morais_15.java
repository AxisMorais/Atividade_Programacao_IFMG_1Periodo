package Thiago;

import java.util.Scanner;

public class Thiago_Morais_15 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada = new Scanner (System.in);
		
		final double PI=3.1416; 
		
		double RAIO, AREA;
		
		System.out.println("Informe o valor do Raio da circunferência");
		RAIO =entrada.nextDouble();
		
		RAIO= Math.pow(RAIO, 2);
		
		AREA = (PI* RAIO);
				
		System.out.printf(" O valor da área da circunferencia é:  é %.2f",AREA);
		
		
	}

}
