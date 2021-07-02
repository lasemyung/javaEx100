package ex100;

import java.util.Scanner;

public class ex86 {

	public static void main(String[] args) {

//		어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
//		여기서 입력되는 n은 반드시 홀수이다.
//		3부터 99 까지의 홀수 중 하나가 입력된다.
//		입력 예시 
//		5
//		출력 예시
//		  *
//		 ***
//		*****

		Scanner scan = new Scanner(System.in);

		System.out.println("정수 입력");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= n / 2)
				{
					if (i + j <= n / 2-1)// 왼쪽 위 공백찍기
						System.out.print(" ");
					else if (j - i >= n / 2 + 1) // 오른쪽 위 공백찍기
						System.out.print(" ");
					else
						System.out.print("*");// *찍기
				}
			}
			System.out.println();
		}
	}
}
