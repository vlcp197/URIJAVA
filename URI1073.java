import java.util.Scanner;

public class URI1073{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int n;

		n = teclado.nextInt();

		for(int i = 2; i <= n;i++){
			if (i % 2 ==0){
				System.out.println(i+"^2 = "+ (int)Math.pow(i,2));
			}
		}
	}
}