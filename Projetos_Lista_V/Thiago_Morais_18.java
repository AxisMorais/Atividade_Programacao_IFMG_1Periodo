package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_18 {
		public static void main(String[] args) {
		
			 Scanner entrada = new Scanner(System.in);
		        int[ ][ ] figura = new int[5][5];
		        int rodadas=0;
		        int Contador_Partida = 0;
		        int Setor_Irresoluto = 0; // Irresoluto = Pendente - Inacabado 
		        for(int i = 0; i < figura.length; i++)
		        {
		            for(int j = 0; j < figura[i].length; j++)
		            {
		                if(Setor_Irresoluto > 0)
		                {
		                    for(int g = 0; g < Setor_Irresoluto; g++)
		                    {
		                        figura[i][j] = 1;
		                        j++;
		                    }
		                    Setor_Irresoluto = 0;
		                    if(i < figura.length - 1)
		                        i++;
		                }
		                else if(j == Contador_Partida)
		                {
		                    for(int c = 0; c < 3; c++)
		                    {
		                        if(j >= figura[i].length)
		                        {
		                            Setor_Irresoluto = 3 - c;
		                            i--;
		                            break;
		                        }
		                        figura[i][j] = 1;
		                        j++;

		                    }
		                    Contador_Partida += 1;
		                }
		            }
		        }
		        boolean rodadaValida = true;
		        while (rodadaValida) {
		            System.out.println("Digite o numero de rodadas ");
		            rodadas = entrada.nextInt();
		            if(rodadas % 2 ==0){
		                System.out.println("Valor invalido digite um numero impar ");
		            }else{
		                rodadaValida=false;
		            }
		        }
		        int d,x=0;
		        int dario =0 , xerxes =0;

		        while (rodadas>0){
		            System.out.println("Digite a mão de Dario ");
		            d = entrada.nextInt();

		            System.out.println("Digite a mão de Xerxes");
		            x = entrada.nextInt();
		            if(figura[d][x] == 1){
		                dario++;
		            }else if (figura[x][d] == 1){
		                xerxes++;
		            }
		        rodadas--;
		        }
		        if(dario>xerxes){
		            System.out.println("dario");
		        }else{
		            System.out.println("xerxes");
		        }
		
		
		
  }
}
