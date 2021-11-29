package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_14 {

	public static void main(String[] args) {
		
		  int[][] Matriz_Lugares = new int[12][4];
	        Scanner entrada = new Scanner(System.in);
	        String resposta;

	        for (int i = 0; i < Matriz_Lugares.length; i++) {
	            for (int j = 0; j < Matriz_Lugares[i].length; j++) {
	                Matriz_Lugares[i][j] = 0;
	            }
	        }


	        boolean Encerra_sistema = true;
	        while (Encerra_sistema = true) {
	            int cont = 0;
	            int controle = 1;

	            System.out.println( "  COMPANHIA DE  VIAGEM " );
	            System.out.println("Escolha uma opção");
	            System.out.println("  a - Vender passagem ");
	            System.out.println(" b - Mostrar mapa de ocupação do ônibus ");  
	            System.out.println(" c - Encerrar\\n ");
	                    
	                  
	            resposta = entrada.next();

	           
	                boolean LugarLivre;
					if(!LugarLivre){
	                    System.out.println("Poltronas Completas! Acento Indisponível !");
	                }
	                controle=0;
	                int Acento = 0;
	                if (LugarLivre) {
	                    System.out.println(" Acento com emincia de ocupuação ");
	                    System.out.println(" Informe o número da poltrona ");
	                    Acento = entrada.nextInt();

	                    if (resposta.equalsIgnoreCase("a")) {
	    	                boolean LugarLivre1 = false;
	    	                for (int i = 0; i < Matriz_Lugares.length; i++) {
	    	                    for (int j = 0; j < Matriz_Lugares[i].length; j++) {
	    	                        if (Matriz_Lugares[i][j] == 0) {
	    	                            LugarLivre1 = true;
	    	                        }
	    	                    }
	    	                }  
	                    
	                    
	                    
	                    for (int i = 0; i < Matriz_Lugares.length; i++) {
	                        for (int j = 0; j < Matriz_Lugares[i].length; j++) {

	                            if (controle == (Acento-1) ) {

	                                if(Matriz_Lugares[i][j]==0){
	                                    Matriz_Lugares[i][j] = 1;
	                                    System.out.println("Venda concluida com sucesso");
	                                    controle++;
	                                    break;
	                                }else{
	                                    controle++;
	                                    System.out.println("Poltrona Ocupada");
	                                    System.out.println();
	                                }


	                            }
	                            controle++;
	                        }
	                    }


	                } else {
	                    System.out.println("Poltronas estão ocupadas ");
	                }
	            }else if(resposta.equalsIgnoreCase("b")){
	                System.out.println("Janela - Corredor  || Corredor - janela");
	                for (int i = 0; i < Matriz_Lugares.length; i++) {

	                    for (int j = 0; j < Matriz_Lugares[i].length; j++) {
	                        if (cont < 1) {
	                            System.out.print("|  " + (controle) + "  ");
	                            System.out.print("   ");
	                        }
	                        System.out.print(Matriz_Lugares[i][j]+"  |  ");
	                        cont++;
	                        controle++;
	                        if (cont > 1) {
	                            System.out.print(" " + (controle - 1) + " |");
	                            System.out.print("  ");
	                            cont = 0;
	                        } else {
	                           
	                        }
	                    }
	                    System.out.println();
	                }
	                System.out.println();
	            }else if (resposta.equalsIgnoreCase("c")){
	                Encerra_sistema  = false;
	                break;
	            }
	        }
	        System.out.println("Concluido com sucesso!");
  }	
}
