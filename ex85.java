package ex100;

import java.util.Scanner;

public class ex85 {

	public static void main(String[] args) {
		
//		길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.
//		예)
//		n이 5이면
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 입력");
		int n = scan.nextInt();
		
		for ( int i = 1; i <= n; i++ ) { // 행 5개 생성
			for ( int j = 1; j <= n; j++ ) { // 열 5개 생성
				if ( j >= i) { // 조건 : j가 i랑 같거나 크면 * 아니면 공백
					// i =1 / j=1, j=2, j=3, j=4, j=5 (모두 별)
					// i =2 / j=1, .................. (4개 별)
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
