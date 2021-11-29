package Lista_06;
import java.util.Random;
import java.util.Scanner;
public class Thiago_Morais_04 {

	  public static void main(String[] args) {

		  Scanner entrada = new Scanner(System.in);
	        System.out.println(" Informe quantas semanas serão analisadas: ");
	        int semanas = entrada.nextInt();
	        Double[][] matriz = new Double[semanas][7];
	        double dias = 0.0, soma = 0.0;

	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.println("Insira o valor da linha "+ (i+1) +" coluna "+ (j+1));
	                matriz[i][j] = entrada.nextDouble();
	                soma += matriz[i][j];
	                dias ++;
	            }
	        }
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print("|" + matriz[i][j]);
	            }
	            System.out.println("|");
	        }

	        double acimaDaMedia = 0.0, media = soma / dias;
	        System.out.println("A media diaria e de: " + media);

	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                if (matriz[i][j] > media){
	                    acimaDaMedia++;
	                }
	            }
	        }
	        System.out.println("A quantidade de dias acima da media e: " + acimaDaMedia);

	        for (int i = 0; i < matriz.length; i++) {

	            double valorMenorDia = media;
	            int menorDia = 0;

	            for (int j = 0; j < matriz[i].length; j++) {
	                if (matriz[i][j] < valorMenorDia){
	                    valorMenorDia = matriz[i][j];
	                    menorDia = j;
	                }
	            }
	            System.out.println("Semana " + (i+1) + " ............ " + menorDia);
	        }
}
}
