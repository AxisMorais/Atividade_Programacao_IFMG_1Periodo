package Lista;

import java.util.Scanner;

public class Thiago_Morais_18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System .in);
		
		 int numero, a , b , c;
		 
		 
		   System.out.println("Informe um numero com três digitos ");
	        numero = entrada.nextInt();
	        
	        a = numero %100;
	        numero = numero/10;
	        
	        b = numero % 100;
	        numero = numero/10;
	        
	        c = numero % 100;
	       
	         if(a==c){
	            System.out.println("Esse número cumpre todos os requisitos sendo classificado como Políndromo ");
	         }
	            
	       
	        else{
	            System.out.println("O numero não cumpre os requisistos para ser um Palindromo");
	        }
	        

		 
		 
	}
	 
}
