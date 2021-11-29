package Lista;

import java.util.Scanner;

public class Thiago_Morais_24 {

	public static void main(String[] args) {
		
		Scanner etrada = new Scanner(System.in);
		
		int Codigo = 0, Quantidade_Comprada = 0;
		double Valor_Compra = 0;
		
		
		System.out.println("Informe o código: ");
		Codigo=etrada.nextInt();
		
		System.out.println("Informe a quantidade comrpada");
		Quantidade_Comprada=etrada.nextInt();
				
	    if (Codigo >=1 && Codigo <=10) {
			System.out.println("Valor de unitário R$10,00");
			Valor_Compra =Quantidade_Comprada* 10;
		
	     } else if (Codigo >=11 && Codigo <=20) {
	    	 System.out.println("Valor de unitário R$20,00");
				Valor_Compra =Quantidade_Comprada* 20;
		 }else if (Codigo >=21 && Codigo <=30) {
			 System.out.println("Valor de unitário R$30,00");
				Valor_Compra =Quantidade_Comprada* 30;
		}else if (Codigo >=31 && Codigo <=40) {
			System.out.println("Valor de unitário R$40,00");
			Valor_Compra =Quantidade_Comprada * 40;
		}
	    
	    
	    
	    if (Valor_Compra <= 250) {
			Valor_Compra= (Valor_Compra - (Valor_Compra * 0.05));
		}else if (Valor_Compra > 250 && Valor_Compra <500) {
			Valor_Compra= (Valor_Compra - (Valor_Compra * 0.10));
		}else if (Valor_Compra > 500) {
			Valor_Compra= (Valor_Compra - (Valor_Compra * 0.15));
		}
	    
	    System.out.println("Valor total da compra " + Valor_Compra);
	    
	
	}
}
