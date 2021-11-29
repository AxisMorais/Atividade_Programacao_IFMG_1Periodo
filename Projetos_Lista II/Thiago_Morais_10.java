package Lista;

//Calcular a dosagem em gotas de determinado medicamento

import java.util.Scanner;

public class Thiago_Morais_10 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	
	int Peso;
	double dosagem = 0 ;
	   
	System.out.println("Informe o valor do valor do peso ");   
	Peso= entrada.nextInt();
	
	if (Peso >= 5 && Peso < 9) {

		dosagem = ((125 * 20) / 500);

	} else if (Peso >= 9.1 && Peso < 16) {

		dosagem = ((250 * 20) / 500);

	} else if (Peso >= 16.1 && Peso <= 24) {

		dosagem = ((375 * 20) / 500);

	} else if (Peso >= 24.1 && Peso <= 30) {

		dosagem = ((500 * 20) / 500);
		
	} else if (Peso > 30 && Peso <= 59) {

		dosagem = ((750 * 20) / 500);
		
	} else if (Peso >= 60) {

		dosagem = ((1000 * 20) / 500);
	}

	System.out.println("A quantidade de gotas da dosagem é de: " + dosagem);

	}
}
