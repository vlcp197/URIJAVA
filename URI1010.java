import java.util.Scanner;

public class URI1010{
	public static void main(String args[]){
		int num1,num2,qtd1,qtd2;
		double preco1,preco2,total;

		Scanner teclado = new Scanner(System.in);

		num1 = teclado.nextInt();
		qtd1 = teclado.nextInt();
		preco1 = teclado.nextDouble();

		System.out.println(" ");

		num2 = teclado.nextInt();
		qtd2 = teclado.nextInt();
		preco2 = teclado.nextDouble();

		total = ((qtd1*preco1) + (qtd2*preco2));

		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);

	}
}