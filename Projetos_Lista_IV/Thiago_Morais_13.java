package Lista_Vetor;
import java.util.Arrays;
import java.util.Scanner;

// Intercalação de Vetores

public class Thiago_Morais_13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 
		int Valor_Maximo = 100;
        int NA,NB;
                
        System.out.println("Informe o tamanho do vetor  A :");
        NA = entrada.nextInt();
        System.out.println("Informe o tamanho do vetor  B :");
        NB = entrada.nextInt();
    
        int A [ ]= new int[NA];
        int B [ ]= new int[NB];
        int C [ ]= new int[NA+NB];  
                        
        if((NA > Valor_Maximo)||(NB > Valor_Maximo)||(NA < 0)||(NB < 0)){
            System.out.println("Tamanho Inválido");
            System.exit(-1);
        }
      
        for(int i = 0; i < NA; i++){
            System.out.println("Informe o valor de A para a posição " +i+ " : ");
            A[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < NB; i++){
            System.out.println("Informe o valor de B para a posição " +i+ " : ");
            B[i] = entrada.nextInt();
        }
        
        int i=0, j=0,contador=0;
        while(i < NA){
            C[contador] = A[i];
            i++;
            contador++;
        }
        while(j < NB){
            C[contador] = B[j];
            j++;
            contador++;
        }
        Arrays.sort(C);
        System.out.println("Resultado: "+Arrays.toString(C));
        entrada.close();
		
		
		
		
		
		
		
	}
	
}
