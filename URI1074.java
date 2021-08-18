import java.util.Scanner;

public class URI1074{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int n,num;

		n = teclado.nextInt();

		for (int i = 0;i < n;i++){
			num = teclado.nextInt();
			if(num == 0){
				System.out.println("NULL");
			}
			if(num % 2 == 0){
				if(num < 0){
					System.out.println("EVEN NEGATIVE");
					}
				if (num > 0){
					System.out.println("EVEN POSITIVE");
					}
			} else {
			if (num % 2 != 0){
				if(num < 0){
					System.out.println("ODD NEGATIVE");
					}
				if (num > 0){
					System.out.println("ODD POSITIVE");
					}
				}
			}
		}
	}
}