package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_24 {
public static void main(String[] args) {
	
	 Scanner entrada = new Scanner (System.in);
    
	 double aux;
     int Num_Flechas, penalidade=0, somatorio=0;
     
     System.out.println("Informe a quantidade de flechas:");
     Num_Flechas = entrada.nextInt();
     
     double hip[] = new double[Num_Flechas];
     int x[] = new int[Num_Flechas], y[] = new int[Num_Flechas];
     
     
     for(int i=0;i<Num_Flechas;i++){
         System.out.println("Escreva as posições respectivas de (x,y) da "+(i+1)+"ª flecha:");
         x[i] = entrada.nextInt();
         y[i] = entrada.nextInt();
         aux = Math.pow(x[i], 2) + Math.pow(y[i], 2);
         hip[i] = Math.pow(aux,2);
        
     }
     for(int i=1;i<Num_Flechas;i++){
         if (hip[i]>=hip[i-1]){
             somatorio++;
             penalidade+=somatorio;
         }
     }
     System.out.println("Pontuação de penalidades: "+penalidade);
	
	
	
}
}
