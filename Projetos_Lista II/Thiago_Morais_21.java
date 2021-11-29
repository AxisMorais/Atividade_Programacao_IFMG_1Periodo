package Lista;

import java.util.Scanner;

public class Thiago_Morais_21 {

	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner (System.in);
        int ano;
        
        System.out.println("Informe um ano para verificar se ele é bissexto");
        ano = entrada.nextInt();
       
        if(ano % 4==0){
            System.out.println("O ano: " + ano + "é bissexto");
            
            
        }
        else if((ano % 4==0)&&(ano % 100!=0)){
            System.out.println("O ano: " + ano + "é bissexto");
            
        }
        else{
            System.out.println("O ano: " + ano + " não é bissexto");
        }
		
		
		
		
		
	}
	
	
}
