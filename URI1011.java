import java.util.Scanner;

public class URI1011{
	public static void main(String main[]){

		double raio, esfera;

		Scanner teclado = new Scanner(System.in);

		raio = teclado.nextDouble();

		esfera = (4/3.0)*3.14159*(raio*raio*raio);

		System.out.printf("VOLUME = %.3f\n",esfera);




	}
}