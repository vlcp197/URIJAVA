import java.util.Scanner;

public class URI1036{
	public static void main(String args[]){
		double A,B,C,R1,R2,Delta;

		Scanner teclado = new Scanner(System.in);

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		Delta = (B*B)-(4*A*C);
		R1 = ((-1*B)+(Math.sqrt(Delta)))/(2.0*A);

		R2 = ((-1*B)-(Math.sqrt(Delta)))/(2.0*A);

		if(A==0 || Delta < 0){
			System.out.println("Impossível calcular");
		} else {
			System.out.printf("R1 = %.5f\n",R1);
			System.out.printf("R2 = %.5f\n",R2);
		}

	}
}