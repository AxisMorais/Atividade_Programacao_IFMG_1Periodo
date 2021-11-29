package Lista_Vetor;

// Quadrado da posição do Vetor

import java.util.Iterator;
import java.util.Scanner;

public class Thiago_Morais_04 {

	public static void main(String[] args) {
		
		 Scanner  entrada = new  Scanner  (System.in);

	   int vetor[] = new int[10];
	   
	    for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe os valores do vetor");
			vetor[i] = entrada.nextInt();
		}
	    
	    System.out.println("Resultado:");
	    
	   
	    for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.pow(vetor[i], 2) ;  	
			System.out.println(vetor[i]);
		}
	    
	   		 
	}
}