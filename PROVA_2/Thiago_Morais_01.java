package Prova_II;

import java.util.Scanner;

public class Thiago_Morais_01 {

    public static void main(String[] args) {
		
    	Scanner entrada = new Scanner(System.in);
    	
        int Entra_Pessoa = 0, Quat_Total_andar = 0, i = 0, soma = 0, andarAtual = 0, saindoElevador = 0, Mais_Pessoas = 0, andarp = 0, saida = 0;
        
        System.out.println("Informe a quantidade total de andares do prédio:");
        Quat_Total_andar = entrada.nextInt();
        
        
        while(i < Quat_Total_andar){
            
        	i++;
            Entra_Pessoa= Entra_Pessoa +1;
            andarAtual++;
            
            System.out.println("Informe o numero de pessoas entrou no "+andarAtual+ "º  andar");
            Entra_Pessoa = entrada.nextInt();
            soma += Entra_Pessoa;
            if(soma>15){
                saida = 0;
                saida = soma - 15;
                soma = soma - saida;

                System.out.println("Excesso de contingente, deve-se retirar " + saida + "º pessoas");
            }
            if(soma>Mais_Pessoas){
                Mais_Pessoas=soma;
                andarp=andarAtual;
            }
            System.out.print("Informe a qaunitdade de pessoas a se retirar no proximo andar?:");
            saindoElevador = entrada.nextInt();
            soma -= saindoElevador;
            System.out.println("Vão continuar subindo:"+soma+" pessoas");

        }
        System.out.println("No ultimo andar para descer terao "+soma+ "pessoas.");
        System.out.println("O andar q tinha mais pessoa e o:"+andarp+" com "+Mais_Pessoas+ " pessoas");

        
    
} 
	}
	
	

