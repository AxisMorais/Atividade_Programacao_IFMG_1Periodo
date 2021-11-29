package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
	    int Vetor_a[] =  new int [10];
	    int Vetor_b[ ] = new int [10];
        int Vetor_c[ ] = new int [20];
        int j=0;
	    
	    
	     for (  int i= 0  ; i <   10  ;  i++) {
	              System.out.println(" Para o vetor A, informe o " + (i+1)+ "º valor:  ");
	              Vetor_a[i]= Integer.parseInt(entrada.nextLine());
	      }
	    System.out.println("======================================");
	    
	     for (int i = 0; i < 10; i++) {
		        System.out.println(" Para o vetor B, informe o " + (i+1)+ "º  valor:  ");
                Vetor_b[i]=Integer.parseInt(entrada.nextLine());
	      }
	 
	    //----------------------------------------------------------------------------------------
	     // Intercalando Vetores:

	    for (int i = 0; i < 10; i++) {
			   Vetor_c[j]= Vetor_a[i];
		        j++;
		        Vetor_c[j]= Vetor_b[i];
		        j++;
	     }
	    
	    for (j = 0; j < 20 ; j++) {
			System.out.print( " - "+ Vetor_c[j]);
		}
	    
	   
// Chaves mães 	   
}     
}