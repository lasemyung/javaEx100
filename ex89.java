package ex100;

import java.util.Scanner;

public class ex89 {

	public static void main(String[] args) {
//		주사위는 각 면에 1~6까지 적혀 있는 정육면체이다.
//		이런 주사위 2개를 굴려 합이 k가 나오는 경우를 조사하려고 한다.
//		예를 들어, 주사위 두개를 굴려 5가 나오는 경우는 1 4, 2 3, 3 2, 4 1 이다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("합이 될 정수를 입력해 주세요");
		int k = scan.nextInt();
		
		
		for ( int i = 1; i <= 6; i++ ) {
			for ( int j = 1; j <= 6; j++ ) {
				if ( i + j == k ) {
					System.out.println( "첫번째 주사위 :"+ i + " 두번째 주사위 :"+ j);
					System.out.println( "합 :" + k);
				} 
					
				}
			}
		}
		
	}


