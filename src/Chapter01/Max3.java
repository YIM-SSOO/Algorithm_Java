package Chapter01;

import java.util.Scanner; //java.util 패키지에 있는 Scanner 클래스

// concatenation (순차적 구조) : 여러 문장이 순차적으로 실행되는 구조
// selection (선택 구조) 
// : ()안의 있는 식의 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택구조라 함.

// 3개의 정숫 값을 입력하고 최대 값을 구합니다.

public class Max3 {
	
	
	public static void main(String[] args) {

		//System.in은 키보드와 연결된 표준 입력 스트림 ( standard input stream)이다.
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최대 값을 구합니다.");

		System.out.println("a의 값 : ");
		
		//int의 범의( -2.147.483.648 ~ 2.147.483.647)
		int a = stdIn.nextInt(); // stdIn.nextInt()가 호출되면 키보드로 입력된 정수값을 얻을 수 있다.

		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();

		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();

		// 1. max에 a 값을 넣는다.
		int max = a;

		// 2. b값이 max보다 크면 max에 b값을 넣는다.
		if (b > max) //(b > max) 처럼 괄호 안에 넣는 식을 제어식이라 함.
			
			max = b;
		// 3. c값이 max보다 크면 max에 c값을 넣는다.
		if (c > max)
			max = c;

		System.out.println("최대 값은" + max + "입니다.");
	}

}
