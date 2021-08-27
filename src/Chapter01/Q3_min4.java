package Chapter01;

// 네 값의 최소값을 구하는 min4메서드를 작성하시오
public class Q3_min4 {

	static int min4(int a, int b, int c, int d) {

		int min = a;

		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;

		return min;
	}

	public static void main(String[] args) {
		System.out.println("min4(3, 9, 2, 1) = " + min4(3, 9, 2, 1));
		System.out.println("min4(3, 2, 5, 2) = " + min4(3, 2, 5, 2));
		System.out.println("min4(8, 3, 1, 2) = " + min4(8, 3, 1, 2));

	}

}
