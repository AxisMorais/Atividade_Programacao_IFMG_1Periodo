package Lista_Vetor;

import java.util.Scanner;

// Ler o nome e a idade dos alunos e fazer as devidas comparações e calculos 

public class Thiago_Morais_01 {

	public static void main(String[] args) {
		
		Scanner  entrada = new Scanner (System.in );
		
		int idade[] = new int[4];
		String nome[] = new String[4];
        int cont_idade = 0,   Maior_Dezes=0,  Menor_Dezes=0, Menor_Idade=100, Maior_Idade=0,   ID_AC_Med = 0, contador = 0; 
        double Media = 0;
    	String  Menor_Nome = null, Maior_Nome=null;

		for (int i = 0; i <4; i++) {

			System.out.println("Informe o nome:");
			nome[i] = entrada.nextLine();

			System.out.println("Informe a idade");
			idade[i] = entrada.nextInt();
			
			entrada.nextLine();

				
			// Armazenando o valor das idades
			cont_idade = cont_idade + idade[i];
			
			
			// Total de alunos com idade maior que 16 anos
			 if (idade [i] >=16) {
				Maior_Dezes++;
			  }
			
			
			 //Total de alunos com idade menor ou igual a 16 anos
			if (idade[i] < 16) {
				Menor_Dezes++;
			}
	
			// Media das idades cadastradas:
		   	Media = cont_idade / 4;
	      
		   	//Alunos com idade acima da média
			 if (idade[i] > Media) {
				 ID_AC_Med++;
			 }
			
			 
			
			//Manobra para colocar o primeiro nome dentro da variável Maior nome e menor norme
			contador++;
			if (contador == i) {
				Maior_Nome = nome[i];
			    Menor_Nome=nome[i];		
			}
			
				 
			 
		   	//Nome e Idade do aluno mais novo 
			if (Menor_Idade >idade[i]) {
				Menor_Idade = idade[i];
				Menor_Nome = nome[i];
			}
			
			//Nome e Idade do aluno mais novo 
			if (Maior_Idade < idade[i]) {
				Maior_Idade =idade[i];
				Maior_Nome =nome[i];
			}
	}
 
		System.out.println(" Total de pessoas com idade inferior ou igual 16 anos: " + Menor_Dezes);
		System.out.println(" Total de pessoas com idade superior a 16 anos: " + Maior_Dezes);
		System.out.println(" Média das idades:  " + Media);
		System.out.println(" Quantidade de pessoas com idade acima da média" + ID_AC_Med );
		System.out.println(" Aluno mais novo: " + Menor_Nome + " , idade:  " +Menor_Idade );
		System.out.println(" Aluno mais velho: " + Maior_Nome + " , idade:  " +Maior_Idade );
		
	
		
		
		
	}
}
