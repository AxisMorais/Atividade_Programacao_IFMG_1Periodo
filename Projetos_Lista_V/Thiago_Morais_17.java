
package Lista_06;

import java.util.Iterator;
import java.util.Scanner;

public class Thiago_Morais_17 {
	public static void main(String[] args) {
		Scanner  entrada = new Scanner (System.in);
		
		  int contador_Z = 0,contador_Um=0,contador_2=0, contador_3=0,contador_4=0; 
		  int [ ]Vetor_Zero = {0,1,1,0,1};
		  int [ ]Vetor_Um  = {1,0,0,1,0 };
		  int [ ]Vetor_Dois = {1,0,0,0,0};
		  int [ ]Vetor_Tres = {0,1,0,0,1};
		  int [ ]Vetor_Quatro = {1,0,0,1,0}; 
		
		  for (int i = 0; i < Vetor_Quatro.length; i++) {
			   if (Vetor_Zero[i]== 1) {
				   contador_Z++;
			   }
			   if (Vetor_Um[i]== 1) {
				   contador_Um++;
			  } 
			  if( Vetor_Dois[i]== 1) {
				  contador_2++;
			   }
			  if (Vetor_Tres[i]==1) {
				 contador_3++;
			  }
			  if (Vetor_Quatro[i]==1) {
				  contador_4++;
			  }
		} 
			
		 System.out.println(" N0 possui  " + contador_Z +"Amigos "); 		 
		 System.out.println(" N1 possui  " + contador_Um +"Amigos ");
		 System.out.println(" N2 possui  " + contador_2 +"Amigos ");
		 System.out.println(" N3 possui  " + contador_3 +"Amigos ");
		 System.out.println(" N4 possui  " + contador_4 +"Amigos ");
  }
	
}
