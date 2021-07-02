package ex100;

import java.util.Scanner;

public class ex71 {

	public static void main(String[] args) {

		
//		무작위로 n개의 정수가 입력된다.(n은 2~10의 랜덤수임)
//
//		n개의 수의 합을 출력하시오.
		
		
		Scanner scan = new Scanner(System.in);

		int sum = 0;
		System.out.println("계산기 n개의 숫자를 입력해 더합니다. 0을 입력하면 종료합니다.종료합니다.");
		System.out.println("");

		while (true) {
			System.out.print("더할 숫자를 입력하세요>");
			int num = scan.nextInt();

			sum += num;
			System.out.println("====================");
			System.out.println("지금까지 숫자의 합은? " + sum);

			if (num == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}

	}
}