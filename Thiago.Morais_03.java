package Avaliacao;

import java.util.Scanner;

public class Thiago_Morais_03 {

	public static void main(String[] args) {
		
       		
		Scanner entrada = new Scanner(System.in);
       
		int Valor_Max = 10;
        int Vemelhro[][] = new int [Valor_Max][Valor_Max];
        int Verde[][] = new int [Valor_Max][Valor_Max];
        int Preto[][] = new int [Valor_Max][Valor_Max];
        int cinza[][] = new int [Valor_Max][Valor_Max]; 
        int Negativo[][] = new int [Valor_Max][Valor_Max];
        
        for(int i = 0; i < Valor_Max; i++){
            for(int j=0; j < Valor_Max ; j++){
            System.out.println(" Informe o valor do nível de vermelho: (" + (i+1) + "," +(1+j)+") na faixa de  de 0 a 255:");
            Vemelhro[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0; i < Valor_Max; i++){
            for(int j=0; j < Valor_Max ; j++){
            System.out.println("Nível de verde do pixel (" + (i) + "," +(j)+") de 0 a 255:");
            Verde[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0; i < Valor_Max; i++){
            for(int j=0; j < Valor_Max ; j++){
        
            System.out.println("Nível de azul do pixel (" + (i) + "," +(j)+") de 0 a 255:");
            Preto[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0; i < Valor_Max; i++){
            for(int j=0; j < Valor_Max ; j++){
                cinza[i][j] = (Vemelhro[i][j] + Verde[i][j] + Preto[i][j])/3;
                Negativo[i][j] = 255 - cinza[i][j];
                
            }
        }
        System.out.println("Escala cinza da imagem:");
        for(int i = 0; i < Valor_Max; i++){
            for(int j=0; j < Valor_Max ; j++){
                System.out.print(cinza[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Imagem em escala cinza:");
        for(int i = 0; i < Valor_Max; i++){
            for(int j=0; j < Valor_Max ; j++){
                System.out.print(Negativo[i][j]+" ");
            }
            System.out.println("");
        }
		
		entrada.close();
		
	}

}