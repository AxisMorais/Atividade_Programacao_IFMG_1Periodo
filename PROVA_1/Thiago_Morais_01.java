package Prova;

import java.util.Scanner;

public class Thiago_Morais_01 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
       		
		int Jogador_R,Jogador_L,JOgador_D;
        System.out.println("O limite é de posição de 0 a 100! ");
        System.out.println("Informe a posição do atacante R: ");
        Jogador_R = entrada.nextInt();
        
        
        System.out.println("Informe a posição do atacante L: ");
        Jogador_L = entrada.nextInt();
        System.out.println("Informe a posição do defensor D: ");
        JOgador_D = entrada.nextInt();
       
        if (Jogador_R < JOgador_D){
            System.out.println("Não Ha impediemnto  ");
        }
        else if (Jogador_R < 50){
            System.out.println("Não Ha impediemnto ");
        }
        else if (Jogador_R > JOgador_D && Jogador_L < Jogador_R)
            System.out.println("Há impedimento ");
    }
		
		
		
	}

