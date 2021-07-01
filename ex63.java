package ex100;

import java.util.Scanner;

public class ex63 {

	public static void main(String[] args) {

//		하루는 24시간이다.
//		일(day)이 입력으로 주어지면 시간으로 변환하시오.
//		입력
//		일(day)이 입력된다.
//		출력
//		시간으로 변환해서 출력한다.

		Scanner scan = new Scanner(System.in);

		System.out.println("일을 입력하세요");
		int number1 = scan.nextInt();
		
		System.out.println( (number1 * 24)+ "시간" + ": 변환 시킨 값");

	}

}
