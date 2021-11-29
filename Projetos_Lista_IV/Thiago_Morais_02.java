package Lista_Vetor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Receber valores para um vetor e invertê-los 

public class Thiago_Morais_02 {

	public static void main(String[] args) {
		
		 Scanner  entrada = new  Scanner  (System.in);
		 
		 int vetor[] = new int [10];
		 int vetor_Invertido[] = new int [10];
		
		 for (int i = 0; i < vetor.length; i++) {
		
			 System.out.println("Informe o " + (i+1)+ "º valor: "    );
			 vetor[i] =entrada.nextInt();
		}
		 
			 
		 for (int i = 0; i < vetor.length; i++) {
			 vetor_Invertido[ i ] =  vetor[  (vetor.length - i) -1  ];
			 System.out.print( vetor_Invertido[i]);
		  }  
        
		//---------------------------------------------------------------------------------------------- 
		 //Outra forma de fazer:
		//---------------------------------------------------------------------------------------------- 
			 
		     for (int i = 1; i < vetor.length; i++) {
				  vetor_Invertido[ i ] =  vetor[  (vetor.length - i)  ];
				  System.out.print( vetor_Invertido[i]);
			  }
		 
		 
	}
}
