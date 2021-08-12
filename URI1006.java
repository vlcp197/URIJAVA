import java.util.Scanner;

public class URI1006{
	public static void main(String args[]){
		double A,B,C,MEDIA;

		Scanner teclado = new Scanner(System.in);

		System.out.println("A: ");
		A = teclado.nextDouble();

		System.out.println("B: ");
		B = teclado.nextDouble();

		System.out.println("C: ");
		C = teclado.nextDouble();

		MEDIA = ((A*2)+(B*3)+(C*5))/10;

		System.out.printf("MEDIA = %.1f\n",MEDIA);


	}
}