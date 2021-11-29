package LISTA_4;

import java.util.Scanner;

public class Thiago_Morais_29 {

	
	public static void main(String[] args) {
		
		
		  Scanner entrada = new Scanner(System.in);
	        int x, y, a, b;
	        System.out.print("Insira um numero X para ser dividido por Y: ");
	        x = entrada.nextInt();
	        y = entrada.nextInt();
	        a = 0;

	       do {
	            a++;
	            x = x-y;
	        } while(y <= x);

	        b = x;

	        System.out.printf("Quociente = " + a + " \nResto = " + b);

	        entrada.close();
	
	}
	
}
