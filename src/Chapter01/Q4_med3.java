package Chapter01;


//3개의 정숫값을 입력하고 중앙 값을 구한 다음 출력합니다. 

public class Q4_med3 {

	static int med3(int a, int b, int c) {

		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;

		else if (a > c)
			return a;

		else if (b > c)
			return c;

		else
			return b;
	}

	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // [A] a>b>c
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // [B] a>b=c
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // [C] a>c>b
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // [D] a=c>b
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // [E] c>a>b
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // [F] a=b>c
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // [G] a=b=c
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // [H] a=b<c
		
	}
}
