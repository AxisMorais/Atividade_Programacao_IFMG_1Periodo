package Thiago;

import java.util.Scanner;

// Calculo do quadrado, do cubo e da raiz

public class Thiago_Morais_19 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada = new Scanner (System.in);
		
		double valor, cubo, quadrado, raiz_quadrada, raiz_cubica;
		
		System.out.println("Informe o valor a ser calculado:");
		valor =entrada.nextDouble();
		
		quadrado= Math.pow(valor, 2);
		cubo= Math.pow(valor, 3);
		raiz_quadrada= Math.sqrt(valor);
		raiz_cubica=Math.cbrt(valor);
		
				
		System.out.println(" O valor calculado do quadraddo é: " + quadrado );
		System.out.println(" O valor calculado do cubo é:  é:  " + cubo);
		System.out.println(" O valor calculado da raiz é:  é:  " + raiz_quadrada);
		System.out.println(" O valor calculado da raiz é:  é:  " + raiz_cubica);
		
	}
	

}
