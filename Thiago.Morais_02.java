package Avaliacao;

import java.util.Scanner;

public class Thaigo_Morais_02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
        int Numeros_Sorteados[] = new int[15],
        Numeros_Apostados[] = new int[15];
        

        System.out.println("Informe os números apostados: ");
        for (int i = 0; i < Numeros_Apostados.length; i++) {
            Numeros_Apostados[i] = entrada.nextInt();
        }

        System.out.println("Informe os números sorteados: ");
        for (int i = 0; i < Numeros_Sorteados.length; i++) {
            Numeros_Sorteados[i] = entrada.nextInt();
        }

        for (int i = 0; i < Numeros_Sorteados.length; i++) {
            for (int j = 0; j < Numeros_Sorteados.length; j++) {
                if (Numeros_Apostados[i] == Numeros_Sorteados[j]){
                    contador ++;
                }
            }
        }

        System.out.println("Total de acertos: "+contador);
        if (contador==0){
            System.out.println("Você ganhou o prêmio: Nada!");
        }
        else if(contador != 0 && contador<=12){
            System.out.println("Não ganhou prêmio.");
        }
        else if(contador==13){
            System.out.println("Azarento!");
        }
        else if(contador == 14){
            System.out.println("Quase Nada!");
        }
        else if(contador==15){
            System.out.println("Quase Tudo!");
        }

        entrada.close();
        
	       }
	    }
	

	


© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
