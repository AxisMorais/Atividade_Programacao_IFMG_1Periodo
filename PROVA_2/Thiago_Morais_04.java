package Prova_II;

import java.util.Scanner;

public class Thiago_Morais_04 {

	
	 public static void main(String[] args) {
			

		Scanner entrada = new Scanner (System.in);
		 
		 
		 String nome = null, NomeMaior = null, NomeMenor = null;
		 double nota = 0 , media =0, soma=0 , QuantNotas=0 , Maior = 0, Menor=0 ; 
		 int nota_inf_cinq=0;
		
		 
		   for (int i =1 ; i<=30 ; i++) {
			 
						 
			 System.out.println("Informe o nome  do aluno ");
		     nome = entrada.nextLine();
		     
			 			 
			 System.out.println("Informe a nota do aluno ");
		     nota = entrada.nextDouble();
		     
		    		    		    		     
		     QuantNotas+=1; // Para contar as notas cadastradas 
		     //soma = soma + nota;
		      soma+=nota ; // para somar todas as notas 
		      media =soma / QuantNotas;
		    
				if (QuantNotas == 1) {
					Maior = nota;
					Menor = nota;
					NomeMaior =nome; 
					NomeMenor=nome;
				} else {
				if (nota > Maior) {
					Maior = nota;
					NomeMaior=nome;
				}
				if (nota < Menor) {
					Menor = nota;
					NomeMenor = nome;
				}
				}
			    if (nota < 50) {
			    	nota_inf_cinq ++;
			    }
			 	
			 entrada.nextLine();   //limpar a memória do Buffer
		 }
		 
		 
		 System.out.println("A média das notas: "+ media+ " Quantidade cadastrada:" + QuantNotas );
		 System.out.println(" A menor nota: " + Menor);
		 System.out.println("Maior nota:" + Maior);
		 System.out.println("Aluno com maior nota: " + NomeMaior);
		 System.out.println("Aluno com menor nota:" + NomeMenor);
		 System.out.println("Quantidades de notas inferiores a 50:" +nota_inf_cinq);
		 
	 

	 }
}
	
