package LISTA_4;

import java.util.Scanner;

public class Thiago_Morais_20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int Num, SomaPares=0, SomaImpares=0, MediaPares=0, MediaImpares=0, ContPar=0, ContImpar=0;
		
		while (true) {
						
		  System.out.println("Informe o número: ");
		  Num=entrada.nextInt();
		
		    if (Num != -1 && Num > 0 &&  Num % 2==0) {
			    SomaPares+=Num;
			    ContPar++;
			    
		    }else if ( Num % 2 == 1) {
				SomaImpares+=Num;
				ContImpar++;
			}else {
				System.out.println("Opeação Finalizada");
				 break;
			}
		
		    MediaPares+=MediaImpares/ContPar;
		    MediaImpares+=MediaImpares/ContImpar;
		    System.out.println("Média dos pares:"   + MediaPares);
		    System.out.println("Média dos Impares:" + MediaImpares);
		
		}
		
 }
}
	