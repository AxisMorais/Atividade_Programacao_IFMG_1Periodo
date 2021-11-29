package Thiago;

import java.util.Scanner;

//Calculod da Potencia da luz para iluminar a  área de um quarto 

public class Thiago_Morais_14 {

	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		double COMPRIMENTO, LARGURA, AREA , CALCULO_DA_POTENCIA;
		
		System.out.println("Informe o comprimento do quarto ");
		COMPRIMENTO =entrada.nextDouble();
		
		System.out.println("Informe a largura do quarto");
		LARGURA =entrada.nextDouble();
		
		AREA= (COMPRIMENTO*LARGURA);
		CALCULO_DA_POTENCIA= (AREA*18);
				
		System.out.println(" O valor da Potência da luz é  de " + CALCULO_DA_POTENCIA +" Whatts");
		
		
	}
	
	
	
}
