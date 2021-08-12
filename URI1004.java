import java.util.Scanner;

public class URI1004{
	public static void main(String args[]){
		int a,b,PROD;

		Scanner teclado = new Scanner(System.in);


		System.out.println("A: ");
		a = teclado.nextInt();

		System.out.println("B: ");
		b = teclado.nextInt();

		PROD = a * b;

		System.out.println("PROD = "+PROD);


	}
}