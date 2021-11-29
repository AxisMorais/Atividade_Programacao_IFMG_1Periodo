package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_15 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		    int N = 5;
	        int vet[ ] = new int[N];
	        int soma = 0, produto = 1;
	     
	        for(int i = 0; i < N;i++){
	            System.out.println("Informe o valor da  "+( i +1)+ "º Posição do Vetor:  ");
	            vet[i] = entrada.nextInt();
	            
	            soma += vet[i];
	            produto *= vet[i];
	        }
	        
	        System.out.println("Somátorio : " + soma);
	        System.out.println("Produtório : " + produto);
	        
		
		
		
	}
	
}
