package Thiago;

import java.util.Scanner;

public class Thiago_Morais_20 {
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		double NUM_HORAS_TRAB, SAL_MIN, NUM_H_EX_RE, VALOR_HORA_EXT,HORAS_TRAB,SAL_BRUT,SAL_FINAL,HORA_EXTRA; 
		
		System.out.println("Informe o valor do salário mínimo");
		SAL_MIN =entrada.nextDouble();
		
		System.out.println("Informe o número de horas trabalhadas");
		NUM_HORAS_TRAB =entrada.nextDouble();
		
		System.out.println("Informe o número de horas extras realizadas");
		NUM_H_EX_RE =entrada.nextDouble();
		
		
		VALOR_HORA_EXT=(SAL_MIN*0.025);
		HORAS_TRAB=(SAL_MIN *0.125);
		SAL_BRUT=(HORAS_TRAB*NUM_HORAS_TRAB);
		HORA_EXTRA=(VALOR_HORA_EXT * NUM_H_EX_RE);
		SAL_FINAL= (SAL_MIN + HORA_EXTRA);
				
		System.out.printf(" O valor do Salário é de:  %.2f", SAL_FINAL);
		
		
	}
	

}
