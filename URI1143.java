import java.util.Scanner;

public class URI1143{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int n;

		n = teclado.nextInt();

		for(int i = 1; i <= n; i ++){
			System.out.println(i+ " "+ i * i + " "+ i*i*i);
		}
	}
}