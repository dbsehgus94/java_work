package test;

import java.util.Scanner;

public class Test7_9 {
	static int readPlusInt() {
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.print("양의 정수값: ");
			x = sc.nextInt();
		} while (x <= 0);

		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			int n = readPlusInt();
			while (n > 0) {
				System.out.print(n % 10);
				n = n / 10;
			}
			System.out.println();
			do {
				System.out.print("다시 한번?(1:yes, 0:no) ");
				x = sc.nextInt();
			} while (x != 0 && x != 1);

		} while (x == 1);
	}

}
//"양의 정수값: "이라는 메세지에 정수값을 입려갛면 값을 거꾸로 반환하는
//readPlusInt 메서드를 작성하시오.
//0이나 음수가 입력되면 재입력하도록 할것.
