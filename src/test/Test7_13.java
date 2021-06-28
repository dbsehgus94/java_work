package test;

import java.util.Scanner;

public class Test7_13 {

	// bit 를 출력하는 함수 - 비트 연산자 (|, &)
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			/*int a = x >>> i & 1;
			if (a == 1) {
				System.out.print('1');
			} else {
				System.out.print('0');
			}
			 */
			if (i % 8 == 0 && i >= 1) {
				System.out.print(" ");
			} else {
				System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
			}
		}

	}
	//0 => 1로 바꿔라, 1 => 1로 유지해라
	static int set(int x, int pos) {
		int ret = x |(1 << pos);
		return ret;
	}
	//1 => 0로 바꿔라, 0 => 0로 유지해라
	static int reset(int x, int pos) {
		int ret = x & ~(1 << pos);
		return ret;
	}
	
	static int inverse (int x, int pos) {
		int ret = x ^ (1 << pos);
		return ret;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 x의 pos 번째 비트를 변경합니다.");
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("pos : ");
		int pos = sc.nextInt();
		System.out.print("x                ");
		printBits(x);
		System.out.print("\nset(x, pos)      ");
		printBits(set(x, pos));
		System.out.print("\nreset(x, pos)    ");
		printBits(reset(x, pos));
		System.out.print("\ninverse(x, pos)  ");
		printBits(inverse(x, pos));
		System.out.println();
	}

}

/*
 * 정수 x의 pos번째 있는 비트를 1로 변경한 값을 반환하는 set 메서드, 0으로 변경한 값을 반환하는 reset 메서드, 그리고 해당
 * 위치의 비트를 반전시켜서 반환하는 inverse를 작성하자. 리턴타입 set(매개변수){} 리턴타입 reset(매개변수){} 리턴타입
 * inverse(매개변수){} int 4byte 32bit
 */