package ex100;

import java.util.Scanner;

public class ex88 {

	public static void main(String[] args) {
		
//		동렬이는 수학 문제를 풀다 다음과 같은 수열을 보았다.
//		Sn=(1)+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+...+n)Sn=(1)+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+...+n)
//		임의의 정수 n이 주어질 때 이 수열의 합 Sn을 구하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요!");
		int n = scan.nextInt();
		int sum = 0;
		
		for ( int i = 1; i<=n; i++ ) {
			// n개의 행 생성
			for ( int j = 1; j <= i; j++ ) {
				// i개의 열 새엉
				sum = sum + j;
				//각 행의 열마다 j를 받아 내서 누적하는 형식
			}
		}
		
		System.out.println( "수열의 합" + sum );
		
	}

}
