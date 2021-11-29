package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_21 {

	public static void main(String[] args) {
	
		  Scanner entrada = new Scanner (System.in);
	        int quantidade;
	        
	        int confirm = 0;
	        
	        System.out.println("Informe o comprimento do vetor::");
	        quantidade = entrada.nextInt();
	        
	        int vetor[] = new int[quantidade];
	        
	        for(int i=0;i<vetor.length;i++){
	            System.out.println("Informe o "+(i+1)+"º valor:");
	            vetor[i] = entrada.nextInt();
	        }
	        for(int i=1;i<vetor.length;i++){
	            if(vetor[i]<vetor[i-1] && vetor[i]<vetor[i+1]){
	                confirm++;
	                
	            }
	        }
	        if(confirm!=0){
	            System.out.println("S");
	        }else{
	            System.out.println("N");
	        }
			
	}
	
}
