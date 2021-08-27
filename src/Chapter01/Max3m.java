package Chapter01;

// 3개의 정숫 값 가운데 최대 값을 구하여 출력합니다.
public class Max3m {
	// a, b, c의 최댓 값을 구하여 반환합니다.

	/*
	 * max3() 메서드는 int형 매개변수 a,b,c의 값을 받아 최대값을 구하고 그것을 int형 값으로 반환하는 메서드.
	 */
	static int max3(int a, int b, int c) {

		int max = a;

		if (b > max)
			max = b;
		if (c > max)
			max = c;

		// 구한 최대 값을 호출한 곳으로 반환
		return max;
	}

	// main 메서드는 max3 메서드에 3개의 값을 실인수로 주어 호출하고
	// 반환값을 화면에 13회 출력한다.
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1)); // [A] a>b>c
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2)); // [B] a>b=c
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2)); // [C] a>c>b
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3)); // [D] a=c>b
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3)); // [E] c>a>b
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2)); // [F] a=b>c
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3)); // [G] a=b=c
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3)); // [H] a=b<c
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1)); // [I] b>a>c
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2)); // [J] b>a=c
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2)); // [K] b>c>a
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3)); // [L] b=c>a
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3)); // [M] c>b>a

	}
}
