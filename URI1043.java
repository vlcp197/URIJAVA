import java.util.Scanner;

public class URI1043{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		
		double A,B,C,perimetro,area;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		area = ((A+B)*C)/2;
		perimetro = (A + B + C);

		if ((A==0)||(B==0)||(C==0)){
			System.out.printf("Area = %.1f\n",area);
		} else {
			if (((A + B) <= C)||((A+C)<=B)||((B+C)<=A)){
				System.out.printf("Area = %.1f\n",area);
			} else {
				System.out.printf("Perimetro = %.1f\n",perimetro);

			}
		}



	}
}