import java.util.Scanner;

public class URI1071{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int x,y,c;

		x = teclado.nextInt();
		y = teclado.nextInt();
		c = 0;
		if(x == y){
			System.out.println(x-y);
		} else{
			if (x > y){
				if(y % 2 == 0){
					for (int i = 1; i < x;i+=2){
						c += i;
					}
				} else{
					for (int i = 0;i < x; i += 2){
						c += i;
					}
				}
			} else{
				if (x < y){
					if(x % 2 == 0){
						for (int i = 1; i < y;i+=2){
							c += i;
						}
					} else{
						for (int i = 0;i < x; i += 2){
							c += i;
						}
					}
				}
			}						
		}
		System.out.println(c);	
	}
}