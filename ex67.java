package ex100;

import java.util.Scanner;

public class ex67 {

	public static void main(String[] args) {

//		정수 한 개가 입력되었을 때 카운트다운을 출력해보자.
//		(1 ~ 100)
//		입력
//		정수 한 개가 입력된다
			
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 하나를 입력해주세요(0~100)");
		int num = scan.nextInt();

		for (int i = num; i >= 1; i--) {
			System.out.println(i);

		}
	}
}
