import java.util.Scanner;

public class URI1101{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int m,n,soma;
		
		soma = 0;
		while(((m = teclado.nextInt()) > 0) && ((n = teclado.nextInt())> 0)){
			soma = 0;
			if(m > n){
				for(int i = n;i <= m;i++){
					soma = soma + i;
					System.out.print(i+" ");
				}
				System.out.println("Sum="+soma);
			}else{
					for(int i = m; i <=n;i++){
						soma = soma + i;
						System.out.print(i+" ");
				}
				System.out.println("Sum="+soma); 
			}
		}
	}
}