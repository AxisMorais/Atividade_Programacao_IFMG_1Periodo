package Thiago;

import java.util.Scanner;

//Calculo do numero de diagonais do poligno convexo regular


public class Thiago_Morais_09 {
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		int  NL, ND ;
		
		System.out.println("Informe o valor do Numero de lados ");
		NL=entrada.nextInt();
		
		ND = (NL*(NL - 3)/2);                       
		
		System.out.println(" O Número de diagonais é" + ND);
		
		
	}
}
