package ex100;

import java.util.Scanner;

public class ex87 {

	public static void main(String[] args) {
//		길이 n이 입력되면 다음과 같은 사각형을 출력한다.
//		예)
//		n이 5일때
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n값:");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1)// 첫줄,마지막줄
					System.out.print("*");
				else {
					if (j == 0 || j == n - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}