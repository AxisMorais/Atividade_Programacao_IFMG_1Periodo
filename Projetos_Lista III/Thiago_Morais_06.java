package LISTA_4;

import java.util.Scanner;

//Faça um programa que calcule e imprima a soma e a média dos N primeiros números positivos. Soma = 1 + 2 + 3 + ... + N 

public class Thiago_Morais_06 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double N , soma = 0;
		
		System.out.println("Informe um  valor para N ");
	    N=entrada.nextInt();
	    
	    for (int i = 1; i <= N;i++) {
			 
			  soma=(soma + i);
			 		    		     
		    }  
	       soma= (soma/N);  
		    System.out.println(" O Resultado do calculo da médoa é:  " +soma);
	    
		
	 }
}
