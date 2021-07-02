package ex100;

public class ex94 {

	public static void main(String[] args) {
		
//		올바른 괄호를 확인하기 위해 가장 기본적인 방법 중 하나는 여는 괄호와 닫는 괄호의 개수를 세는 것이다.
//		소괄호로 이루어진 문자열을 주어지면 괄호의 개수를 출력하는 프로그램을 작성하시오.
		
		String str = "(((()))()(()))";
		int 여는괄호 = 0; 
		int 닫는괄호 = 0;
		for ( int i=0; i <str.length(); i++ ) { // 인덱스 0부터 배열 길이-1 만큼 반복할건데
			char a = str.charAt(i); // char 타입 a변수에 str 변수 i를 담아줘
			if (a == '(') { //만약 a가 '(' 라면 여는괄호 라는 변수에 1을 더해주고
				여는괄호++;
			} else if ( a == ')') { // a가 ')'라면 닫는 괄호 변수에 1으르 더해줘
				닫는괄호++;
			}
		}
		System.out.println( 여는괄호 + " " + 닫는괄호 ); //  갯.수.출.력
	}

}
