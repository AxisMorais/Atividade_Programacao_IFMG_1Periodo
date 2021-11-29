package Lista_Vetor;

import java.util.Scanner;

/*
    * Escreva um programa que leia um conjunto de 50 fichas correspondente à alunos e armazene-as 
    * em vetores, cada uma contendo, a altura e o código do
    *  sexo de uma pessoa (código = 1 se for masculino e 2 se for feminino), e calcule e imprima:
    - A maior, menor e a médias das alturas da turma;
    - As mulheres com altura acima da média da altura dos homens;
     - Os homens com altura abaixo da média da altura das mulheres;
     - As pessoas com altura abaixo da média da turma.
*/


public class Thiago_Morais_09 {

	public static void main(String[] args) {
				
		 Scanner entrada = new Scanner(System.in);
      
		 
		 int codigo[ ] = new int[50]; 
 		 double altura[ ] = new double[50]; 
		 int Genero[ ]= new int[50];
		
		 
		 double  soma_altura=0, media = 0 , MaiorAltura=0, Menor_Altura=999, MediaFemi=0, MediaMasc=0  ; 	
		 int contador_Masc = 0, contador_femi=0, Mulh_Alt_Aci_H = 0, Hom_Altura_Inf_Mul = 0, Pessoa_inf_Media,Abaixo_Media=0;
 		 
		System.out.println("Fixa de Cadastro");
		
		for (int i = 0; i < codigo.length; i++) {
			
			System.out.println("Informe a  altura");
			altura[i] = entrada.nextDouble();

			System.out.println("Informe o gênero! Precione (1) para Masculino ou (2) para Feminino ");
			Genero[i] = entrada.nextInt();

		}

		// Calculo da media das alturas
		for (int i = 0; i < altura.length; i++) {
			soma_altura = (soma_altura + altura[i]);
		}
		media = soma_altura / altura.length;
		
		//As pessoas com altura abaixo da média da turma
		for (int i = 0; i < altura.length; i++) {
			    if (  altura[i] < media) {
					Abaixo_Media++;
				}
		
			// Comparando as alturas encontrando a maior e menor
				if (altura[i] > MaiorAltura) {
					MaiorAltura = altura[i];
				}
				if (altura[i] < Menor_Altura) {
					Menor_Altura = altura[i];
				}
		
		
		} 
		  
	

		System.out.printf("Média de todas as alturas cadastradas %.2f", media, " ; " );
		System.out.println( " A maior altura" + MaiorAltura) ;
		System.out.println(" A menor altura" +Menor_Altura);

		// Calculando a média das mulheres e dos homens separadamente

		for (int i = 0; i < Genero.length; i++) { // percorre o vetor genero
			if (Genero[i] == 1) { // Seleciona a opção Masculino
				contador_Masc++;
				int Soma_Altura_Masculina = 0;
				Soma_Altura_Masculina += altura[i];
				MediaMasc = Soma_Altura_Masculina / contador_Masc; // calculo da média masculina
			} else if (Genero[i] == 2) {
				contador_femi++;
				int Soma_Altura_Feminina = 0;
				Soma_Altura_Feminina += altura[i];
				MediaFemi = soma_altura / contador_femi;
			}

			// As mulheres com altura acima da média da altura dos homens;
			if (Genero[i] == 2) {
				if (altura[i] > MediaMasc) {
					Mulh_Alt_Aci_H++; // Mulheres com altura acima da média dos homens
				}
			}
									
		//Os homens com altura abaixo da média da altura das mulheres;
			if (Genero[i] == 1) {
				if (altura[i] < MediaFemi) {
					Hom_Altura_Inf_Mul++;
				}
			}
		
		
		}// chave For mãe
		
		System.out.println("Quantidade de Mulheres com altura superior a média dos homens:" +Mulh_Alt_Aci_H);
		System.out.println("Quantidade de homens com altura inferior a média das mulheres:" +Hom_Altura_Inf_Mul);
		 
		 
// Chaves mães main e classe 		 
		 
}
	}