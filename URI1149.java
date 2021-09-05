import java.util.Scanner;

public class URI1149{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int a,n,b;

		a = teclado.nextInt();
		n = teclado.nextInt();
		b = 0;

		while(n <= 0){
			n = teclado.nextInt();
		
		}
		for(int i = 0; i <= n-1; i++){
			b = b + a;
			a++;
		}
		System.out.println(b);
	}
}