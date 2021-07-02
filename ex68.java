package ex100;

import java.util.Scanner;

public class ex68 {

	public static void main(String[] args) {
		
//		정수 한 개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
//		(0 ~ 100)
//		입력
//		정수 한 개가 입력된다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int num = scan.nextInt();
		
		for ( int i = 0 ; i <= num; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
			System.out.println( i );
		}
	}

}
