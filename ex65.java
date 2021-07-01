package ex100;

import java.util.Scanner;

public class ex65 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System. in);
		
		System.out.println("10보다 작은 정수 한 개를 입력하세요");
		int number = scan.nextInt();
		
		for (int i = 0; i <= number; i++) {
			if ( i ==3 || i == 6 || i == 9) {
				System.out.print(" "+"X");
			} else {
				System.out.print(" " + i );
			}
		}
	}

}
