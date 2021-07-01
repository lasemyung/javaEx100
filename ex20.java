package java_ex100;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력>");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자 입력>");
		int num2 = scan.nextInt();
		
		System.out.print("세번째 숫자 입력>");
		int num3 = scan.nextInt();
		
		int sum = num1 + num2 +num3 ;
		System.out.println("총합 : " + sum);
		System.out.println("평균 :" + (float)sum/3);
	}

}
