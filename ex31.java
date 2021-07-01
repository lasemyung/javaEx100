package java_ex100;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력");
		int num1 = scan.nextInt();
		
		if ( 90 <= num1 && num1 <= 100 ) {
			System.out.println( "A" );
		} else  if ( 70 <= num1 && num1 <= 89 ) {
			System.out.println( "B" );
		} else  if ( 40 <= num1 && num1 <= 69 ) {
			System.out.println( "C" );
		} else {
			System.out.println( "D" );
		}
	}

}
