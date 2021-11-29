package Thiago;

import java.util.Scanner;

// Entrada um número real mostrando a  parte inteira desse número e a parte decimal.

public class Thiago_Morais_17 {

	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		
		double VALOR, NUM, PARTE_INTEIRA, PARTE_QUEBRADA;
		
		System.out.println("Informe o valor: ");
		NUM =entrada.nextDouble();
		
		PARTE_INTEIRA=(int)NUM;
		PARTE_QUEBRADA = PARTE_INTEIRA - NUM ; // RESTO_HORA recebe  os resto da divisão entre minutos e 60 	
		
        System.out.println("PARTE INTEIRA " + PARTE_INTEIRA +" PARTE DECIMAL " + PARTE_QUEBRADA ); 
		
	}
			
}
