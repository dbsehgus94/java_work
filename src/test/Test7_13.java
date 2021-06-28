package test;

import java.util.Scanner;

public class Test7_13 {

	// bit �� ����ϴ� �Լ� - ��Ʈ ������ (|, &)
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
	//0 => 1�� �ٲ��, 1 => 1�� �����ض�
	static int set(int x, int pos) {
		int ret = x |(1 << pos);
		return ret;
	}
	//1 => 0�� �ٲ��, 0 => 0�� �����ض�
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
		System.out.println("���� x�� pos ��° ��Ʈ�� �����մϴ�.");
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
 * ���� x�� pos��° �ִ� ��Ʈ�� 1�� ������ ���� ��ȯ�ϴ� set �޼���, 0���� ������ ���� ��ȯ�ϴ� reset �޼���, �׸��� �ش�
 * ��ġ�� ��Ʈ�� �������Ѽ� ��ȯ�ϴ� inverse�� �ۼ�����. ����Ÿ�� set(�Ű�����){} ����Ÿ�� reset(�Ű�����){} ����Ÿ��
 * inverse(�Ű�����){} int 4byte 32bit
 */