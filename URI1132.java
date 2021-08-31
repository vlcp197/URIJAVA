import java.util.Scanner;

public class URI1132{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int x,y,soma;
		x = teclado.nextInt();
		y = teclado.nextInt();
		soma = 0;

		if(x < y){
			for(int i = x; i <= y;i++){
				if(i % 13 != 0){
					soma += i;
				}
			}
		} else {
			if (x > y){
				for (int i = y; i <= x;i++){
					if(i % 13 != 0){
						soma += i;
					}
				}
			} else {
				if (x == y){
					soma = 0;
				}
			}
		} 
		System.out.println(soma);
	}
}