package ex100;

import java.util.Scanner;

public class ex64 {

	public static void main(String[] args) {
		
//		정수 계산에서 나머지를 구하시오.
//		예를 들어
//		7 / 5 의 나머지는 2입니다.
//		입력
//		두 정수 a, b를 입력받는다.
//		a는 피제수, b는 제수를 나타낸다.
//		예) 7 5 가 입력되었다면  ====>   7  /  5 를 뜻함
//		출력
//		나머지를 출력한다.
//		
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 두개를 입력하세요");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println("나머지 값은 :" + (number1%number2));
	}

}
