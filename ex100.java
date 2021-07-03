package ex100;

import java.util.Random;
import java.util.Scanner;

public class ex100 {

	public static void main(String[] args) {
		
//		컴퓨터가 1에서 100까지의 숫자중 하나를 랜덤으로 선택하고 사용자가 
//		숫자를 입력하면 컴퓨터가 만든값보다 큰지 작은지를 알려줍니다.
//		사용자가 정답을 찾을때까지 반복합니다.

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int answer = rand.nextInt(100)+1;
		
		while(true) {
			System.out.println("번호를 입력해 주세요");
			int answer1 = scan.nextInt();
			if ( answer1 < answer) {
				System.out.println( " 정답보다 작습니다.");
			} else if ( answer1 > answer ) {
				System.out.println(" 정답보다 큽니다");
			} else {
				System.out.println("맞았습니다");
				break;
			}
		}
	}

}
