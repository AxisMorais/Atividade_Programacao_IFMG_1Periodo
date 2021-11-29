package LISTA_4;

import java.util.Iterator;
import java.util.Scanner;

// Calculo do número primo;

public class Thiago_Morais_13 {

	
	 public static void main(String[] args) {
		
		 Scanner entrada  = new Scanner( System.in);
		 
		 int Num, divisores=0;
		 
		 
		 System.out.println("Informe um número inteiro");
		 Num=entrada.nextInt();
		 
		 
		 
		 for (int i = 1; i <= Num ; i++) {
			
			if (Num % i == 0) {
				divisores++;
			}
		 }
		 		 
		 if (divisores ==2) {
			System.out.println( Num + " é primo! ");
		 }else {
			System.out.println(Num + " Não é primo!");
		 }
		 
		 
			 
		}
	 }

