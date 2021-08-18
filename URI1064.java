import java.util.Scanner;

public class URI1064{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int c;
		double valor,media;
		c = 0;
		media = 0;

		for(int i = 0;i < 6;i++){
			valor = teclado.nextDouble();
			if (valor > 0){
				c += 1;
				media += valor;
			}
		}
		media = media / c;
		System.out.println(c + " valores positivos");
		System.out.printf("%.1f\n",media);
	}
}