package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_18 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 
		int Quanti_amostras, Somatorio=0;
		double media, DesvioPadrao, resultado, resu = 0;
		
		System.out.println("Informe a quantidade de amostras cadastradas");
		Quanti_amostras= entrada.nextInt();
		
		int [ ]amostras = new int [Quanti_amostras];
		double [ ]resultados=new double [Quanti_amostras]; 
		
		for (int i = 0; i < amostras.length; i++) {
			System.out.println("Informe as amostras: ");
			amostras[i]=Integer.parseInt (entrada.nextLine());
							
			Somatorio= Somatorio+ amostras[i];
		}
		media = Somatorio/Quanti_amostras;
		// Cada amostra menos a média  elevando a quadrado;
						
		for (int i = 0; i < amostras.length; i++) {
			 resultados[i] =amostras[i]- media;
			  resu+= resultados[i];
		}
		 	resu= resu*resu;
		 	
		 System.out.println("O desvio padrão total é de: "+ resu );	
}
}
