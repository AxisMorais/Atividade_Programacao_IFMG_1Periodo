package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

	       int totalAlunos, entrada_dado;

	       System.out.println("Insira a quantidade de alunos na turma: ");
	       totalAlunos = entrada.nextInt();

	       int notaAlunos[] = new int[totalAlunos];
	       int frequenciaAbsoluta[] = new int[11];
	       double frequenciaRelativa[] = new double[11];

	       for (int i = 0; i < totalAlunos; i++){
	           System.out.println("Insira a nota do aluno "+(i+1)+": ");
	           entrada_dado = entrada.nextInt();
	           if (entrada_dado >= 0 && entrada_dado <= 10){
	               notaAlunos[i] = entrada_dado;
	           }else{
	               System.out.println("VALOR INVALIDO!");
	               
	           }
	       }

	        for (int i = 0; i < totalAlunos; i++){
	            switch (notaAlunos[i]){
	                case 0:
	                    frequenciaAbsoluta[0] ++;
	                    break;
	                case 1:
	                    frequenciaAbsoluta[1] ++;
	                    break;
	                case 2:
	                    frequenciaAbsoluta[2] ++;
	                    break;
	                case 3:
	                    frequenciaAbsoluta[3] ++;
	                    break;
	                case 4:
	                    frequenciaAbsoluta[4] ++;
	                    break;
	                case 5:
	                    frequenciaAbsoluta[5] ++;
	                    break;
	                case 6:
	                    frequenciaAbsoluta[6] ++;
	                    break;
	                case 7:
	                    frequenciaAbsoluta[7] ++;
	                    break;
	                case 8:
	                    frequenciaAbsoluta[8] ++;
	                    break;
	                case 9:
	                    frequenciaAbsoluta[9] ++;
	                    break;
	                case 10:
	                    frequenciaAbsoluta[10] ++;
	                    break;
	            }
	        }

	        System.out.println(" Frquência Relativa - Frequência Absoluta e Nota");

	        for (int i = 0; i <= 10; i++){
	            frequenciaRelativa[i] = (double) frequenciaAbsoluta[i] / totalAlunos;
	            System.out.println("|   "+ i +"  | "+frequenciaAbsoluta[i]+" | "+frequenciaRelativa[i]+" |");
	        }

	     
		
	     
	   
	}
}
