import java.util.Scanner;

public class URI1002{
	public static void main(String args[]){
		double raio;
		double n = 3.14159;
		double area;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Raio: ");
		raio = teclado.nextDouble();

		area = (raio*raio) * n;

		System.out.printf("A=%.4f\n",area);




	}
}