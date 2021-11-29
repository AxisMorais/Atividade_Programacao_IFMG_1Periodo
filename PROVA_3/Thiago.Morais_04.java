package Avaliacao;

import java.util.Iterator;
import java.util.Scanner;

public class Thaigo_Morais_04 {

	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in); 
		  
		  int quanAlunos=30;
		  int disciplinas=15;
	      String []NomesAlunos = new String[quanAlunos];
	      double []soma = new double[quanAlunos];
	      double []media = new double[quanAlunos];
	      double []notas = new double[quanAlunos];
	      double maior = 0, menor = 10000;
	      double []MediaDisciplina = new double[disciplinas];
	    
	      String MaiorNome = null, MenorNome = null;
	      String maiorA = null;
	      String Disciplina[] = new String[3];
	      for(int i=0; i<3; i++){
	         System.out.println("Informe o nome da "+(i+1)+"° discplina.");
	         Disciplina[i] = entrada.nextLine();
	      }
	         
	      for(int i=0; i<Disciplina.length; i++){   
	         System.out.println("Informe o nome do "+(i+1)+"° aluno.");
	         NomesAlunos[i] = entrada.nextLine();
	      }
	         
	      for(int i=0; i<Disciplina.length; i++){   
	         System.out.println("Informe a nota do "+(NomesAlunos[i])+" em "+Disciplina[0]);
	         notas[i] = entrada.nextDouble();
	         soma[i] = soma[i]+notas[i];
	         media[i] = soma[i]/3;
	         MediaDisciplina[i] = soma[i]/3;
	         if(notas[i] > maior){
	            maior = notas[i];
	            MaiorNome = Disciplina[i];
	         } 
	         if(notas[i] < menor) {
	            menor = notas[i];
	            MenorNome = Disciplina[i];
	         } 
	         if(notas[i] > maior){
	            maior = notas[i];
	            maiorA = NomesAlunos[i];
	         } 
	         if(notas[i] < menor) {
	            menor = notas[i];
	            maiorA = NomesAlunos[i];
	         }  
	      }   
	      for(int i=0; i<Disciplina.length; i++){   
	         System.out.println("Informe a nota do "+(NomesAlunos[i])+" em "+Disciplina[1]);
	         notas[i] = entrada.nextDouble();
	         soma[i] = soma[i]+notas[i];
	         media[i] = soma[i]/3;
	         MediaDisciplina[i] = soma[i]/3;
	         if(notas[i] > maior){
	            maior = notas[i];
	            MaiorNome = Disciplina[i];
	         } 
	         if(notas[i] < menor) {
	            menor = notas[i];
	            MenorNome = Disciplina[i];
	         } 
	         if(notas[i] > maior){
	            maior = notas[i];
	            maiorA = NomesAlunos[i];
	         } 
	         if(notas[i] < menor) {
	            menor = notas[i];
	            maiorA = NomesAlunos[i];
	         }   
	      } 
	      for(int i=0; i<Disciplina.length; i++){   
	         System.out.println("informe a nota do "+(NomesAlunos[i])+" em "+Disciplina[2]);
	         notas[i] = entrada.nextDouble();
	         soma[i] = soma[i]+notas[i];
	         media[i] = soma[i]/3;
	         MediaDisciplina[i] = soma[i]/3;
	         if(notas[i] > maior){
	            maior = notas[i];
	            MaiorNome = Disciplina[i];
	         } 
	         if(notas[i] < menor) {
	            menor = notas[i];
	            MenorNome = Disciplina[i];
	         } 
	         if(notas[i] > maior){
	            maior = notas[i];
	            maiorA = NomesAlunos[i];
	         } 
	         if(notas[i] < menor) {
	            menor = notas[i];
	            maiorA = NomesAlunos[i];
	         }   
	      } 
	      for(int i=0; i<Disciplina.length; i++){   
	         System.out.println("O aluno "+NomesAlunos[i]+" teve uma média geral de: "+media[i]);  
	      }  
	      
	      System.out.println("O aluno "+maiorA+" teve a maior nota: "+maior);
	      
	      System.out.println("A disciplina "+MaiorNome+" teve a maior nota: "+maior);
	      System.out.println("A disciplina "+MenorNome+" teve a menor nota: "+menor);
	           
	   }
	
	
	
}