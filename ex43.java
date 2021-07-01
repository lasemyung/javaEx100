package ex100;

import java.util.Scanner;

public class ex43 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("변환할 숫자를 입력하세요");
		int number = scan.nextInt();

		int[] nums = new int[5];
		
		nums[0] = number / 10000; 
		nums[1] = (number / 1000) % 10; 
		nums[2] = (number / 100)% 10; 
		nums[3] = (number / 10) % 10; 
		nums[4] = number % 10;
		
		String str = "";
		for(int i=0; i<5; i++) {
			if(nums[i] == 1) {
				str += "일";
			}else if(nums[i] == 2) {
				str += "이";
			}else if(nums[i] == 3) {
				str += "삼";
			}else if(nums[i] == 4) {
				str += "사";
			}else if(nums[i] == 5) {
				str += "오";
			}else if(nums[i] == 6) {
				str += "육";
			}else if(nums[i] == 7) {
				str += "칠";
			}else if(nums[i] == 8) {
				str += "팔";
			} else if(nums[i] == 9) {
				str += "구";
			}  
			
			if(i==0 && nums[0]>=1) {
				str += "만";
			}
			if(i==1 && nums[1]>=1) {
				str += "천";
			}
			if(i==2 && nums[2]>=1) {
				str += "백";
			}
			if(i==3 && nums[3]>=1) {
				str += "십";
			}
			
		}
		
		System.out.println(str);
	}

}
