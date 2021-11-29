package Prova_II;

import java.util.Scanner;

public class Thiago_Morais_03 {

	public static void main(String[] args) {
		
              Scanner entrada = new Scanner(System.in);

              int N;
	      double divisores=0, armazenador =0;
	      
	     
	      
	      System.out.println("Informe o  um número.");
	      N = entrada.nextInt();
	      
	      if(N<0){
	         System.out.println("Número inválido.");
	      }
	       else{
	            for(int i=1; i<=N; i++) {
	               
	            	if (N % i ==0){
	                  
	                  armazenador  = armazenador +i;
	                }
	                
	            }
	            if(armazenador % 2==0){
	                  System.out.println("Número irmão par");
	               } 
	               else{
	                  System.out.println("Número irmão ímpar");
	               } 
	         }
	
	
	}
}
