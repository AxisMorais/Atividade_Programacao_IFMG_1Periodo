package Prova;

import java.util.Scanner;

public class Thiago_Morais_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		double Pre�o_compra;
		int categoria = 0;
		char situa��o;
		
		System.out.println(" O produto precisa de refrigera��o? Informe  S  para Sim ou  N para N�o: ");
		situa��o= entrada.next().charAt(0);
		
				
		System.out.println("Informe o valor da compra:");
		Pre�o_compra= entrada.nextDouble();
		
		System.out.println("Informe a categotia:  1 - 2 - 3 ");
		categoria=entrada.nextInt();
		
		if (situa��o == 'S') {
			System.out.println("O produto preceisa de refrigera�ao");
		}
		else if(situa��o=='N'){
			System.out.println("O produto n�o preceisa de refrigera�ao");
		}
		
		if (Pre�o_compra<=25) {
			
			switch (categoria) {
	         
			           case 1:{
			        	        Pre�o_compra =Pre�o_compra +(Pre�o_compra*0.05);
			        	         
			        	        			        	        
			                   }
			           case 2:{
		        	             Pre�o_compra =Pre�o_compra +(Pre�o_compra*0.08);
		                       }
			           
			           case 3:{
	        	                 Pre�o_compra =Pre�o_compra +(Pre�o_compra*0.10);
	        	             
	        	               
	                          }
			           
			}
		     
		}
		else if (Pre�o_compra > 25) {
			
			switch (categoria) {
	         
	           case 1:{
	        	        Pre�o_compra =Pre�o_compra +(Pre�o_compra*0.12);
	                   }
	           case 2:{
     	             Pre�o_compra =Pre�o_compra +(Pre�o_compra*0.15);
                    }
	           case 3:{
 	                Pre�o_compra =Pre�o_compra +(Pre�o_compra*0.18);
 	             
                  }
     	     }
	    }	
			
		if (situa��o =='S' || categoria == 3) {
			Pre�o_compra=Pre�o_compra -(Pre�o_compra*0.08);
			 System.out.println("O desconto foi de 8%");
		}
		else if (categoria == 2 && situa��o == 'N') {
			Pre�o_compra=Pre�o_compra -(Pre�o_compra*0.05);
			 System.out.println("O desconto foi de 5%");
		}
		else {
			Pre�o_compra=Pre�o_compra -(Pre�o_compra*0.03);
			System.out.println("O desconto foi de 3%");
		}
		
		System.out.printf("O pre�o total  � de R$%.2f: \n", Pre�o_compra);
		
		
		 if (Pre�o_compra <= 50) {
	            System.out.println(" Produto est� em conta!.");
	        }
	        if (Pre�o_compra > 50 && Pre�o_compra < 120) {
	            System.out.println(" Pre�o Normal.");
	        }
	        if (Pre�o_compra >= 120) {
	            System.out.println(" Pre�o Acima do esperado.");
	        }
		
	}
	
}
