package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int vetores[] = new int[10];
        int valor, i;
        
        for (i = 0; i<vetores.length; i++){
            System.out.println("Preencha o valor do vetor "+ i);
            vetores[i] = entrada.nextInt();
   
        }
        System.out.println("Informe o  valor:");
        valor = entrada.nextInt();
        
        if (valor == vetores[i]){
            System.out.println("Valor "+valor+" está na posição "+i);
            
        }else{
            System.out.println("Valor "+valor+" não está presente no vetor");
        }
        

	
	
}
	
}
