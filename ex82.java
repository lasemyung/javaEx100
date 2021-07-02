package ex100;

import java.util.Scanner;

public class ex82 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작 정수 입력");
		int start = scan.nextInt();
		System.out.println("끝 정수 입력");
		int end = scan.nextInt();
		
		for (int i = start; i <= end; i++ ) {
			for (int  j = 1; j <= 9; j++ ) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}	
		}
		
		
	}

}
