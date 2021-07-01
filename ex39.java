package ex100;

import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		
//		삼각형의 넓이를 구하는 프로그램을 작성한다.
//		삼각형의 넓이 = 밑변 * 높이 / 2
//		입력
//		밑변(a)과 높이(b)가 정수로 입력된다.
//		출력
//		삼각형의 넓이를 소수 첫째자리까지 출력한다.
		
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0; i < 3; i++) {
			System.out.println("숫자를 입력해 주세요");
			num[i] = scan.nextInt();
		}
		int min = num[0];
		for (int i = 0; i < num.length; i ++) {
			if ( min > num[i]) {
					min=num[i];
			}
		}
		System.out.println("최소값은?" + min );
	}
	
}
