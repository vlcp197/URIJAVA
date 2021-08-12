import java.util.Scanner;

public class URI1014{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int x;
		double y,kml;

		x = teclado.nextInt();
		y = teclado.nextDouble();

		kml = x / y;

		System.out.printf("%.3f km/l\n",kml);

	}
}