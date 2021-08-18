import java.util.Scanner;

public class URI1070{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int x;

		x = teclado.nextInt();

		if (x % 2 == 0){
			for (int i = 1; i<12; i+=2){
				System.out.println(x+i);
			}
			} else{
				for(int i = 0;i <12;i +=2){
					System.out.println(x+i);
				}
			}
	}
}