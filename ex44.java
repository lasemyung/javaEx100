package ex100;

import java.util.Scanner;

public class ex44 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.월요일  2.화요일  3.수요일  4.목요일  5.금요일  6.토요일  7.일요일");
		System.out.print("숫자를 입력하세요");
		int day = scan.nextInt();
		
		if ( day == 1) {
			System.out.println(" oh my god ");
		} else if ( day == 2) {
			System.out.println(" enjoy ");
		} else if ( day == 3) {
			System.out.println(" oh my god ");
		} else if ( day == 4) {
			System.out.println(" enjoy ");
		} else if ( day == 5) {
			System.out.println(" oh my god ");
		} else if ( day == 6) {
			System.out.println(" enjoy ");
		} else if ( day == 7) {
			System.out.println(" enjoy ");
		} else {
			System.out.println( " 잘못 입력하셨습니다. ");
		}
	}

}
