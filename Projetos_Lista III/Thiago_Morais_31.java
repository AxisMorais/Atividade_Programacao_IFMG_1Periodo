package LISTA_4;

import java.util.Scanner;
// Analise de votos de determinada eleição

public class Thiago_Morais_31 {

	
public static void main(String[] args) {
		
		

		 Scanner entrada = new Scanner(System.in);
	        int voto, opção_1 = 0, opção_2 = 0, opção_3 = 0, opção_4 = 0, opção_5 = 0, opção_6 = 0;

	        do {
	            System.out.println("====================\n" + "Votacao presidencial\n" + "====================\n" +
	                    "Opções:\n" +
	                    "1 - Candidato 1\n" +
	                    "2 - Candidato 2\n" +
	                    "3 - Candidato 3\n" +
	                    "4 - Candidato 4\n" +
	                    "5 – Voto em branco\n" +
	                    "Outros valores positivos - Voto nulo\n" +
	                    "Para sair digite - 0\n" +
	                    "====================");
	            voto = entrada.nextInt();
	            if (voto < 0) {
	                System.err.println("VALOR INVALIDO, TENTE NOVAMENTE!");
	            }else if (voto == 0) {
	                System.err.println("Finalizando...");
	            }else if (voto == 1){
	                opção_1 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto == 2){
	                opção_2 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto == 3){
	                opção_3 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto == 4){
	                opção_4 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto == 5){
	                opção_5 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto > 5){
	                opção_6 ++;
	                System.out.println("Voto concluido com sucesso");
	            }
	        } while (voto != 0);

	        System.out.println(
	                "====================\n" +
	                "Resultado:\n" +
	                "Candidato 1: " + opção_1 +
	                "\nCandidato 2: " + opção_2 +
	                "\nCandidato 3: " + opção_3 +
	                "\nCandidato 4: " + opção_4 +
	                "\nVotos em branco: " + opção_5 +
	                "\nVotos nulo: " + opção_6 +
	                "\n====================");

	        entrada.close();
			
			
		}
		
		

}
