package java_ex100;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("년도 입력" );	
		int num1 = scan.nextInt();
		System.out.printf("월 입력" );
		int num2 = scan.nextInt();
		System.out.printf("일 입력" );
		int num3 = scan.nextInt();
		
//		System.out.printf( num1 +"."+num2+"."+num3 );
		
		System.out.printf("%d", num1);
		System.out.printf(".");		
		System.out.printf("%d", num2);
		System.out.printf(".");
		System.out.printf("%d", num3);
	}

}
