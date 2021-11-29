package LISTA_4;

import java.util.Scanner;

public class Thiago_Morais_28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int Num;
		
		System.out.println("Informe o número para o calculo da tabuada:");
		Num =entrada.nextInt();
		
		for (int i = 1; i <=10 ; i++) {
			
			
			System.out.println(  Num + " x " + i + " = " + (Num *i)   );
		}
		
	
}
}	
