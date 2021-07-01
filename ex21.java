package java_ex100;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
			
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫번째 숫자 입력>");
//		int num1 = scan.nextInt();
//		
//		System.out.print("두번째 숫자 입력>");
//		int num2 = scan.nextInt();
//		
//		int k = 2 * (num2);
//		System.out.println ( num1 * k);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 입력>");
		int a = scan.nextInt();
		
		if(0<=a) {
			System.out.print("10보다 작은 정수 입력 : ");
			int b = scan.nextInt();
			
			if(b<=10) {
				double multi = a*Math.pow(2, b);
				System.out.println(multi);
			}else {
				System.out.println("다시 입력해 주세요.");
			}
		}else {
			System.out.println("다시 입력해 주세요.");
		}
		
		
	}

}
