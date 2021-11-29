package Thiago;

import java.util.Scanner;

//Calculo da Média

public class Thiago_Morais_01 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		float N1, N2 , N3, MEDIA;
		
		System.out.println("Informe a primeira nota");
		N1 =entrada.nextFloat();
		
		System.out.println("Informe a segunda nota");
		N2 =entrada.nextFloat();
		
		System.out.println("Informe a Terceira nota");
		N3 =entrada.nextFloat();
		
		MEDIA= ((N1+N2+N3)/3);
				
		System.out.printf(" O valor da Média é %.2f", MEDIA);
		
		
	}

}
