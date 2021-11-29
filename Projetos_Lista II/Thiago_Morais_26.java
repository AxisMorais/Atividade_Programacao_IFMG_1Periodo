package Lista;

import java.util.Scanner;

public class Thiago_Morais_26 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float Imposto = 0, G = 0, Salário, Tempo_Serviço; 
        System.out.println("informe o salario: ");
        Salário = teclado.nextInt();
        System.out.println("Informe o tempo de servico: ");
        Tempo_Serviço = teclado.nextInt();
        if(Salário < 200){
            System.out.println("Isento de imposto!!");
        }
        else if(Salário >= 200 && Salário <= 450){
            Imposto = ((Salário * 3)/100);
            System.out.println("Imposto de: " + Imposto);
        }
        else if(Salário >= 450 && Salário < 700){
            Imposto = ((Salário * 8)/100);
            System.out.println("Imposto de: " + Imposto);
        }
        else if(Salário >= 700){
            Imposto = ((Salário * 12)/100);
            System.out.println("Imposto de: " + Imposto);
        }
        if(Salário > 500 && Tempo_Serviço <= 3){
            G = (Salário * 20)/100;
            System.out.println("Gratificacao de: " + G);
        }
        else if(Salário > 500 && Tempo_Serviço > 3){
            G = (Salário * 30)/100;
            System.out.println("Gratificacao de: " + G);
        }
        else if(Salário <= 500 && Tempo_Serviço <= 3){
            G = (Salário * 23)/100;
            System.out.println("Gratificacao de: " + G);
        }
        else if(Salário <= 500 && Tempo_Serviço > 3 && Tempo_Serviço < 6){
            G = (Salário * 35)/100;
            System.out.println("Gratificacao de: " + G);
        }
        else if(Salário <= 500 && Tempo_Serviço > 6){
            G = (Salário * 33)/100;
            System.out.println("Gratificacao de: " + G);
        }
        Salário = (Salário - Imposto) + G;
        System.out.println("Salario liquido: " + Salário);
        if(Salário <= 350){
            System.out.println("Categoria: A");
        }
        else if(Salário > 350 && Salário <600){
            System.out.println("Categoria: B");
        }
        else{
            System.out.println("Categoria: C");
        }
		
	}
}
