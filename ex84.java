package ex100;

import java.util.Scanner;

public class ex84 {

	public static void main(String[] args) {

//		길이 n이 입력되면 역삼각형을 출력한다.
//		예)
//		n이 5이면
//		*****
//		****
//		***
//		**
//		*
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 입력");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) { //5개의 행 생성
			for (int j = 0; j < n - i; j++) { // 한개의 행에 n-i개의 별 생성
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
