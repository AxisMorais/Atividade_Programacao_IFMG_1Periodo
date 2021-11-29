package LISTA_4;

import java.util.Scanner;

// Estatisticas dos acidentes

public class Thiago_Morais_12 {

	
	 public static void main(String[] args) {
		
		 Scanner entrada = new Scanner (System.in);
		 
		String Nome_Cidade, Nome_City_Maior = null, Nome_City_Menor = null;
		int Num_Veiculos=0,Maior_ID_acidentes = 0, Menor_ID_acidentes = 9999, NumAcidentes=0, Quant_Acidentes, Quant_Veiculos;
		char resposta = 'C';
		double razao = 0; 
		
		while (resposta =='C') {
			
			
	   	
			System.out.println("Informe o nome  da Cidade ");
	          Nome_Cidade = entrada.nextLine();
	          
	         		 			 
		      System.out.println("Informe o número de veículos envolvidos em acidentes ");
		      Num_Veiculos= entrada.nextInt();
		      
	     
		      System.out.println("Informe o número de acidentes ");
		      NumAcidentes= entrada.nextInt();
	     
		        
	    
	         if (NumAcidentes == 1) {
					Maior_ID_acidentes = NumAcidentes;
					Menor_ID_acidentes = NumAcidentes;
					Nome_City_Maior =Nome_Cidade; 
					Nome_City_Menor =Nome_Cidade;
		     } else {
		         if (NumAcidentes > Maior_ID_acidentes) {
				     Maior_ID_acidentes = NumAcidentes;
				     Nome_City_Maior=Nome_Cidade;
		          }
		         if (NumAcidentes < Menor_ID_acidentes) {
			         Menor_ID_acidentes = NumAcidentes;
			         Nome_City_Menor = Nome_Cidade;
		          }
	           }

	
	         Quant_Acidentes = NumAcidentes + NumAcidentes;
	         Quant_Veiculos= Num_Veiculos + Num_Veiculos;
	         
	         razao =(double)Quant_Acidentes/Quant_Veiculos;
	         
	       
	        System.out.println("Deseja sair? (E) para sair ou (C) para cadastrar");
	        resposta=entrada.next().charAt(0);
	        resposta=Character.toUpperCase(resposta);
	        
	        entrada.nextLine();
	        
	       
		}
		
	
		
		 System.out.println("O maior indicie de acidentes: " + Maior_ID_acidentes + " ocorridos em " +Nome_City_Maior);
         System.out.println("O menor indice de acidentes: " + Menor_ID_acidentes + "  ocorridos em " +Nome_City_Menor);
	     System.out.println("Razão entre a quantidade de acidentes por quantidade de veículos: " + razao); 
	 }
	}
