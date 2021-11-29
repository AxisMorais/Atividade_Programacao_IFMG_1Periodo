package Prova_II;

import java.util.Scanner;


public class Thiago_Morais_02 {
	
	public static void main(String[] args) {
		
	   Scanner entrada = new Scanner(System.in);
	
	   int N, guarda_valor, resto;
	    	   
	   int N_binario = 0, guarda_valor_1, bit, Num_Decimal, expoente = 0,  Resto = 0;  
	   
	   System.out.println("Informe Um número decimal para converção ");
       Num_Decimal = entrada.nextInt();
       
       guarda_valor = Num_Decimal;
       
       while (Num_Decimal != 0) {
		 bit =Num_Decimal % 2 ;
		 Num_Decimal = Num_Decimal /2;
		 N_binario+= bit*Math.pow(10, expoente);
		 expoente ++;
	   }
      
      System.out.println( guarda_valor  + " - em binário =  " + N_binario);
	
	
	
	}
	
	
}
