package Lista;

import java.util.Scanner;

public class Thiago_Morais_22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner( System.in);
		
		int A , B , C;
		
		System.out.println("Informe o valor dos 3 números: A, B,  C, ");
		A=entrada.nextInt();
		B=entrada.nextInt();
		C=entrada.nextInt();
		
		
		if (A > B   &&    A > C  &&   B >  C ) {
			
			System.out.println("Odem Decescente: " + A + " - "+ B + " - " +C);
			
		}
		else if (A > B   &&    A > C  &&   C >  B ) {
			
			System.out.println("Odem Decrescente: " + A + " - " + C + " - " + B);
		}
		else if ( B > A   &&    B > C  &&   A >  C ) {
			
			System.out.println("Odem Decrescente: " + B + " - " + A + " - " +C);
			
		}else if (B > A   &&    B > C  &&   C >  A ) {
			
			System.out.println("Odem Decrescente: " + B +" - "  + C + " - " + A);
			
		}else if (C > A   &&    C > B  &&  A >  B ) {
			
			System.out.println("Odem Decrescente: " + C + " - "  + A + " - " + B);
			
		}else if (C > B   &&    C > A  &&  B > A) {
			System.out.println("Odem Decrescente: " + C+  " - " + B + " - " + A);
		}
		
	//------------------------------------------------------------------------------------
		
        if (A < B   &&    A < C  &&   B <  C ) {
			
			System.out.println("Odem Crescente: " + A + " - "+ B + " - " +C);
			
		}
		else if (A < B   &&    A < C  &&   C  < B ) {
			
			System.out.println("Odem Crescente:: " + A + " - " + C + " - " + B);
		}
		else if ( B < A   &&    B < C  &&   A <  C ) {
			
			System.out.println("Odem Crescente:: " + B + " - " + A + " - " +C);
			
		}else if (B < A   &&    B < C  &&   C <  A ) {
			
			System.out.println("Odem Crescente: " + B +" - "  + C + " - " + A);
			
		}else if (C < A   &&    C < B  &&  A <  B ) {
			
			System.out.println("Odem Crescente: " + C + " - "  + A + " - " + B);
			
		}else if (C < B   &&    C < A  &&  B < A) {
			System.out.println("Odem Crescente: " + C+  " - " + B + " - " + A);
		}
		
		
			
	}
	
}
