package test;
import java.util.Scanner;
public class Test7_22 {
	static int[] cloneArray(int[] a, int num1) {
		int [] b = new int[num1];
		for(int i=0; i<num1;i++) {
			b[i] = a[i];
		}
		return b;
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
		System.out.println("�迭 a�� �����ؼ� �迭 b�� ����");
		
		for(int i=0; i<num1;i++) {
			
			System.out.println("b["+i+"] : "+cloneArray(a, num1)[i]);
			
		}
		
	}

}
/* �迭 a�� ���� �迭(��� ���� ���� ��� ����� ���� ���� �迭)�� �����ؼ� ��ȯ�ϴ� cloneArray �޼��带 �ۼ��Ͻÿ�.
 * ��) �迭 a�� ��Ұ� {1, 2, 3, 4, 5} => �迭 b�� ��Ұ� {1, 2, 3, 4, 5}
 * �迭 a�� ��� �� : 5
 * a[0] : 11
 * a[1] : 22
 * a[2] : 33
 * a[3] : 44
 * a[4] : 55
 * �迭 a�� �����ؼ� �迭 b�� ����
 * b[0] : 11
 * b[1] : 22
 * b[2] : 33
 * b[3] : 44
 * b[4] : 55
 * 
 */
