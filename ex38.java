package java_ex100;

import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {
		
//		삼각형의 넓이를 구하는 프로그램을 작성한다.
//
//		삼각형의 넓이 = 밑변 * 높이 / 2
//
//		 
//		입력
//
//		밑변(a)과 높이(b)가 정수로 입력된다.
//
//		출력
//
//		삼각형의 넓이를 소수 첫째자리까지 출력한다.

		 
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력");
		int height = scan.nextInt();
		int width = scan.nextInt();
		
		System.out.println ( height );
		System.out.println ( width );
		
		System.out.printf("삼각형의 넓이는? "+"%.1f", (float)(height*width)/2);
	}

}
