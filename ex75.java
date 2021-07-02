package ex100;

import java.util.Scanner;

public class ex75 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		int count = 0;
		
		for ( int i = 1; i <= num ; i++) {
			if( (num % i) == 0 ) {
				count ++;
			}
		}
		
		if ( count == 2) {
			System.out.println("소수");
			System.out.println("약수 갯수 : " + count);
		} else {
			System.out.println("소수 아님");
			System.out.println("약수 갯수 : " + count);
		}
	}

}
