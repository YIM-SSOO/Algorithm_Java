package Chapter01;

import java.util.Scanner;

// 1,2 ..., n의 합을 구합니다.
public class SumWhile {
	
	public static void main(String[] args) {
		
		Scanner stdIn =  new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 :");
		
		int n  = stdIn.nextInt();
		
		int sum = 0; //합
		int i = 1;
		
		// while문의 제어식의 조건 == 사전  판단 반복
		// i가 n보다 같거나 작을 때까지
		while (i <= n) { // i가 n이하면 반복
			sum += i;    // sum에 i를 더합니다.
			i++;         // i값을 1만큼 증가시킴  
			// sum += i++; 이면 밑에 추가로 i++해줄 필요 없음.
			
		}
		System.out.println("1부터" + n + "까지의 합은" + sum + " 입니다");
	
	}

}
