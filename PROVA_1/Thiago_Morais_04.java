package Prova;

import java.util.Scanner;

public class Thiago_Morais_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		double Preço_compra;
		int categoria = 0;
		char situação;
		
		System.out.println(" O produto precisa de refrigeração? Informe  S  para Sim ou  N para Não: ");
		situação= entrada.next().charAt(0);
		
				
		System.out.println("Informe o valor da compra:");
		Preço_compra= entrada.nextDouble();
		
		System.out.println("Informe a categotia:  1 - 2 - 3 ");
		categoria=entrada.nextInt();
		
		if (situação == 'S') {
			System.out.println("O produto preceisa de refrigeraçao");
		}
		else if(situação=='N'){
			System.out.println("O produto não preceisa de refrigeraçao");
		}
		
		if (Preço_compra<=25) {
			
			switch (categoria) {
	         
			           case 1:{
			        	        Preço_compra =Preço_compra +(Preço_compra*0.05);
			        	         
			        	        			        	        
			                   }
			           case 2:{
		        	             Preço_compra =Preço_compra +(Preço_compra*0.08);
		                       }
			           
			           case 3:{
	        	                 Preço_compra =Preço_compra +(Preço_compra*0.10);
	        	             
	        	               
	                          }
			           
			}
		     
		}
		else if (Preço_compra > 25) {
			
			switch (categoria) {
	         
	           case 1:{
	        	        Preço_compra =Preço_compra +(Preço_compra*0.12);
	                   }
	           case 2:{
     	             Preço_compra =Preço_compra +(Preço_compra*0.15);
                    }
	           case 3:{
 	                Preço_compra =Preço_compra +(Preço_compra*0.18);
 	             
                  }
     	     }
	    }	
			
		if (situação =='S' || categoria == 3) {
			Preço_compra=Preço_compra -(Preço_compra*0.08);
			 System.out.println("O desconto foi de 8%");
		}
		else if (categoria == 2 && situação == 'N') {
			Preço_compra=Preço_compra -(Preço_compra*0.05);
			 System.out.println("O desconto foi de 5%");
		}
		else {
			Preço_compra=Preço_compra -(Preço_compra*0.03);
			System.out.println("O desconto foi de 3%");
		}
		
		System.out.printf("O preço total  é de R$%.2f: \n", Preço_compra);
		
		
		 if (Preço_compra <= 50) {
	            System.out.println(" Produto está em conta!.");
	        }
	        if (Preço_compra > 50 && Preço_compra < 120) {
	            System.out.println(" Preço Normal.");
	        }
	        if (Preço_compra >= 120) {
	            System.out.println(" Preço Acima do esperado.");
	        }
		
	}
	
}
