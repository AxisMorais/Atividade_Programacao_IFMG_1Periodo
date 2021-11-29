package LISTA_4;

import java.util.Scanner;

// Faça um algoritmo que imprima a soma da sequência: H = 1/1 + 1/2 + 1/3 + ... + 1/N. 

public class Thiago_Morais_07 {

	 public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		
		 double N;
		 double divisao = 0, somatorio = 0;
		 
		 System.out.println("Informe o valor para N");
		 N =entrada.nextDouble();
		 
		 for (int i = 1; i <= N ; i++) {
		 	
			 divisao=(double) 1/i;
			 somatorio = somatorio +divisao;
			 
		 	  System.out.println("1 / " + i  );		 	
		 }
			 System.out.println("Somatório: "+ somatorio);
		 
  }
		 
}
