package Lista_Vetor;

import java.util.Iterator;

public class Thiago_Morais_17 {

	public static void main(String[] args) {
		 
		  int Valor_maximo=10; // mudar vetor no final 
		  int primos[ ] = new int[Valor_maximo];
	       
		   int contador = 0;
	        int numero = 1;
	        while(contador < Valor_maximo){
	                if(primos [contador] <numero){
	                primos[contador] = numero;
	                contador++;
	               }
	            numero++;
	         }
	    
	        for (int i = 0; i < primos.length; i++) {
				System.out.println(primos[i]);
			}
	        
	        System.out.println("==================");
	        System.out.println();
	        
	    }
}  
   

