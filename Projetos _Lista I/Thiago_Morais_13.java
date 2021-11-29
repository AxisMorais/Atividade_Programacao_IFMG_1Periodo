package Thiago;

import java.util.Scanner;

//Calculo do Número de Copas

public class Thiago_Morais_13 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		int UE, NC;
		
		System.out.println("Informe o ano do último evento");
		UE =entrada.nextInt();
		
		NC= (((UE -1930)-2)/4);
		
		System.out.println(" O número de copas é de: " + NC);
		
		
	}

}
