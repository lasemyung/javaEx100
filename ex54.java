package ex100;

import java.util.Scanner;

public class ex54 {

	public static void main(String[] args) {
//		
//		두 자연수 a, b가 주어진다.
//
//		b가 a의 배수이면 "a*x=b"를 출력하고,
//
//		a가 b의 배수이면 "b*x=a"를 출력하고,
//
//		배수관계가 아니면 "none"을 출력하시오.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 2개를 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if ( b % a == 0) {
			System.out.println( a + " * " + "x" + " = " + b);
		} else if ( a % b ==0 ) {
			System.out.println( b + " * " + "x" + " = " + a);
		} else {
			System.out.println("none");
		}
	}

}
