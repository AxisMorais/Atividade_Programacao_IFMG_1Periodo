package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_23 {

public static void main(String[] args) {
	
	 Scanner entrada = new Scanner (System.in);
     int Quant_Num_utilizados, aux, guarda_valor=0;
     
     System.out.println("Informe a quantidade de núemeros utilizadas:");
     Quant_Num_utilizados = entrada.nextInt();
     
     int vetor[] = new int[Quant_Num_utilizados];
      for (int i=0; i<Quant_Num_utilizados-1; i++){
          for(int j=i+1; j<Quant_Num_utilizados; j++){
              
        	  if(vetor[i]>vetor[j]){
                  aux = vetor[i];
                  vetor[i]=vetor[j];
                  vetor[j]=aux;
                  guarda_valor++;
              }
          }
      }
      System.out.println("Resultado:" + guarda_valor);
	
	
	
	
}	
	
}
