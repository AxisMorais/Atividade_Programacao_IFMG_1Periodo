package Lista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Thiago_Morais_16 {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner entrada = new Scanner (System .in);
				
		  String datadevotacao, Data_Nascimento;
	        System.out.println("Informe a data de nascimento no formato dd/mm/yyyy");
	        Data_Nascimento = entrada.nextLine();
	        
	        System.out.println("Informe a data de votação no formato dd/MM/yyyy");
	        datadevotacao = entrada.nextLine();
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	        
	        Date Data_Modificada = new Date (sdf.parse(datadevotacao).getTime());
	       
	        Date Data_Nascit = new Date (sdf.parse(Data_Nascimento).getTime());
	        
	        long RECEBE_DATA;
	        
	        RECEBE_DATA = Data_Modificada.getTime() - Data_Nascit.getTime();
	        TimeUnit days = TimeUnit.DAYS;
	        
	        long dias = days.convert(RECEBE_DATA, TimeUnit.MILLISECONDS);
	        long anos = dias/365;
	        
	        if(anos<=16){
	            System.out.println("A pessoa não pode votar");
	        }
	        else if(anos >= 16 && anos <18 || anos > 70){
	            System.out.println("O voto é facultativo");
	            
	        }
	        else if(anos >= 18 && anos<= 70){
	            System.out.println("O voto é obrigatório");
	        }
	}
	 
}
