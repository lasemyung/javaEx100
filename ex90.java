package ex100;

import java.util.Scanner;

public class ex90 {

	public static void main(String[] args) throws Exception {

//		경기과학고 X 선생님은 정보과학 수업을 시작하기 전에 이상한 출석을 부른다.
//		학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부르는데,
//		경곽이는 선생님이 부른 번호들을 기억하고 있다가 거꾸로 불러보는 연습을 해보고 싶어졌다.
//		출석 번호를 10번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.
//		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int[] students = new int[10];
		int numbers = 0;
		
		for (int i = 0; i < 10; i++) { // 10개의 무작위 번호 배열
			numbers = scan.nextInt();
			students[i] = numbers;
		}
		// 거꾸로 부르기 : 
		for (int i = students.length-1 ; i >= 0; i--) {
			System.out.print( students[i] + " ");
		}

	}

}