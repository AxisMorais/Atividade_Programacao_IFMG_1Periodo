package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_22 {
	public static void main(String[] args) {

		 Scanner entrada  = new Scanner (System.in);
		 
	        int dias, Comprimento_Fita, maior, diferenca;
	        System.out.println("Informe o comprimento da Fita:");
	        Comprimento_Fita = entrada .nextInt();
	         int vetor[] = new int[Comprimento_Fita];
	        
	        System.out.println("Quantas gotas serão aplicadas?");
	        int quantidade;
	        quantidade = entrada .nextInt();
	        int posicao[] = new int[quantidade];
	        
	        for (int i=0;i<posicao.length;i++){
	            System.out.println("Posição da "+(i+1)+"ª gota:");
	            posicao[i] = entrada .nextInt();
	        }
	        maior = (posicao[0]-1);
	        
	        for(int i=1; i<posicao.length; i++){
	            diferenca = (posicao[i] - posicao[i-1])/2;
	            if (diferenca>maior){
	                maior=diferenca;
	            }
	        }
	        dias = maior;
	        
	        System.out.println("Serão necessários "+dias+" dias");	
		
		}
	
}
