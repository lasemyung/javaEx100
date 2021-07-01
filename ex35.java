package java_ex100;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자(0~100) 입력");
		int num1 = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i<=num1; i++) {
			if ( i % 2 ==0 ) {
				sum += i;
				System.out.println ( i );
			}
		}
		
		System.out.println ( "입력된 숫자의 합은" + sum );
			
		
	}

}
