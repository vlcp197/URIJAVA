import java.util.Scanner;

public class URI1020{
	public static void main(String args[]){
		int idade,ano,x,mes,dia;

		Scanner teclado = new Scanner(System.in);

		idade = teclado.nextInt();

		ano = idade/365;
		x = idade % 365;
		mes = x / 30;
		dia = x % 30;

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");



	}
}