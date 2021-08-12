import java.util.Scanner;

public class URI1005{
	public static void main(String args[]){
		double a,b,media;

		Scanner teclado = new Scanner(System.in);

		System.out.println("a: ");
		a = teclado.nextDouble();

		System.out.println("b: ");
		b = teclado.nextDouble();

		media = ((a*3.5)+(b*7.5))/11;

		System.out.printf("MEDIA = %.5f\n",media);




	}
}