package Prova;

import java.util.Scanner;

public class Thiago_morais_02 {
  
	
		public static void main(String[] args) {

			  double Nadador_1, Nadador_2, Nadador_3;
		      
			  Scanner entrada_dado = new Scanner (System.in);
		      
			  System.out.println("Digite o tempo do nadador 1");
		      Nadador_1 = entrada_dado.nextDouble();
		      
		      System.out.println("Digite o tempo do nadador 2");
		      Nadador_2 = entrada_dado.nextDouble();
		      
		      System.out.println("Digite o tempo do nadador 3");
		      Nadador_3 = entrada_dado.nextDouble();
		      
		      if(Nadador_1<Nadador_2 && Nadador_2<Nadador_3){
		          System.out.print("O nadador 1 - medalha de ouro.\n O nadador 2 - medalha de prata.\n O nadador 3 - medalha de bronze.");
		         }
		         if(Nadador_1<Nadador_3 && Nadador_3<Nadador_2){
		          System.out.print("O nadador 1 - medalha de ouro.\n O nadador 3 - medalha de prata.\n O nadador 2 - medalha de bronze.");
		         }
		         if(Nadador_2<Nadador_3 && Nadador_3<Nadador_1){
		          System.out.print("O nadador 2 ganhou a medalha de ouro.\nO nadador 3 ganhou a medalha de prata.\nO nadador 1 ganhou a medalha de bronze.");
		         }
		         if(Nadador_2<Nadador_1 && Nadador_1<Nadador_3){
		          System.out.print("O nadador 2 ganhou a medalha de ouro.\nO nadador 1 ganhou a medalha de prata.\nO nadador 3 ganhou a medalha de bronze.");
		         }
		         if(Nadador_3<Nadador_2 && Nadador_2<Nadador_1){
		          System.out.print("O nadador 3 ganhou a medalha de ouro.\nO nadador 2 ganhou a medalha de prata.\nO nadador 1 ganhou a medalha de bronze.");
		         }
		         if(Nadador_3<Nadador_1 && Nadador_1<Nadador_2){
		          System.out.print("O nadador 3 ganhou a medalha de ouro.\nO nadador 1 ganhou a medalha de prata.\nO nadador 2 ganhou a medalha de bronze.");
		         }
		    }
		      
		      
		      
	}


	

