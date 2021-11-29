
package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int a[] = new int[10] , s =0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Infome o valor:");
			a[i]=entrada.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			s+= Math.pow( a[i]  -   a [ 9 - 1] , 2);
		}
		
	   System.out.println("Somatorio: " + s);
	   
	   
	}
}
