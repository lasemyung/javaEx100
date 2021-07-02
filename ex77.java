package ex100;

import java.util.Scanner;

public class ex77 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int a = scan.nextInt();
		
		int multi = 1;
		
		for ( int i= a; i >= 1; i -- ) {
			multi = multi * i ;
		}
		System.out.println("팩토리얼 값 :" + multi);
	}

}
