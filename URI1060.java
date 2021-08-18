import java.util.Scanner;

public class URI1060{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		double valor;
		int cont;

		cont = 0;

		for (int i = 0 ; i < 6;i++ ){
			valor = teclado.nextDouble();
			if (valor > 0){
				cont = cont + 1;
			}
		}
		System.out.println(cont + " valores positivos");
	}
}