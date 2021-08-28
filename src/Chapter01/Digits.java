package Chapter01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;

		System.out.println("2자리의 정수를 입력하세요");

		do {
			System.out.println("입력 : ");
			no = stdIn.nextInt();
		} while (no < 10 || no > 99);
		// 논리 부정연산자 !
		// !((no < 10) || (no > 99)) ==> !(no < 10) && !(no > 99) :드모르간 법칙 논리연산자가 바뀜
		// (no >= 10) && (no > 99)

		System.out.println("변수 no 값은 " + no + "가(이) 되었습니다.");
	}
}
