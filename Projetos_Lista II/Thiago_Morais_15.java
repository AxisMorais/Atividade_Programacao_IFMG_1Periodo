package Lista;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;


//Uso do método Simple Date Format

public class Thiago_Morais_15 {

	public static void main(String[] args)throws ParseException  {
		Scanner entrada = new Scanner(System.in);
		 String data_a, data_b;
	        System.out.println("Informe a data no formato dd/mm/yyyy , seguindo como base o calendario universal");
	        data_a = entrada.nextLine();
	        System.out.println("Informe outra data no formato dd/mm /yyyy, seguindo como base o calendario universal");
	        data_b = entrada.nextLine();
	        SimpleDateFormat entra_data = new SimpleDateFormat("dd/mm/yyyy");
	        Date date1 = new Date (entra_data.parse(data_a).getTime());
	        Date date2 = new Date (entra_data.parse(data_b).getTime());
	        if(date1.after(date2)){
	            System.out.println("A primeira data é mais recente ");
	        }else if(date2.after(date1)) {
	            System.out.println("A segunda data é mais recente ");
	        }else
	            System.out.println("As datas são iguais");
	        
		
	}
	
}
