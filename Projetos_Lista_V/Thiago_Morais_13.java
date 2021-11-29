package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_13 {

	public static void main(String[] args) {
	
		
	Scanner entrada = new Scanner(System.in);
	int qtdCaracter=0;
	
	System.out.println("Informe o nome:");
	String nome = entrada.nextLine();
	
	System.out.println("Informe o seu apelido:");
	String apelido = entrada.nextLine();
	
	String[] nomeCompleto = nome.split(" ");
	String nomeApelido = nomeCompleto[0]+", "+apelido;
	
	for(int i=0; i<nomeCompleto.length; i++){
		qtdCaracter+=nomeCompleto[i].length();
	}
	if (nomeCompleto[0].equals(apelido)) {
		 System.out.println("O nome é igual ao apelido");
	} else {
         System.out.println("O nome é diferente do apelido");
	}
	
	System.out.println("O nome completo tem "+qtdCaracter+" caracteres.");
	System.out.println("Nome + Apelido: "+nomeApelido+".");
				
  }
}
