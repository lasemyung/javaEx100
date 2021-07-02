package ex100;

import java.util.Scanner;

public class ex69 {

	public static void main(String[] args) {

//		시작 값(a), 등차의 값(d), 몇 번째 인지를 나타내는 정수(n)가 입력될 때 
//		n번째 수를 출력하는 프로그램을 만들어보자.

		Scanner scan = new Scanner(System.in);

		System.out.println("시작 값");
		int num1 = scan.nextInt();
		
		System.out.println("등차 값");
		int num2 = scan.nextInt();
		
		System.out.println("몇 번째 까지?");
		int num3 = scan.nextInt();
		for ( int i = num1; i <= (num2 * num3); i+= num2) {
			System.out.println(i);
		}
	}

}
