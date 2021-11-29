package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_02 {

	public static void main(String[] args) {
		
		Scanner  entrada = new Scanner (System.in);
		
		double [ ][ ]matriz = new double[3][5];
		double [ ]resposta = new double[3];
						
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Informe o valor da " +(i+1) +"º Linha e o valor da " +(j+1)+"º Coluna");
	             matriz[i][j]= entrada.nextDouble();
	         }
			System.out.println("\n");
		 }	
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
					resposta[i]+=matriz[i][j];
				}
			}
			
			System.out.println("============== VETOR RESULTANTE ============");
			
			for (int i = 0; i < resposta.length; i++) {
				System.out.println(resposta[i]);
			}
			
		
		
		
		
	}
		
}
