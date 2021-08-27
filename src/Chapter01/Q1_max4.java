package Chapter01;

// 네 값의 최대값을 구하는 max4메서드를 작성하시오
public class Q1_max4 {

	static int max4(int a, int b, int c, int d) {

		int max = a;

		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;

		return max;
	}

	public static void main(String[] args) {
		System.out.println("max4(5,3,2,1) = " + max4(5, 3, 2, 1)); 
		System.out.println("max4(8,3,2,2) = " + max4(8, 3, 2, 2)); 
		System.out.println("max4(3,8,1,2) = " + max4(3, 8, 1, 2)); 
		System.out.println("max4(3,2,9,3) = " + max4(3, 2, 9, 3)); 
	}

}
