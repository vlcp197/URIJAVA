import java.util.Scanner;
import java.lang.Math;

public class URI1021{
	public static void main(String args[]){
		int n100,n50,n20,n10,n5,n2,aux,x;
		int m1,m050,m025,m010,m005,m001;
		double valor,a;

		Scanner teclado = new Scanner(System.in);

		valor = teclado.nextDouble();

		n100 = (int)(valor / 100);
		aux = (int)(valor % 100);

		n50 = (int)(aux / 50);
		aux = (int)(aux % 50);

		n20 = (int)(aux / 20);
		aux = (int)(aux % 20);

		n10 = (int)(aux / 10);
		aux = (int)(aux % 10);

		n5 = (int)(aux / 5);
		aux = (int)(aux % 5);

		n2 = (int)(aux / 2);
		aux = (int)(aux % 2);
		m1 = (int)(aux);

		a = (valor - Math.floor(valor))*100;

		m050 = (int)(a/50);
		aux = (int)(a%50);

		m025 = (int)(aux/25);
		aux = (int)(a%25);

		m010 = (int)(aux/10);
		aux = (int)(a%10);

		m005 = (int)(aux/5);
		aux = (int)(a%5);

		m001 = (int)(aux);

		System.out.println("NOTAS:");
		System.out.println(n100 + " nota(s) de R$ 100.00");
		System.out.println(n50 + " nota(s) de R$ 50.00");
		System.out.println(n20 + " nota(s) de R$ 20.00"); 
		System.out.println(n10 + " nota(s) de R$ 10.00");
		System.out.println(n5 + " nota(s) de R$ 5.00");
		System.out.println(n2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(m1 + " moeda(s) de R$ 1.00");
		System.out.println(m050 + " moeda(s) de R$ 0.50");
		System.out.println(m025 + " moeda(s) de R$ 0.25");
		System.out.println(m010 + " moeda(s) de R$ 0.10");
		System.out.println(m005 + " moeda(s) de R$ 0.05");
		System.out.print(m001 + " moeda(s) de R$ 0.01");




		




	}
}