import java.util.Scanner;

public class URI1078{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int n;

		n = teclado.nextInt();

		for(int i = 1; i <= 10; i++){
			System.out.println(i + " x "+ n + " = " + i*n);
		}
	}
}