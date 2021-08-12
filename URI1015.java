import java.util.Scanner;

public class URI1015{
	public static void main(String args[]){
		double x1,x2,y1,y2,Distancia;

		Scanner teclado = new Scanner(System.in);

		x1 = teclado.nextDouble();
		y1 = teclado.nextDouble();
		x2 = teclado.nextDouble();
		y2 = teclado.nextDouble();

		Distancia = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

		System.out.printf("%.4f\n",Distancia);
	}
}