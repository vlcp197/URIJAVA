import java.util.Scanner;

public class URI1079{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int n;
		double a,b,c,media;
		a = 0;
		b = 0;
		c = 0;
		media = 0;

		n = teclado.nextInt();

		for(int i = 0; i < n; i++){
			a = teclado.nextDouble();
			b = teclado.nextDouble();
			c = teclado.nextDouble();
			media = (a*2+b*3+c*5)/10;
			System.out.printf("%.1f\n",media);
		}
	}
}