import java.util.Scanner;

public class URI1012{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		double A,B,C;
		double tri,cir,tra,qua,ret;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		tri = (A*C)/2;
		cir = (3.14159 * C*C);
		tra = ((A+B)*C)/2;
		qua = B*B;
		ret = A*B;

		System.out.printf("TRIANGULO: %.3f\n",tri);
		System.out.printf("CIRCULO: %.3f\n",cir);
		System.out.printf("TRAPEZIO: %.3f\n",tra);
		System.out.printf("QUADRADO: %.3f\n",qua);
		System.out.printf("RETANGULO: %.3f\n",ret);





	}
}