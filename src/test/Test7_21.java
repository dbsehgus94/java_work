package test;
import java.util.Scanner;
public class Test7_21 {
	static void exchangeArray(int[] a, int[] b) {
		int n = 0;
		if(a.length<b.length) {
			n = a.length;
		}
		else {
			n = b.length;
		}
			
		for(int i=0; i<n;i++) {
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 a�� ��� �� : ");
		int num1 = sc.nextInt();
		int [] a = new int [num1];
		for(int i=0; i<a.length;i++) {
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("�迭 b�� ��� �� : ");
		int num2 = sc.nextInt();
		int [] b = new int [num2];
		for(int i=0; i<b.length;i++) {
			System.out.print("b["+i+"] : ");
			b[i] = sc.nextInt();
		}
		exchangeArray(a, b);
		System.out.println("�迭 a�� b�� ��ü ��Ҹ� ��ȯ");
		int temp = 0;
		for(int i=0; i<num1; i++) {
			System.out.println("a["+i+"] : "+a[i]);
		}
		for(int i=0; i<num2; i++) {
			System.out.println("b["+i+"] : "+b[i]);
		}
			
	}

}
/*
 * �迭 a�� �迭 b�� ��ü ��Ұ��� ��ȯ�ϴ� exchangeArray �޼��带 �ۼ��Ͻÿ�.
 * �� �迭�� ��� ���� ���� �ʴٸ� ���� ���� �迭 ���� ���߾� ��ȯ�Ͻÿ�.
 * ��) �迭 a�� ��Ұ� {1, 2, 3, 4, 5, 6, 7}�̰� �迭 b�� ��Ұ�{5, 4, 3, 2, 1} �� ��,
 * �迭 a{5, 4, 3, 2, 1, 6, 7}�� �ǰ� �迭 b�� {1, 2, 3, 4, 5}�� �˴ϴ�.
 * 
 *  <���� ��>
 *  �迭 a�� ��� �� : 7
 *  a[0] : 1
 *  a[1] : 2
 *  a[2] : 3
 *  a[3] : 4
 *  a[4] : 5
 *  a[5] : 6
 *  a[6] : 7
 *  �迭 b�� ��� �� : 5
 *  b[0] : 5
 *  b[1] : 4
 *  b[2] : 3
 *  b[3] : 2
 *  b[4] : 1
 *  �迭 a�� b�� ��ü ��Ҹ� ��ȯ
 *  a[0] : 5
 *  a[1] : 4
 *  a[2] : 3
 *  a[3] : 2
 *  a[4] : 1
 *  a[5] : 6
 *  a[6] : 7
 *  b[0] : 1
 *  b[1] : 2
 *  b[2] : 3
 *  b[3] : 4
 *  b[4] : 5
 */