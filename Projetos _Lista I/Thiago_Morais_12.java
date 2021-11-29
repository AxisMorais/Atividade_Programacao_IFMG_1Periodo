package Thiago;

import java.util.Scanner;

// Calculo da de Km da caminhada da Dona Maria

public class Thiago_Morais_12 {

	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		float  KM_CAMINHADA, RUA_1, RUA_2 , RUA_3, SOMATORIO, TOTAL_VOLTAS;
		
		System.out.println("Informe a quantidade a ser percorrida em KM:");
        KM_CAMINHADA=entrada.nextFloat(); 
				
		System.out.println("Informe o valor da primeria rua EM METROS:");
		RUA_1 =entrada.nextFloat();
		
		System.out.println("Informe o valor da segunda rua EM METROS");
		RUA_2 =entrada.nextFloat();
		
		System.out.println("Informe o valor da terceira rua EM METROS");
		RUA_3 =entrada.nextFloat();
		
		KM_CAMINHADA = (KM_CAMINHADA*1000);
		
		
	    SOMATORIO = (RUA_1 + RUA_2 + RUA_3);
		TOTAL_VOLTAS = (KM_CAMINHADA/SOMATORIO); 
				
		System.out.println(" O número de voltas a ser dado é: " + TOTAL_VOLTAS);
		
		
	}
	
	
}
