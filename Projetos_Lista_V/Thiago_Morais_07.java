package Lista_06;
import java.util.Random;
import java.util.Scanner;
public class Thiago_Morais_07 {

	public static void main(String[] args) {
		Scanner  entrada = new Scanner (System.in);
		 Random aleatorio = new Random();
		 
		  double[ ][ ] matriz_valor = new double[4][7];
	      int linha=0 ,coluna=0;
	      //----------------------------------------------------------------------------------
	        for(int i =0 ; i < matriz_valor.length;i++){
	            for(int j =0 ; j < matriz_valor[i].length;j++){
	                matriz_valor[i][j] = aleatorio.nextInt(101);
	            }
	        }
	      //--------------------------------------------------------------------------------  
	        double menorValor = 0;
			for(int i =0 ; i < matriz_valor.length;i++){
	            for(int j =0 ; j < matriz_valor[i].length;j++){
	                if(matriz_valor[i][j] < menorValor ){
	                    menorValor = matriz_valor[i][j];
	                    linha =i;
	                    coluna =j;
	                }
	                System.out.print(matriz_valor[i][j]+" |");
	            }
	            System.out.println();
	        }
	        System.out.println("O menor valor da matriz é : "+menorValor);
	        System.out.println("A posição da linha é "+(linha+1)+" coluna "+(coluna+1));
		
		
		
		
 }
}