import java.util.Scanner;

public class URI1113{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int x,y;
		x = 0;
		y = 1;

		while(x != y){
			x = teclado.nextInt();
			y = teclado.nextInt();

			if(x < y){
				System.out.println("Crescente");
			} else {
				if (x > y){
					System.out.println("Decrescente");
				}
			}
		}
	}
}