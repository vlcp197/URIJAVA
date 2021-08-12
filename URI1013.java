import java.util.Scanner;

public class URI1013{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int a, b, c,MaiorAB;

		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();

		MaiorAB = (a+b+Math.abs(a-b))/2;

		if (c > MaiorAB){
			System.out.println(c+" eh o maior");
		} else {
			System.out.println(MaiorAB+ " eh o maior");
		}


	}
}