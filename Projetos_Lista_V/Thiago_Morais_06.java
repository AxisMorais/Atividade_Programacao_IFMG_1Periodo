package Lista_06;
import java.util.Random;
import java.util.Scanner;
public class Thiago_Morais_06 {

	public static void main(String[] args) {
		
		Scanner  entrada = new Scanner (System.in);
		  int[][] latas = new int[6][20];
	      double[] media = new double[latas.length];
	      Random rand = new Random();
	      int soma=0;
         double auxiliar =0;
	     double[] resultado =new double[latas.length];

	   //--------------------------------------------------------------------------------------------------------------
	        for(int i =0 ; i < latas.length;i++){
	            soma =0;
	            for(int j =0 ; j < latas[i].length;j++){
	               soma += latas[i][j];
	            }
	            media[i] =soma /20;
	        }

	        for(int i =0 ; i < latas.length;i++){
	            auxiliar =0;
	            for(int j =0 ; j <latas[i].length;j++){
	                auxiliar += Math.pow((latas[i][j]-media[i]),2);
	                resultado[i] =(double) auxiliar/(latas.length-1);
	            }

	            resultado[i] =(double) Math.sqrt(resultado[i]);
	        }

	        for(int i =0 ; i < latas.length;i++){
	        System.out.println("A media de variação na lata é "+media[i]+" ml");
	        System.out.println("O padrão de desvio é :"+resultado[i]);
	        if (resultado[i] > 5 || resultado[i] < -5){
	            System.out.println("O processo dever ser revisado");
	        }else{
	            System.out.println("O processo não deve ser revisado");
	        }
	       }
		
		
	}		
}
