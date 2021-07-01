package java_ex100;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 2개 입력");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if ( num2 >= num1 ) {
			System.out.println ( " 1 " );
		} else if ( num1 >= num2 ) {
			System.out.println( " 0 " );
		}
		
	}

}
