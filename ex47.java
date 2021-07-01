package ex100;

import java.util.Scanner;

public class ex47 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("해를 입력해 주세요");
		int year = scan.nextInt();
		
		if (( year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("윤년 입니다");
		} else if ( year % 400 == 0) {
			System.out.println("윤년 입니다");
		} else {
			System.out.println("윤년이 아닙니다");
		}
	}

}
