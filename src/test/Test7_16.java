package test;
import java.util.Scanner;
public class Test7_16 {
	static int minOf1(int [] a) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if (min>a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	static int minOf2(int [] a) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if (min>a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���� : ");
		int num = sc.nextInt();
		int [] x = new int [num];
		int [] y = new int [num];
		
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"�� ���� : ");
			x[i] = sc.nextInt();
			System.out.print((i+1)+"�� ü�� : ");
			y[i] = sc.nextInt();
		}
		
		System.out.println("���� Ű�� ���� ��� ���� : " + minOf1(x));
		System.out.println("���� ���� ����� ü�� : " + minOf2(y));
		
	}

}
/*�迭 a�� ��� �߿��� �ּҰ��� ���ϴ� minOf �޼��带 �ۼ��Ͻÿ�.
(�Ű������� �迭�� ����ؼ� Ǯ���� ������)
���� Ű�� ���� ����� ����� ���� ���� ����� ü���� ���Ͻÿ�.

����Ÿ�� minOf(�Ű�����){

}

<���� ��>
��� ���� : 4
4���� ����� ü���� �Է�
1�� ���� : 175
1�� ü�� : 72
2�� ���� : 163
2�� ü�� : 82
3�� ���� : 150
3�� ü�� : 49
4�� ���� : 181
4�� ü�� : 76
���� Ű�� ���� ��� ���� : 150
���� ���� ����� ü�� : 49
*/