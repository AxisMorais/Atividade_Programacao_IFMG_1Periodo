package Thiago;

import java.util.Scanner;

public class Thiago_Morais_21 {
	 
	public static void main (String[]Args)	{
	
	Scanner entrada =new Scanner (System.in);
	double Sen_Angulo, angulo, Altura_parede, Tamanho_escada , RAD ;
	
	System.out.println("Ao apoiar a escada no chão, informe o valor do angulo entre a escada e o chão:");
	angulo=entrada.nextDouble();
	
	System.out.println("Informe a altura da parede:");
	Altura_parede=entrada.nextDouble();
	
	RAD=Math.toRadians(angulo);
	
	Sen_Angulo= Math.sin(RAD);  // Armazena na variável angulo o valor do SENO DO ANGULO
	Tamanho_escada = (Altura_parede/ Sen_Angulo);	
	
	System.out.printf("O tamanho da escada é de %.2f: ",  Tamanho_escada,  " Metros");
	
	}

}
