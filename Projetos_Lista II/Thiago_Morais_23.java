package Lista;


import java.util.Scanner;


public class Thiago_Morais_23 {
  
	 public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		long CPF , aux; 
		int Digi_Ver_1, Digi_Ver_2, d1, d2 , d3 , d4 , d5, d6 , d7, d8, d9, Calculo_1, Calculo_2;
		
		System.out.println("Informe o CPF");
        CPF = entrada.nextLong();
        aux=CPF;
          
        Digi_Ver_2= (int) CPF % 10;
        CPF=CPF/10;
        
        Digi_Ver_1=  (int) CPF % 10;
        CPF=CPF/10;
        
        
        d1=  (int) CPF % 10;
        CPF=CPF/10;
        
        d2=  (int) CPF % 10;
        CPF=CPF/10;
        
        d3=  (int) CPF % 10;
        CPF=CPF/10;
        
        d4=  (int) CPF % 10;
        CPF=CPF/10;
        
        d5=  (int) CPF % 10;
        CPF=CPF/10;
        
        d6=  (int) CPF % 10;
        CPF=CPF/10;
        
        d7=  (int) CPF % 10;
        CPF=CPF/10;
        
        d8=  (int) CPF % 10;
        CPF=CPF/10;
        
        d9=  (int) CPF % 10;
        CPF=CPF/10;
        
        Calculo_1= (((d1*2) + (d2*3) + (d3 *4) + (d4*5) + (d5*6) + (d6*7) + (d7*8) + (d8*9) +( d9*10) ) % 11);
        
        if (Calculo_1 < 1) {
			Calculo_1=0;
		}
        else  {
        	Calculo_1= 11-Calculo_1;
        }
        
        
        Calculo_2= (((Calculo_1 *2) + (d1*3) + (d2*4) + (d3 *5) + (d4*6) + (d5*7) + (d6*8) + (d7*9) + (d8*10) +( d9*11)) % 11);
        
        
        if ( Calculo_2 < 1 ) {
			Calculo_2 = 0;
		}
        else {
        	Calculo_2 = 11-Calculo_2;
        }
        
        //System.out.println("C1: " + Calculo_1 );
        //System.out.println("C2: " + Calculo_2 );
        
        
        
        
        
        if (Calculo_1 == Digi_Ver_1 && Calculo_2 == Digi_Ver_2) {
			
        	System.out.println("CPF Válido!" );
		}
        else {
        
        	System.out.println("CPF inválido");
                	
        }
        
              
        
	}

}
