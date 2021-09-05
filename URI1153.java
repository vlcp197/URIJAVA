import java.util.Scanner;

public class URI1153{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int n,x;
		n = teclado.nextInt();
		x = 1;

		for (int i = n; i >0; i--){
			
			x = x * i;

		}
		System.out.println(x);
	}
}