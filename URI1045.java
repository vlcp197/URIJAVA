import java.util.Scanner;

public class URI1045{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		double A,B,C,aux;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		if (C > A){
			aux = C;
			C = A;
			A = aux;
		}

		if (C > B){
			aux = C;
			C = B;
			B = aux;
		}

		if (B > A) {
			aux = B;
			B = A;
			A = aux;
		}


		if ((A >= B + C)||(B >= A + C)||(C >= A + B)){
			System.out.println("NAO FORMA TRIANGULO");
		} else{
			if ((A*A) == (B*B) + (C*C)){
				System.out.println("TRIANGULO RETANGULO");
			}if ((A*A) > (B*B) + (C*C)){
					System.out.println("TRIANGULO OBTUSANGULO");
				}if ((A*A) < (B*B) + (C*C)) {
						System.out.println("TRIANGULO ACUTANGULO");
					} if ((A == B)&&(A==C)){
							System.out.println("TRIANGULO EQUILATERO");
						} if (((A == B) && (A != C)) || ((A == C) && (A != B)) || ((B == C) && (B != A))){
								System.out.println("TRIANGULO ISOSCELES");
					}
				}
			}
		}