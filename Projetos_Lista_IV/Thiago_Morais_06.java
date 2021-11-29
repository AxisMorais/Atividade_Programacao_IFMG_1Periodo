package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_06 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in); 
	
    int vetor[  ] = new int[6]; 
    int conjunto_par[  ] = new int[6];
    int conjunto_impar[  ] = new int[6];
    int contador=0,  Contador_Par=0, Contador_impar=0;
    
       
    for ( int i =0 ;  i< vetor.length ;  i++) {
    	       System.out.println("Informe a " + (i +1) + "º a posição do vetor");
    	       vetor[i] = entrada.nextInt();
    	     
    	         if (  vetor[i] >= 0  &&   vetor[i]%2 ==0) { // Vetor positvo e par.
					    conjunto_par[Contador_Par] =vetor[i];
					    Contador_Par++; // Esse contador serve para dizer qual posição deve ser andado no vetor conjunto par
				 }
    	         else if (    (vetor[i] <0)      ||   (vetor[i]   %2 != 0 )   ) {
    	        	 conjunto_impar [Contador_impar]=vetor[i];
    	        	 Contador_impar++;
    	         }
    	  
    }
    System.out.println("Conjunto A - Pares e positivos");
    for (   int i =0 ;  i <  vetor.length;   i++ ) {
    	System.out.print(conjunto_par[i]+ " - ");
	}
    System.out.println(" \n Conjunto B - Impares ou Negativos");
    for (   int i =0 ;    i<6 ;   i++ ) {
    	System.out.print(conjunto_impar[i] + " - ");
	}
    	    	
//Chaves mães		
    
	 }
}

