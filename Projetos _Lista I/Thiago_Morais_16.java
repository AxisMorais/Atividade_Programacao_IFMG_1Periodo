package Thiago;

import java.util.Scanner;

//Converter minutos em horas

public class Thiago_Morais_16 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		double minutos, HORA_PARTE_INTEIRA, RESTO_HORA;
		
		System.out.println("Informe o valor do Minutos:");
		minutos =entrada.nextDouble();
		
		HORA_PARTE_INTEIRA=(int)(minutos /60);
		RESTO_HORA = minutos % 60; // RESTO_HORA recebe  os resto da divisão entre minutos e 60 	
		
        System.out.println("Resultado da conversão: " + HORA_PARTE_INTEIRA+" HORAS E " + RESTO_HORA+" MINUTOS" ); 
		
	}
		
				
	}
	


