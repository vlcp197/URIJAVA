import java.util.Scanner;

public class URI1007{
	public static void main(String args[]){
		int A,B,C,D;
		int DIFERENCA;

		Scanner teclado = new Scanner(System.in);

		System.out.println("A: ");
		A = teclado.nextInt();

		System.out.println("B: ");
		B = teclado.nextInt();

		System.out.println("C: ");
		C = teclado.nextInt();

		System.out.println("D: ");
		D = teclado.nextInt();

		DIFERENCA = (A*B-C*D);

		System.out.println("DIFERENCA = "+DIFERENCA);

	}
}