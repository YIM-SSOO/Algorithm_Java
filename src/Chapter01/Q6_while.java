package chapter01;

import java.util.Scanner;

// 실습 1-4 while문이 종료될 때 변수 i 값이  n + 1이 됨을 확인하기
// ( 변수 i 값을 출력 )
public class Q6_while {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값：");
		int n = stdIn.nextInt();

		int sum = 0; 		
		int i = 1;

		while (i <= n) { 	// i가 n 이하면 반복
			sum += i; 		// sum에 i를 더하기
			i++; 			// i의 값을 1 증가-
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i의 값은 " + i + "가(이) 되었습니다.");
	}
}
