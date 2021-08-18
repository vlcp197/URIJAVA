import java.util.Scanner;

public class URI1075{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int n;

		n = teclado.nextInt();

		for(int i = 0; i < 10000;i++){
			if(i % n == 2){
				System.out.println(i);
			}
		}

	}
}