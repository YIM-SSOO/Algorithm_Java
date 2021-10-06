package chapter01;

import java.util.Scanner;

// 입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.

public class JudgeSign {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int n = stdIn.nextInt();
		
		if(n == 1)
			System.out.println("이 수는 1 입니다.");
		else if(n == 2)
			System.out.println("이 수는 2 입니다.");
		else if(n == 3)
			System.out.println("이 수는 3 입니다. ");
		else
			;
	}

}
