package Avaliacao;

import java.util.Scanner;

public class Thaigo_Morais_01 {

	
	public static void main(String[] args) {
		
      Scanner entrada = new Scanner(System.in);
		
	  int Num_Maximo=20;
	    
	  int[]Codigo_Carros= new int[Num_Maximo]; 
	  boolean verificacao = true;
	  int Opcao, Quant_VeiculoCad;
	  int ConsultaCarro;
		
		
		do {
		       System.out.println("\n INFORME A OPÇÃO: ");
		       System.out.println("=======================\n" +
                                  "        MENU           \n" +
                                  "=======================\n" +
                                    "1 – Cadastrar Veículo\n" +
                                    "2 – Consultar Veículo\n" +
                                    "3 - Sair\n" +
                                  "========================");
		      Opcao=entrada.nextInt();
		      
		      switch (Opcao) {
			         
		             case 1: {
				               System.out.println("Cadastrar Veículo");
				               System.out.println("Informe quantos veículos deseja cadastrar");
				               System.out.println("Quantidade máxima de cadastros permitidos: 20");
				               Quant_VeiculoCad=entrada.nextInt();
				               
				                if (Quant_VeiculoCad > 20 || Quant_VeiculoCad <=0) {
				            	     System.out.println("O valor informado está fora do permitido");
				            	    
				                  }else{
				            	       
				                          for (int i = 0; i < Quant_VeiculoCad ; i++) {
				                        	  entrada.nextLine();
								              System.out.println("Informe o código do Veículo ");
								              Codigo_Carros[i]=entrada.nextInt();
				            	              
				            	           }
				                   
				                    }
				               System.out.println("===============================================");
				               break;
			                 }
		             
		             case 2: {
		            	      
		            	       System.out.println("Consultar Veículo");
		            	       entrada.nextLine();
		            	       System.out.println("Para consultar, Informe o nome do veículo  ");
		            	       ConsultaCarro=entrada.nextInt();
		            	       		            	       
		            	       boolean encontrou = false; 
		            			 for (int i = 0; i < Codigo_Carros.length; i++) {
		            			      int elemento = Codigo_Carros[i];
		            			       if(elemento == ConsultaCarro) {
		            			           encontrou= true;
		            			    	   break;
		            			        }
		            			   }
		            			 if (encontrou ==true) {
		            				 System.out.println("Veículo Já está cadastrado!");
		            			 }else {
		            				 System.err.println("VEÍCULO NÂO CADASTRADO");
		            			 }
		            	     
		 				  	 				  
		 				 break;      
					              
	                 }
		             case 3: {
		 				  System.out.println("Sistema Finzalizado"); 
					      verificacao=false;  
	                    }
		             
			
			  } 
		      
		      
		      
		
		}while (verificacao == true);
		entrada.close();
//Chaves Mães		
	 }
	}
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
