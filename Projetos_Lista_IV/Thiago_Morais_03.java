package Lista_Vetor;
import java.util.Scanner;

// Sequencia de Fibonnaci 

public class Thiago_Morais_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n , a = 0 , b = 0;
		
		System.out.println("Informe o valor que você deseja na sequencia fibonacci ");
		n=entrada.nextInt();
		
		int Fibonnaci[ ] = new int [n];
		
		 //int v [ ] = { 0, 0 };
		 
		 for (int i = 0; i < n; i++) {
		       Fibonnaci[i] =b;
		       System.out.print(Fibonnaci[i] + " ,");
			   b = b +a ;
		       a = b - a;
		       
		     if (i==0) {
			   b++;
		   }
		}
		 
		
		
	}
		 
}
