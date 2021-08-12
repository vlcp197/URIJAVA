import java.util.Scanner;

public class URI1008{
	public static void main(String args[]){
		int num, horas;
		double sal_hora,sal;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Numero: ");
		num = teclado.nextInt();

		System.out.println("Horas: ");
		horas = teclado.nextInt();

		System.out.println("Salário: ");
		sal_hora = teclado.nextDouble();

		sal = sal_hora * horas;

		System.out.println("NUMBER = "+num);
		System.out.printf("SALARY = U$ %.2f\n",sal);
	}
}