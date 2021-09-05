import java.util.Scanner;

public class URI1154{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int idade,c,soma;
		double media;
		idade = 0;
		c = 0;
		soma = 0;
		idade = teclado.nextInt();
		do {
			soma = soma + idade;
			idade = teclado.nextInt();
			c = c + 1;
		} while(idade >= 0);

		media = soma / (double) c;
		
		System.out.printf("%.2f\n",media);
	}
}