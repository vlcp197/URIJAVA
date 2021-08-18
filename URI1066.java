import java.util.Scanner;
public class URI1066{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int valor, par,impar,pos,neg;
		par = impar = pos = neg = 0;

		for (int i = 0; i < 5;i++){
			valor = teclado.nextInt();
			if (valor > 0){
				pos = pos + 1;
			}
			if (valor <0){
				neg = neg + 1;
			}
			if (valor % 2 == 0){
				par = par + 1;
			}
			if (valor % 2 != 0){
				impar = impar + 1;
			}
		}
		System.out.println(par +" valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
	}
}