package Lista;

import java.util.Scanner;

// Cálculo do custo de um carro ao consumidor

public class Thiago_Morais_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double custo_Fabrica, Novo_valor = 0;
		
		System.out.println("Informe o valor do Custo da Fabricação ");
		custo_Fabrica = entrada.nextDouble();
		
		//Novo_valor= custo_Fabrica + (custo_Fabrica * 0.10);
		
		if (custo_Fabrica <= 28000) {
			Novo_valor = custo_Fabrica + (custo_Fabrica * 0.5);

		} else if (custo_Fabrica >= 28001 && custo_Fabrica <= 45000) {
			Novo_valor = (custo_Fabrica + (custo_Fabrica * 0.10)) + (custo_Fabrica * 0.15);

		} else if (custo_Fabrica >= 45000) {
			Novo_valor = (custo_Fabrica + (custo_Fabrica * 0.15));
			Novo_valor = (Novo_valor + (Novo_valor * 0.20));

		}
		System.out.println("O valor do custo será:" + Novo_valor);
}
}
