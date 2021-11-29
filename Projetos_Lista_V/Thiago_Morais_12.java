package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_12 {

	public static void main(String[] args) {
  
       Scanner entrada = new Scanner(System.in);
        
        String Produto;
        
        int Num_Armazen = 0, Quantidade; 
        int ContadorArmazen_1=0, ContadorArmazen_2 = 0,ContadorArmazen_3 = 0,ContadorArmazen_4 = 0;
        
        int [ ][ ] MatrizResultado = new int[5] [3];
       
        char resposta = 'S';
        
       while (resposta == 'S') {
		
	      
        System.out.println("Informe o tipo do produto: ");
        Produto=entrada.nextLine();
       // int [ ] VetorProduto = new int[3];
        
        entrada.nextLine();
        
        System.out.println("Informe a unidade: ");
        Quantidade=entrada.nextInt();
                
        System.out.println("Informe o número do Armazen que deseja guardar ");
        Num_Armazen=entrada.nextInt(); 
		
        System.out.println("Deseja cadastrar (S)- Sim, (N) Não ");
        resposta=entrada.next().charAt(0);
        resposta=Character.toUpperCase(resposta);
       }    
        //------------------------------------------------------------------------------------
        
        
        
        
        if (Num_Armazen ==1) {
			
        	ContadorArmazen_1++;
			
		} else if (Num_Armazen == 2) {
           ContadorArmazen_2++;
           
		}else if (Num_Armazen == 3) {
	           ContadorArmazen_3++;
	           
		}else if (Num_Armazen == 4) {
		 	  ContadorArmazen_4++;
		}
		
        System.out.println("No Armazem 1 temos:" +ContadorArmazen_1 +"unidades"  ) ;
        System.out.println("No Armazem 2 temos:" +ContadorArmazen_2  ) ;
        System.out.println("No Armazem 2 temos:" +ContadorArmazen_3  ) ;
        System.out.println("No Armazem 2 temos:" +ContadorArmazen_4  ) ;
  }
}