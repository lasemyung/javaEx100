package ex100;

import java.util.Scanner;

public class ex93 {

	public static void main(String[] args) {
		
//		주현이 엄마는 주현이에게7개의 단어를 차례대로 말한 다음 "k번째 숫자는 뭘까요?"하고 물어본다.
//		이번에는 주현이가 좋아하는 '닌텐도 스위치'이라는 장난감 상품으로 걸려있다.
//		주현이가 ' 닌텐도 스위치 '을 가질 수 있도록 프로그래밍하시오.
		
		String[] str = { "orange","coffe","banana","latte","point","donnut","plays"}; 
		
		
		for ( String s : str ) {
			System.out.print(s + " ");
		}
		System.out.println(); //줄띄기
		
		try {
			Thread.sleep(5000); //5초 기다리기
		} catch (Exception e) {
		}
		
		for (int  i = 0; i < 20; i++ ) {
			System.out.println("..."); // 단어가리기
		}
		
		Scanner scan = new Scanner(System.in); 
		System.out.println( "4번째 단어는 뭐였나요?"); 
		String a = scan.nextLine(); // 4번째 단어 입력받기
		
		boolean b = false;
		if ( a == str[3] ){ // 입력받은 a값이 str[3]과 받으면 b값은 a로 바뀜
			b = true;
		}
			if ( b = true ) { // 입력받은 값이 같으면 정답, 아니면 틀림 ㅋ
				System.out.println(" 정.답.이.다.닝.겐");
			} else {
				System.out.println(" 틀.렸.다.닝.겐!");
			}
					
		}
	}


