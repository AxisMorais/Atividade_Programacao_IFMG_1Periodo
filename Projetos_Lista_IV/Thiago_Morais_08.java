package Lista_Vetor;

import java.util.Iterator;
import java.util.Scanner;

public class Thiago_Morais_08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		  
		float vetor_um[ ] = new float [5]; 
		float vetor_dois[] = new float [5];
		float terceiro [ ] = new float [5];
		
		for (int i = 0  ;    i <vetor_um.length ;   i++) {
		    
			System.out.println("Informe os valores para o vetor um ");
		     vetor_um[i]=entrada.nextFloat();
		}

		for (int i = 0; i < vetor_dois.length; i++) {
		    System.out.println("Informe os valores para a posição dois");
		     vetor_dois[i]=entrada.nextFloat();
		}
		
		for (int i = 0; i < 5; i++) {
			
			if (vetor_um[i] == vetor_dois [i] ) {
				terceiro[i]= 1;
			} else {
				terceiro[i]= 0;
			}
		}
		
		for (int i = 0; i < 5; i++) {
		System.out.println(terceiro[i]);	
		}
		
				
	}
	
}
