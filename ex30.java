package java_ex100;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자  입력");
		int num1 = scan.nextInt();
		
		if ( num1 > 0 ) {
			System.out.println( " plus ");
		} else {
			System.out.println( " minus ");
		}
		if(num1 % 2 == 0) {
			System.out.println("even");	
		}else if(num1 %2 != 0) {
			System.out.println("odd");
		}
		
	}

}
