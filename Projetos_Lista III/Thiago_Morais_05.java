package LISTA_4;

//Faça um programa que calcule e imprima a soma e a média dos 10 primeiros números positivos. Soma = 1 + 2 + 3 + ... + 10

public class Thiago_Morais_05 {

	 public static void main(String[] args) {
		
		 int num=0, media;
		 double soma=0;
		 
		 for (int i = 1; i <=10;i++) {
			 
			  soma=(soma + i);
					    		     
		    }  
		    soma= (soma/10);  
		    System.out.println("Resultado" +soma);
		 
		 
	 }
}
