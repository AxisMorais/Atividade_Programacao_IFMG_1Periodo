package Lista_06;

import java.util.Random;
import java.util.Scanner;

public class Thiago_Morais_10 {
	
	public static void main(String[] args) {
		
		
		 Scanner entrada = new Scanner(System.in);
	        Random random = new Random();
	        int Num_cidades, i;
	        double custo = 0;
	   //----------------------------------------------------------------------------------------------     
	        System.out.println("Insira quantas cidades possuem na rota:");
	        Num_cidades = entrada.nextInt();
	        
	        double[ ][ ] custos = new double[Num_cidades][Num_cidades];
	        int[] rota = new int[Num_cidades];
	        for (i = 0; i < Num_cidades; i++) {
	            for (int j = 0; j < Num_cidades; j++) {
	                if (i == j) {
	                    custos[i][j] = 0;
	                } else {
	                    custos[i][j] = random.nextInt(101);
	                }
	            }
	        }
	        System.out.println("Matriz de Custos");
	        i = 0;
	        while (i < Num_cidades){
	            for (int j = 0; j < Num_cidades; j++) {
	                System.out.println(custos[i][j] + "");
	            }
	            System.out.println();
	            i++;
	        }
	        for (i = 0; i < Num_cidades; i++) {
	            do {
	                System.out.println("Insira a " + (i + 1) + " cidade visitada na rota:");
	                rota[i] = entrada.nextInt();
	            } while (rota[i] < 0 || rota[i] >= Num_cidades);
	        }
	        System.out.println("Rota do caminhao:");
	        i = 0;
	        while (i < Num_cidades){
	            System.out.println(rota[i] + "");
	            rota[i] = entrada.nextInt();
	            i++;
	        }

	        System.out.println();
	        while (i < Num_cidades-1){
	            custo += custos[rota[i]][rota[i + 1]];
	            i++;
	        }

	        System.out.println("Custo da Rota do caminhao:" + custo);
		
	}	
}
