package Thiago;

import java.util.Scanner;

//Calculo do Antecesssor e sucessor 

public class Thiago_Morais_02 {
	
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		int ANT, SUC , N;
		
		System.out.println("Informe  o numero ");
		N =entrada.nextInt();
		
		ANT = (N -1);
		SUC =( N +1 );
		
		System.out.println(" O número é "+ N +" Seu antecessor é  "+ ANT +" e seu sucesso é " + SUC );			
		
		
	}
	
	
	
	
	
	
	
	

}
