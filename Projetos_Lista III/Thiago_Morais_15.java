package LISTA_4;

import java.util.Scanner;

//Sequencia de Fibonacci

public class Thiago_Morais_15 {
 
	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner( System.in);
		 
		int Num, Fibonacci = 0 , a=1 , b=0, aux=0;
		
		System.out.println("Quantos números você deseja ver na sequencia de Fibonacci? ");
		Num= entrada.nextInt();
		
		
		
		for ( int i = 1 ;  i <=Num  ; i++) {
		
			aux=a; // Auxiliar guarda o valor de  a, antes de armazenar b
 			
			System.out.print(a + " - ");
			a+=b;   // a =a +b;
			b = aux;
			
		}
}
}
