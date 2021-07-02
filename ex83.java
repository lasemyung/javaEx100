package ex100;

import java.util.Scanner;

public class ex83 {

	public static void main(String[] args) {
		
//		n이 입력되면 다음과 같은 삼각형을 출력하시오.
//		예)
//		n 이 5 이면
//		*
//		**
//		***
//		****
//		*****
		
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 입력");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
