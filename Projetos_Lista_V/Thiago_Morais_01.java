package Lista_06;
import java.util.Scanner;
public class Thiago_Morais_01 {

	public static void main(String[] args) {
		Scanner  entrada = new Scanner (System.in);
		
		int[][] matriz = new int[2][2];
		int[][] resultante = new int[2][2];
        int Maior=0;
        
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < resultante.length; j++) {
				System.out.println(
						"Informe o valor para a  " + (i + 1) + "º Linha, e valor para  " + (j + 1) + "º Coluna");
				matriz[i][j] = entrada.nextInt();
				if (Maior < matriz[i][j]) {
					Maior = matriz[i][j];
				}
			}
		}
		for (int i = 0; i < resultante.length; i++) {
			for (int j = 0; j < resultante.length; j++) {
				resultante[i][j] =matriz[i][j] *Maior;
			}
		}
				
		for (int i = 0; i < resultante.length; i++) {
			for (int j = 0; j < resultante.length; j++) {
				System.out.print(resultante[i][j]+ " - ");
			}
			System.out.print("\n");
		}

}
}
