package LISTA_4;

import java.util.Scanner;

public class Thiago_Morais_27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int Linhas;
		
		System.out.println("Informe a quantidaes de linhas ");
        Linhas=entrada.nextInt();
        
        
	    for (int i =1; i<= Linhas ; i++) { // numero de linhas 
	        
	    	for (int j =1; j<= i; j++) { // numero de hash-tags
	    	   System.out.print("#");
	         }
	    	
	      System.out.println("");	
	   }
	
	}
}	
