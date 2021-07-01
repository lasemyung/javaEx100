package ex100;

import java.util.Scanner;

public class ex53 {

	public static void main(String[] args) {
		
//		그래서 휴지통이 n만큼 차면 알아서 쓰레기를 압축해주는 휴지통을 만들려고 한다.
//		이 때 압축하는 알고리즘은 다음과 같다.
//		10의 자릿수와 1의 자릿수를 서로 바꾸고, 거기에 2를 곱한다.
//		예) 70일 경우 14가 된다.( 70 -> 07 -> 14 )
//		이 알고리즘은 때로는 부작용을 일으켜 휴지통의 내용이 더 많아 질지도 모른다.
//		만약 이 알고리즘의 심각한 부작용으로 수치가 100이 넘는다면 100의 자릿수는 무시된다.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 2개를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		double[] nums = new double[4];
		double max = 0.0;
		nums[0] = num1+num2;
		nums[1] = num1-num2;
		nums[2] = num1*num2;
		nums[3] = num1/num2;
		
		for ( int i = 0; i < nums.length; i++) {
			if ( max < nums[i]) {
				max = nums[i];
			}
		}
		System.out.println("최대값은" + (int)max);
	}
	
}
