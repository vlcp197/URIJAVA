import java.util.Scanner;

public class URI1151{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int n,fib, fib2;

		fib = 0;
		fib2 = 1;

		n = teclado.nextInt();

		for(int i = 0;i < n;i++){
			if(i == n-1 ){
				System.out.println(fib);
			}else{
				System.out.print(fib + " ");
				fib = fib + fib2;
				fib2 = fib - fib2;
			}
		}
	}
}