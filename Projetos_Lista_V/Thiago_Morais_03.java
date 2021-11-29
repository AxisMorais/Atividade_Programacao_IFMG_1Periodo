package Lista_06;
import java.util.Iterator;
import java.util.Scanner;

public class Thiago_Morais_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int linhas, colunas;      //    L  C
		int [ ][ ]Matriz_A= new int[3][4];
				
		System.out.println("Informe a quantidade de linhas: ");
		linhas= entrada.nextInt();
		
		System.out.println("Informe a quantidade de colunas: ");
		colunas= entrada.nextInt();
		                                        
		int [ ][ ]Matriz_B= new int[linhas] [colunas];
	    int[ ][ ]Resultado=new int[3][colunas];
		
		if (Matriz_A[0].length ==Matriz_B.length) {// Analisa se o numero de colunas 3 será igual ao numero de linhas digitado
		   
		        System.out.println("É possível calcular  \n");
		             
		              for (int i = 0;  i<  Matriz_A.length  ; i++) {
		    	            for (int k = 0; k < Matriz_A[0].length ; k ++) {
		   			              System.out.println("Informe o valor da " + (i+1)+ "º Linha e da " + (1+k)+ "º Coluna:" );
		   		                  Matriz_A[ i] [ k ] = entrada.nextInt();
	   	                       }
		    	      	      System.out.println("\n");
		                }
		             System.out.println("==========================================");
	   		        
		            for (int i = 0;  i<  linhas  ; i++) {
		    	           for (int k = 0; k < colunas ; k ++) {
		   			              System.out.println("Informe o valor da " + (i+1)+ "º Linha e da " + (1+k)+ "º Coluna:" );
		   			              Matriz_B[ i] [ k ] = entrada.nextInt();
	   				         }
		    	      } 
		       System.out.println("==========================================");
		       System.out.println("Resultado");
	           
		       
		         for (int i = 0; i < Resultado.length; i++) { // o primeiro for lê as linhas da Matriz resultado
					 for (int j = 0; j < Resultado[0].length; j++) { // Segundo for percorre as colunas da matris resultado
					    for (int k = 0; k < Matriz_B.length ; k++) {//Terceiro for percorre as posições das linhas e colunas das matrizes A e B
							// A variável  k precisa ir até o numero total de linhas da matriz B
						     Resultado[ i ] [ j ] = Resultado[ i ] [ j ] + Matriz_A[ i ][ k ] *Matriz_B[ k ][j];
					    }	
					}
				 }
		        
		        for (int i = 0; i < Resultado.length; i++) {
					for (int j = 0; j < Resultado[0].length; j++) {
						System.out.print (Resultado[i][j] +" - " );
					}
				   System.out.println(" ");
		        }
		         
		                  
		       
		       /*
		       Resultado[0][0]= (Matriz_A[0][0]* Matriz_B[0][0]) + (Matriz_A[0][1]*(Matriz_B[1][0])+ Matriz_A[0][2]* Matriz_B[2][0]);
		       Resultado[0][1]= (Matriz_A[0][0]* Matriz_B[0][1]) + (Matriz_A[0][1]*(Matriz_B[1][1])+ Matriz_A[0][2]* Matriz_B[2][1]);
		       */
	        		     
	     }else {
		 System.err.println("Não é possível calcular!");
		 System.err.println("Número de colunas da primeira matriz deve ser igual ao número de linhas da segunda ");
		  
	   }
		
	
		
		
		}
	}
