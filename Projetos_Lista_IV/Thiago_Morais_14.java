package Lista_Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Thiago_Morais_14 {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	 int Valor_Maximo = 10;
	 
     int vet1[] = new int[Valor_Maximo];
     int vet2[] = new int[Valor_Maximo];
     int vet3[] = new int[Valor_Maximo];
     
     for(int i = 0; i < Valor_Maximo; i++){
         System.out.println("Informe o valor para a   "+( i+1) + "º do vetor : ");
         vet1[i] = entrada.nextInt();
     }
     for(int i = 0; i < Valor_Maximo; i++){
         System.out.println("Informe o valor para a   \"+ i + \"º do vetor  ");
         vet2[i] = entrada.nextInt();
     }
     for(int i = 0; i < Valor_Maximo; i++){
         vet3[i] = vet1[i]+vet2[i];
     }
     System.out.println("Vetor resultado : "+ Arrays.toString(vet3));
   
	
	
	
	
	
	
}
}
