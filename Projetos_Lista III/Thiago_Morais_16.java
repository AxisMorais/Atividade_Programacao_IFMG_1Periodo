package LISTA_4;

import java.util.Iterator;
import java.util.Scanner;

//Tranformando numeros binários em decimal e de decimal para octal 

public class Thiago_Morais_16 {

	public static void main(String[] args) {
		
	   Scanner entrada = new Scanner(System.in);
		
       int binario, auxiliar, bit, decimal = 0, exp = 0,  r = 0;
       
       
       //---------------------------------------------------------------
       //                   PARA BINÁRIO 
       //-------------------------------------------------------------- 
       
       
	   System.out.println("Informe o binário ");
       binario =entrada.nextInt();		
		
       auxiliar = binario;
      
       while (binario != 0) {
		 bit =binario % 10 ;
		 binario = binario /10;
		 decimal+= bit*Math.pow(2, exp);
		 exp ++;
	   }
      
      System.out.println( auxiliar  + " - em decimal =  " + decimal);
      
    //---------------------------------------------------------------
    //                   PARA OCTAL 
    //--------------------------------------------------------------  
      int aux_II = decimal;
      int octal= 0; 
      int multiplicador = 1;
      
      while (decimal != 0) {
		r= decimal % 8;
		decimal=decimal/8;
		octal = octal +(multiplicador * r);
		multiplicador *= 10;
		
		System.out.println(aux_II  + " - em octal =  " + octal );
	  }
     
    //---------------------------------------------------------------
    //                   PARA HEXADECIMAL 
    //--------------------------------------------------------------
      
      
      int  resto_Hexadecimal;
      int Hexadecimal = 0;
      int multiplicador_H =1;
      String resposta = null;
      
      while (decimal != 0) {
  		   
    	   resto_Hexadecimal= decimal % 16;
  		   decimal=decimal/16;
  		   Hexadecimal = Hexadecimal +(multiplicador_H * r);
  		   
  		   if (resto_Hexadecimal ==10) {
  			  
  			  resposta = ( "A" + Hexadecimal);
  			 
  	        }
  		   
  		   else if (resto_Hexadecimal ==11) {
			
  			  resposta = ( "B" + Hexadecimal); 
	     	}
  		   else if (resto_Hexadecimal ==12) {
 			
			   resposta = ( "C" + Hexadecimal); 
	     	}
		    
      }	
  	
            
      System.out.println(aux_II  + " - em Hexadecimal =  " + resposta);
      
	}
	
 }
