package java_ex100;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 3개 입력");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if ( num1 % 2 == 0 ) {
			System.out.println ( num1 ) ;
		} 
		if ( num2 % 2 == 0 ) {
			System.out.println ( num2 ) ;
		}
		if ( num3 % 2 == 0 ) {
			System.out.println ( num3 ) ;
		} 	
	}

}
