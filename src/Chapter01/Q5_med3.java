package chapter01;

//3개의 정숫값을 입력하고 중앙 값을 구한 다음 출력합니다. 

public class Q5_med3 {

	static int med3(int a, int b, int c) {

		// 1번째 if 조건문
		// ((b보다 a가 작거나 클때 && c가 a보다 작거나 같을때) OR (b가 a보다 작거나 같고  c가 a보다 크거나 같을때)
		//  b>a>c OR c>a>b
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
	
		return c;
	}

	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); 
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); 
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); 
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); 
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); 
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); 
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); 
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); 

	}
}
