package LISTA_4;

import java.util.Scanner;
//Análise do CPF

public class Thiago_Morais_33 {
 
	
	public static void main(String[] args) {
	
				
		   Scanner entrada = new Scanner(System.in);
	        double soma = 0, verifUm, verifDois;
	        long[] cpf = new long[12];
	        long valor_Cpf;
	        System.out.println("Insira o CPF:");
	        valor_Cpf = entrada.nextLong();

	        for (int i = 11; i > 0 ; i--) {

	            cpf[i] = valor_Cpf % 10;
	            valor_Cpf = valor_Cpf / 10;
	        }
	        int j = 2;
	        for (int i = 9; i >= 1; i--) {
	            soma = soma + (cpf[i] * j);
	            j++;
	        }
	        if (soma % 11 < 2){
	            verifUm = 0;
	        }else {
	            double resto = soma % 11;
	            verifUm = 11 - resto;
	        }
	        if (!(verifUm == cpf[10])){
	            System.err.println("CPF Invalido!");
	            System.exit(1);
	        }
	        soma = 0;
	        j = 2;
	        for (int i = 10; i >= 1; i--) {
	            soma = soma + (cpf[i] * j);
	            j++;
	        }
	        if (soma % 11 < 2){
	            verifDois = 0;
	        }else {
	            double resto = soma % 11;
	            verifDois = 11 - resto;
	        }
	        if (!(verifDois == cpf[11])){
	            System.err.println("CPF Invalido!");
	            System.exit(1);
	        }else {
	            System.out.println("CPF Valido!");
	        }

	        entrada.close();
		
}
}
