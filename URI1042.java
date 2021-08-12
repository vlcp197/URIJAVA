import java.util.Scanner;

public class URI1042{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int N1,N2,N3,aux;
		int A1,A2,A3;

		N1 = teclado.nextInt();
		N2 = teclado.nextInt();
		N3 = teclado.nextInt();

		A1 = N1;
		A2 = N2;
		A3 = N3;

		if((N1>N2)&&(N1>N3)){
			A3 = N1;
		} else{
			if ((N2 > N1)&&(N2>N3)){
				A3 = N2;
			} else {
				if((N3 > N1)&&(N3 > N2)){
					A3 = N3;
				}
			}
		}

		if((N1<N2)&&(N1<N3)){
			A1 = N1;
		} else{
			if ((N2 < N1)&&(N2 < N3)){
				A1 = N2;
			} else {
				if((N3 < N1)&&(N3 < N2)){
					A1 = N3;
				}
			}
		}

		if((((N1>N2)&&(N1<N3)))||((N1 > N3)&&(N1 < N2))){
			A2 = N1;
		} else{
			if ((((N2>N1)&&(N2<N3)))||((N2 > N3)&&(N2 < N1))){
				A2 = N2;
			} else {
				if((((N3>N1)&&(N3<N2)))||((N3 > N2)&&(N3 < N1))){
					A2 = N3;
				}
			}
		}


		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		System.out.println("");
		System.out.println(N1);
		System.out.println(N2);
		System.out.println(N3);

	}
}