package Lista_Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Thiago_Morais_12 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
	        int[] vetor = new int[10];
	        int[] vetorCres = new int[10];
	        int[] vetorDec = new int[10];

	        System.out.println("Informe os valores: ");
	        for (int i = 0; i < vetor.length; i++){
	            vetor[i] = entrada.nextInt();
	            vetorCres[i] = vetor[i];
	        }
	        int j = 9;
	        Arrays.sort(vetorCres);
	        for (int i = 0; i < vetor.length; i++){
	            vetorDec[j] = vetorCres[i];
	            j--;
	        }
	        System.out.println("Vetor crescente: ");
	        for (int i = 0; i < vetor.length; i++){
	            System.out.println(vetorCres[i]);
	        }
	        System.out.println("Vetor decrescente: ");
	        for (int i = 0; i < vetor.length; i++){
	            System.out.println(vetorDec[i]);
	        }
	           		
		
		
	}
	
}
