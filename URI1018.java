import java.util.Scanner;

public class URI1018{
	public static void main(String args[]){
		int entrada;
		int n100,n50,n20,n10,n5,n2,n1,x;

		Scanner teclado = new Scanner(System.in);

		entrada = teclado.nextInt();

		n100 = entrada / 100;
		x = entrada % 100;
		n50 = x / 50;
		x = x % 50;
		n20 = x / 20;
		x = x % 20;
		n10 = x / 10;
		x = x % 10;
		n5 = x / 5;
		x = x % 5;
		n2 = x / 2;
		x = x % 2;
		n1 = x/1;
		x = x % 1;

		System.out.println(entrada);
		System.out.println(n100+" nota(s) de R$ 100,00");
		System.out.println(n50+" nota(s) de R$ 50,00");
		System.out.println(n20+" nota(s) de R$ 20,00");
		System.out.println(n10+" nota(s) de R$ 10,00");
		System.out.println(n5+" nota(s) de R$ 5,00");
		System.out.println(n2+" nota(s) de R$ 2,00");
		System.out.println(n1+" nota(s) de R$ 1,00");


	}
}