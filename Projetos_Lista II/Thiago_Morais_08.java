package Lista;

import java.util.Scanner;

// Calculo do salário

public class Thiago_Morais_08 {

	 public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 double Salario, Novo_salario;
		 
		 System.out.println("Informe o valor do salário Inicial");
		 Salario = entrada.nextDouble();
		 
		 if (Salario < 7000) {
			 Salario = Salario  + (Salario * 0.30);
			 System.out.println("O valor do salário com aumento será de: " + Salario) ;
		 }
		 else if (Salario >= 700 ) {
			 Salario = Salario  + (Salario * 0.10);
			 System.out.println(" O valor do salário com aumento será de:" + Salario);
		 }
		 
				 
	}
	
	
}
