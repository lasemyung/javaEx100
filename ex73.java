package ex100;

import java.util.Scanner;

public class ex73 {

	public static void main(String[] args) {
		
//		기부할 사람들을 번호 순으로 일정한 규칙에 따라 돈을 준다고 한다.
//
//		규칙은 다음과 같다
//
//		1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120 (총 24개)
//
//		한편, 가난한 존과 밥은 돈을 받기 위해 신청을 했다.
//
//		존의 번호(k), 밥의 번호(h)가 주어질 때 존과 밥이 받는 기부금의 합을 구하시오.
		
		int[] array = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60,
				7,70, 8, 80, 9, 90, 10, 100, 11, 110 ,12, 120};
			
			Scanner scan = new Scanner(System.in);
			int num1= scan.nextInt();
			int num2= scan.nextInt();
			int money = array[num1-1] + array[num2-1];
			System.out.println("기부금 : " + money);
		}
	}


