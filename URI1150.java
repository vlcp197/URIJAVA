import java.util.Scanner;

public class URI1150{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int x,z,soma,c;

		x = teclado.nextInt();
		z = teclado.nextInt();
		c = 0;
		soma =0;

		while (z <= x){
			z = teclado.nextInt();
		}

		for (int i = x; i <= z; i++ ){
				if (soma <= z){
					soma += i;
					c += 1;
				}
			}
		
		System.out.println(c);
	}
}