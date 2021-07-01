package ex100;

import java.util.Scanner;

public class ex52 {

	public static void main(String[] args) {

//		영어에서 서수를 나타낼 때 다음과 같이 나타낸다.
//		1st  2nd  3rd  4th  5th  6th  ... 
//		11th 12th 13th 14th 15th...
//		21st 22nd 23rd 24th 25th ...
//		31st 32nd 33rd 34th 35th...
//		41st 42nd 43rd 44th 45th...
//		...
//		91st 92nd 93rd 94th 95th ... 99th
//		1부터 99까지의 숫자가 입력되면 영어 서수 표현으로 출력하시오.
			
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		if ( num % 10 == 1) {
			System.out.println( num +"st");
		} else if ( num % 10 == 2) {
			System.out.println( num +"nd");
	}	else if ( num % 10 == 3) {
		System.out.println( num + "rd");
	}	else {
		System.out.println( num + "th");
	}
	}
}
