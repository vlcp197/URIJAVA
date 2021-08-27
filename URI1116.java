import java.util.Scanner;

public class URI1116{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int x,y,n;

		n = teclado.nextInt();
		x = 0;
		y = 0;

		for (int i = 0; i < n; i++){
			x = teclado.nextInt();
			y = teclado.nextInt();

			

			if (y == 0){
				System.out.println("divisao impossivel");
			} else {
				float div =  x/(float)y;
				System.out.printf("%.1f\n",div);
			}
		}
	}
}