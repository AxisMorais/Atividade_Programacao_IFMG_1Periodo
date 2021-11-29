package LISTA_4;

import java.util.Scanner;

// Calculo da soma e média de N numeros 

public class Thiago_Morais_19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	 
		double i=0 , media,  numero, soma=0; 
	 
	   while (true) { //
		   System.out.println("Informe o numero");
		   numero= entrada.nextDouble();
		   
		   if (numero != -1 &&   numero >0 ) {
			   soma += numero;
			   i++;
		   }else if(numero == -1) {
			   System.out.println("Opeação Finalizada");
			   break;
		   }
		   media = soma /i;
		   
		   System.out.println("A média é:" + media);
		   
		   
	   }
	
}
}
