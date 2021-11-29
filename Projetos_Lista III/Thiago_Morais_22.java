package LISTA_4;

import java.util.Scanner;

public class Thiago_Morais_22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	  long	Pais_A =500000, Pais_B=700000;
	  int ano =2015;
	  double Tx_Nat_A =0.03, TxNat_B=0.02;
	  
	
	  
	  
	  do {
		
		   Pais_A= (long) (Pais_A + (Pais_A *Tx_Nat_A));
		   Pais_B=(long) (Pais_B +(Pais_B *TxNat_B));
		   
		   ano++;
  	    } while (Pais_A > Pais_B );
	  
	 System.out.println("Crescimento do Pais A supera B no ano:" + ano);
	
	 
	 
}
	
}

