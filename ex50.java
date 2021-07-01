package ex100;

import java.util.Scanner;

public class ex50 {

	public static void main(String[] args) {
		
//		비만을 판단하기 위해서 BMI 수치가 필요하다.
//		BMI 수치가 입력되면 비만을 판단하시오.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력하세요");
		int kg = scan.nextInt();
		int height = scan.nextInt();
		
		int BMI = kg / ((height/100) * (height/100));
		System.out.println("당신의 BMI지수는" + BMI + "입니다.70");
		
		if ( BMI < 18.5 ) {
			System.out.println("저체중 입니다");
		} else if ( 18.5 <= BMI && BMI <= 23) {
			System.out.println("정상체중 입니다");
		} else if ( BMI > 23) {
			System.out.println("비만 입니다");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}

}
