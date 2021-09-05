import java.util.Scanner;

public class URI1146{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int x;
		x = teclado.nextInt();

		while (x != 0){
			for (int i = 1; i <= x; i++){
				if (x == i){
					System.out.print(i + "\n");
				}else{
					System.out.print(i + " ");
				}
			}
			x = teclado.nextInt();
		}
	}
}