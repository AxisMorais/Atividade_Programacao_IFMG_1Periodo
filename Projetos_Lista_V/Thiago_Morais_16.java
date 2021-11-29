package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opção = 0, N_Max_planta = 50, contador = 0, Retira_planta;
		char resposta = 'S';
		String[] NomePlantas = new String[4]; // Mudar para N_Max_planta no final
		int[] CodigoPlantas = new int[4]; // Mudar para N_Max_planta no final
		int [] Quantidade_Plantas = new int[4];
		
	do {	

		System.out.println("==========================================\r\n" 
		                                      + "FLORICULTURA MARIASFLOR\r\n"
				                    + "==========================================");

		System.out.println("==========================================\r\n"
		                                   + "1. CADASTRAR NOVA PLANTA\r\n"
				                           + "2. RETIRAR PLANTA\r\n" 
		                                   + "3. INSERIR PLANTA\r\n" 
				                           + "4. IMPRIMIR RELATÓRIO\r\n" 
		                                   + "5. SAIR\r\n"
				+ "===========================================");
		opção = entrada.nextInt();

		switch (opção) {

		case 1: {
// Adicionar a leitura da quantidade de plantas
			while (resposta == 'S') {

				int N_cad;
				System.out.println("Informe quantas plantas deseja cadastrar");
				N_cad = entrada.nextInt();

				   for (int i = 0; i < N_cad; i++) {
										
					   System.out.println("Informe o codigo:");
					   CodigoPlantas[i] = entrada.nextInt();
					   entrada.nextLine();
					   System.out.println("Informe o nome da planta:");
					   NomePlantas[i] = entrada.nextLine();
					   contador++; // contando quantas cadastradas em estoque
					   entrada.nextLine();
				}
				System.out.println("Deseja Cadastrar nova planta? Precione: S para cadastra N para sair: ");
				resposta = entrada.next().charAt(0);
				resposta = Character.toUpperCase(resposta);
            			
			}
			System.out.println("Plantas cadastradas: ");
			  for (int i = 0; i < CodigoPlantas.length; i++) {
				  System.out.println(CodigoPlantas[i] + " - " + NomePlantas[i]);
			   	}
		     System.out.println("\n");
		
		break;
		}	
//------------------------------------------------------------------------------------------------------------
		// Observar somente o estoque e retirar
		case 2: {
			System.out.println(" \n Retirar Planta: ");
			System.out.println("Informe o codigo da planta que deseja retirar");
			Retira_planta = entrada.nextInt();
            
			for (int i = 0; i < NomePlantas.length; i++) {
				if (CodigoPlantas[i] == Retira_planta) {
					CodigoPlantas[i]=0; NomePlantas[i]="-";
					System.out.println(CodigoPlantas[i] + "--" + NomePlantas[i]);
					break;
				}
			}
			System.out.println(" \n Planta retirada com sucesso");
			System.out.println("Cadastro Atual");   
			for (int i = 0; i < CodigoPlantas.length; i++) {
				System.out.println(CodigoPlantas[i] + "--" + NomePlantas[i]);
			}

		   break;	
		}	
//------------------------------------------------------------------------------------------------------------------------
		// Observar somente o estoque e inserir	
		case 3: {
		  	    System.out.println(" \n Inserir Planta: \n");
		  	    		  	    
		        String nova_planta; int NovoCod;
		        System.out.println("Informe o novo código:");
			    NovoCod=entrada.nextInt();
			    entrada.nextLine();
			    System.out.println("Informe o nome da planta:");
			    nova_planta=entrada.nextLine(); 
			    
			    for (int i = 0; i < CodigoPlantas.length; i++) {
					    if(CodigoPlantas[i] == 0) {
						    CodigoPlantas[i]=NovoCod;
						    NomePlantas[i]=nova_planta;
					        break; 
					      }
					
				    }    
			    System.out.println("Cadastro Atualizado:");
			    for (int i = 0; i < CodigoPlantas.length; i++) {
					System.out.println(CodigoPlantas[i] +"-"+ NomePlantas[i]);
				}
		
			break;
		}
//---------------------------------------------------------------------------------------------------------------
		case 4: { 
			System.out.println("Imprimir  Relatório:");
		 	for (int i=0;  i<CodigoPlantas.length; i++ ) {
                  System.out.println( CodigoPlantas[i]+ " - " + NomePlantas[i]);
		 	  }
			  break;
		   }
		}
//------------------------------------------------------------------------------------------------- 	 
	}while(opção != 5);
		System.out.println("Sistema Finalizado");
	
	// Chaves mães
	}
}
