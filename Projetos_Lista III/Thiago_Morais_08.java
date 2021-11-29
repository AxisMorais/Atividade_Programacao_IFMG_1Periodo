package LISTA_4;

import java.util.Scanner;

/*
   Faça um algoritmo que imprima a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N.
   O valor de N deve ser positivo e fornecido pelo usuário.
*/

public class Thiago_Morais_08 {

	 public static void main(String[] args) {
		
	 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Informe um valor para N:");
		 double N =scan.nextDouble(), acumulador=1;
		 
		 for (int i =2; i<= N; i++) {
			
			 if (i % 2 ==0) {
				acumulador=  acumulador - (1.0 /i);
			}else {
				
 				acumulador += (1.0 /i) ;
				
			}
			 
		}
		 
		 System.out.println(acumulador);	
		 	 	 	 
		 
	 }
	 }
