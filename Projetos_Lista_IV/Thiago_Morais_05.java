package Lista_Vetor;
import java.util.Iterator;
import java.util.Scanner;

//Média das alturas de atleas que podem ou não participar da competição

public class Thiago_Morais_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double inscrição[] = new double [20];
		double Media=0;
		
		for (int i = 0; i < inscrição.length; i++) {
			
			System.out.println("Informe a altura ");
			inscrição[i] = entrada.nextInt();
				
			Media+=  inscrição[i];
			Media/= inscrição.length;
						
			}
		for (int i = 0; i < inscrição.length; i++) {
			
			if (inscrição[i] >= Media) {
				System.out.println("Atleta com a altura: " + inscrição[i]+ " está autorizado a participar");
			}
		}
		System.out.println(" Os demais atletas com altura inferior a: " + Media+ ",   não podem participar");
		
			
		}
		
	}
	
	

