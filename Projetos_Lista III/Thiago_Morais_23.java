package LISTA_4;

import java.util.Scanner;

public class Thiago_Morais_23 {

	// Calculo do encontro do Trem A e Trem B
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int Trem_A =0 , Trem_B=400000, tempo=0, dis_1, dis2;

		
		while( Trem_A < Trem_B) {
			Trem_A +=30;
			Trem_B +=40;
			tempo++;
		}
		System.out.println("Tempo em segundos " +tempo);
		System.out.println("Distancia em Metros  do Trem A: " + Trem_A );
		System.out.println("Distancia em Metros  do Trem B: " + (400000-Trem_B));
		
		
}
}

