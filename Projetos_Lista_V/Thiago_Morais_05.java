package Lista_06;
import java.util.Scanner;
public class Thiago_Morais_05 {

	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
	        String[] nomes = new String [3];
	        double[][] notas = new double [3][5];
	        double[] media = new double [nomes.length];
	        double soma;

	        for(int i =0 ; i < nomes.length;i++){
	            System.out.println("Informe o nome do aluno : "+(i+1));
	            soma=0;
	            nomes[i]= entrada.nextLine();
	            for(int j =0 ; j < notas[i].length;j++){
	                System.out.println("Informe a nota do aluno "+nomes[i]+" referente a materia de "+(j+1));
	                notas[i][j] = entrada.nextDouble();
	                soma += notas[i][j];
	            }
	            entrada.nextLine();
	            media[i] = soma/5;
	        }
	        for (int i =0 ; i< nomes.length;i++){
	            if (media[i] >= 7){
	                System.out.println("Aluno "+nomes[i]+" foi Aprovado"+" com a media de "+media[i]);
	            }else if(media[i] <7 && media[i] >=4){
	                System.out.println("Aluno "+nomes[i]+" foi para o Exame Especial"+" com a media de "+media[i]);
	            }else{
	                System.out.println("Aluno "+nomes[i]+" foi Reprovado"+" com a media de "+media[i]);
	            }
	        }
		
		
		
	}	
}
