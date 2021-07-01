package ex100;

import java.util.Scanner;

public class ex55 {

	public static void main(String[] args) {
		
//		재호는 이번 시험에 받은 성적이 궁금했다.
//
//		점수가 입력되면 등급을 출력하시오.

		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		
		if ( score >= 90 ) {
			System.out.println("A등급");
		} else if ( score >= 80 ) {
			System.out.println("B등급");
		} else if ( score >= 70 ) {
			System.out.println("C등급");
		} else if ( score >= 60 ) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
	}

}
