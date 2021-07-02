package ex100;

import java.util.Scanner;

public class ex81 {

	public static void main(String[] args) {

//		5개의 정수들의 최댓값과 최솟값을 구하는 프로그램을 작성하라.

		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("숫자를 입력해주세요");
			nums[i] = scan.nextInt();
		}
		
		//최대값
		int max = 0; // 최소값으로 설정
		for(int i=0; i<5; i++) {
			if(max < nums[i] )
				max = nums[i];
		}
		//최소값
		int min = Integer.MAX_VALUE;
		for(int i=0; i<5; i++) {
			if(min > nums[i])
				min = nums[i];
		}
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
	}

}