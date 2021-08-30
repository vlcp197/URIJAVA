import java.util.Scanner;

public class URI1118{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		double n1,n2,media;
		int cont;

		cont = 0;

		while(cont !=2){
			cont = 0;
			n1 = 0;
			n2 = 0;
			media = 0;
			n1 = teclado.nextDouble();
			while (n1 < 0 || n1 > 10){
				System.out.println("nota invalida");
				n1 = teclado.nextDouble();
			}
			n2 = teclado.nextDouble();
			while (n2 < 0 || n2 > 10){
				System.out.println("nota invalida");
				n2 = teclado.nextDouble();
			}
			media = (n1 + n2)/2.0;
			System.out.printf("media = %.2f\n",media);
			while(cont < 1 || cont > 2){
				System.out.println("novo calculo (1-sim 2-nao)");
				cont = teclado.nextInt();
			}
		}
	}
}