package ex100;

import java.util.Scanner;

public class ex92 {

	public static void main(String[] args) {
		
//		어느 날, 주현이 엄마는 주현이에게 10개의 숫자를 차례대로 말한 다음 "k번째 숫자는 뭘까요?"하고 물어본다.
//		이번에는 주현이가 좋아하는 '또봇'이라는 로봇변신 자동차가 상품으로 걸려있다.
//		주현이가 '또봇'을 가질 수 있도록 프로그래밍하시오.
		
		Scanner scan  = new Scanner(System.in);
		
		int[] nums = {1004,116,5,79,33};
		
		for(int m : nums ) {
			System.out.print(m+" ");
		}
		System.out.println();
		
		try {
			Thread.sleep(5000); //5초
		}catch(Exception e) { }
		
		for(int i=0; i<50; i++)
			System.out.println("...");
		
		
		System.out.println("3번째 숫자는?");
		int num = scan.nextInt();
		
		boolean a = false;
		if ( num == nums[2] ){
			a =true;
		}
			
			if ( a == true ) {
				System.out.println("correct!");
			} else {
				System.out.println(" wrong!");
			}
//	------------------------------------------------
	}

}
