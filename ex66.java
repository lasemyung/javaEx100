	package ex100;

import java.util.Scanner;

public class ex66 {

	public static void main(String[] args) {
		
//		1, 2, 3 ... 을 계속 더해나갈때, 그 합이 입력한 정수보다 같거나 작을 때까지,
//		(0 ~ 1000)
//
//		계속 합하는 프로그램을 작성해보자.
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 0~1000까지 정수를 하나 입력해 주세요");
		int num = scan.nextInt();
		
		int sum = 0;
		for (int  i = 1; i <= num; i++) {
			sum += i;
			if ( sum >= num ) {
				break;
			}
			System.out.print(i+"+");
		}
	System.out.println();
	System.out.println(sum + " 종료 합니다.");
		
	}

}
