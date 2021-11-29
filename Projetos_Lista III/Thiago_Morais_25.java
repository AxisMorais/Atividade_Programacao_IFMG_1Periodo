package LISTA_4;

import java.util.Scanner;

public class Thiago_Morais_25 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int Num= 3;
		double Calculo=1, Pi ; 
		
		for (double i = 1; i <= 51; i++) {
			
			if ( i % 2 ==0) {
				Calculo +=  1/ (Math.pow(Num, 3));
				Num+=2; 
			}else {
				 
				Calculo -= 1/ (Math.pow(Num, 3));
				Num=Num +2;			
				
			}
		}
		Pi= (Math.cbrt(Calculo * 32 ));
		System.out.println("Valor aproximado de Pi: " + Pi);
 }
}                                               
