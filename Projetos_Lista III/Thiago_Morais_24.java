package LISTA_4;

import java.util.Scanner;

// Cáculo dos KiloWats
public class Thiago_Morais_24 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int Num_Consumidor, Codigo_consumidor ; 
		int Quant_Kwt, Cont_resi = 0, ContComer=0;
        double Valor_total = 0, Valor_cobrado_Resid = 0, Valor_cobrado_Comer = 0, Valor_cobrado_Ind = 0, Media_Resi, Med_Comer  ;
        
		System.out.println("Informe o Número do Consumidor:");
		Num_Consumidor = entrada.nextInt();
		
		System.out.println("Informe a quantidade de Kwats consumido no mês:");
        Quant_Kwt= entrada.nextInt();
        
    	System.out.println("Informe o Código: \n (1)Residêncial \n (2)Comercial \n (3)Industrial ");
		Codigo_consumidor = entrada.nextInt();
		
   do {		
	     switch (Codigo_consumidor) {
		      case 1: {
			        System.out.println("Residencial - Será Cobrado 0,30 cemtavos por Kwatts");      
	                Valor_cobrado_Resid = Quant_Kwt * 0.30;
	                Quant_Kwt+=Quant_Kwt;
	                Cont_resi++;
	                Media_Resi= Quant_Kwt/Cont_resi;
	                System.out.println("Valor cobrado:" + Valor_cobrado_Resid);
	                System.out.println("Média de consumo: " + Media_Resi);
	                break;
			    }
		     case 2: {
			        System.out.println("Comercial - Será Cobrado 0,50 cemtavos por Kwatts");
			        Valor_cobrado_Comer = Quant_Kwt * 0.50;
			        Quant_Kwt+=Quant_Kwt;
			        ContComer++;
			        Med_Comer=Quant_Kwt/ContComer;
			        System.out.println("Valor cobrado:" + Valor_cobrado_Comer);
			        System.out.println("Média de consumo: " + Med_Comer);
			        break;
			     
		        }
		    case 3:{
			       System.out.println("Industrial - Será Cobrado 0,70 cemtavos por Kwatts");
			       Valor_cobrado_Ind = Quant_Kwt * 0.70;
			       System.out.println("Valor cobrado:" + Valor_cobrado_Ind);
			       break;
		      }
	  }
		
	       Valor_total =Valor_cobrado_Comer +Valor_cobrado_Resid +Valor_cobrado_Ind;	
	       System.out.println("Total referente aos 3 setores: Residencia, Industria, Comércio:" + Valor_total );	
    
        }while(Num_Consumidor ==0);	
  }
}
