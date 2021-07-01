package ex100;

import java.util.Scanner;

public class ex49 {

	public static void main(String[] args) {
		
		
//		수호는 30분 전으로 돌아가고 싶은 1人 이다.
//		차례대로 시간과 분이 주어진다.
//		그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시간과 분을 입력하세요, 단 시간은 0~24 / 분은 0~60 입니다.");
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		
		int new_hour = 0;
		int new_minute = 0;
		

		if( minute < 30 ) {
			new_minute = minute + 60 - 30;
			if(hour<1) {
				new_hour = 23;
			}else {
				new_hour = hour - 1;
			}
		}else {
			new_hour = hour;
			new_minute = minute - 30;
		}
		System.out.println("30분 이전은" + new_hour +"시" + new_minute+ "분");
		
	}

}
