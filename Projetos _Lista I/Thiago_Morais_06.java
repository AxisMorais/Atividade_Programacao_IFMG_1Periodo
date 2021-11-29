package Thiago;

import java.util.Scanner;

//Calculo da Comissão 

public class Thiago_Morais_06 {

	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		Double SF, NV, C, NS, P;
		
		System.out.println("Informe o valor do Salário Fixo");
		SF =entrada.nextDouble();
		
		System.out.println("Informe o número de vendas realizadas");
		NV =entrada.nextDouble();
		
		System.out.println("Informe o valor do Preço do produto");
		P =entrada.nextDouble();
		
		C= (( NV * P *0.04 ));
		NS=(SF + C);		
		
		System.out.printf(" O valor da Média é %.2f", NS);
		
		
	}
}
