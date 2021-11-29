package Lista;

import java.util.Scanner;

//Calculo da Taxa de Transferência de um carro 

public class Thiago_Morais_09 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int Ano_Carro; 
		double Taxa_Transferencia, Valor_Carro;
		
		System.out.println("Informe o valor da Taxa de Transferência:");
		Taxa_Transferencia = entrada.nextDouble();
		
		System.out.println("Informe o ano do carro:");
		Ano_Carro = entrada.nextInt();
		
		System.out.println("Informe o valor do carro:");
		Valor_Carro = entrada.nextInt();
		

		if (Ano_Carro < 1990) {
			Taxa_Transferencia = Taxa_Transferencia + (Taxa_Transferencia * 0.01);
			Valor_Carro = Valor_Carro + Taxa_Transferencia;
		}
		else if (Ano_Carro >=1990) {
			Taxa_Transferencia=Taxa_Transferencia + (Taxa_Transferencia * 0.015);
			Valor_Carro = Valor_Carro + Taxa_Transferencia;
		}
	
	     System.out.println("O valor do Carro incluindo o imposto da taxa de transferencia será de: " + Valor_Carro );
		
	}

}
