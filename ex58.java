package ex100;

import java.util.Scanner;

public class ex58 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("숫자를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("숫자를 입력하세요");
		int num3 = scan.nextInt();
		
		int[] array = new int[3];
		array[0] = num1;
		array[1] = num2;
		array[2] = num3;
		
		int maxnum = 0;
		for ( int i = 0; i < array.length; i++) {
			if ( maxnum < array[i]) {
				maxnum = array[i];	
			}
		}
		
		if ( array[2] < array[1] + array[0]) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}

}
