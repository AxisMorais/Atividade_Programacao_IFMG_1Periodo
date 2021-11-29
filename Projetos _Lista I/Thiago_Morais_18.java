package Thiago;

import java.util.Scanner;

//Calculo dos QuiloWatts

   public class Thiago_Morais_18 {
	
	public static void main (String[]Args)
		{	   
	   
	  Scanner entrada =new Scanner (System.in);
	  double SM,  VD, VP, NV, QUANT_KW_C;
	
	  System.out.println("Informe o valor do salário Mínimo ");
	  SM=entrada.nextDouble();
	
	  System.out.println("Informe o valor dos Kilo_Watts Consumido");
	  QUANT_KW_C =entrada.nextFloat();
	
	  VD= ((SM*1/7)/100);
	  VP= (VD*QUANT_KW_C);
	
	  NV=(VP-(VP*0.10));		
			
	  System.out.printf(" O valor da Média é %.2f", NV);
	

  }
 }
