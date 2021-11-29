package Thiago;

import java.util.Scanner;

//Calculo das contas atrasadas de João

public class Thiago_Morais_11 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		double CO_1, CO_2, SAL;
		
		System.out.println("Informe o valor do Salário");
		SAL =entrada.nextDouble();
		
		System.out.println("Informe o valor da primera conta");
		CO_1= entrada.nextDouble();
		
		System.out.println("Informe a Terceira nota");
		CO_2= entrada.nextDouble();
		
		
		SAL=SAL-(CO_1+CO_2);
		
		System.out.printf(" O valor do salário é %.2f", SAL);
		
		
	}
	

}
