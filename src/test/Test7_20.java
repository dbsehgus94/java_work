package test;
import java.util.Scanner;
public class Test7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : ");
		int x = sc.nextInt();//�迭�� ������ ���������� �Է�
		int [] a = new int[x];//�迭 a�� �Է¹��� x ������ ����
		for(int i=0;i<a.length;i++) {//�ռ� ������ �迭�� ������ ���� �Է�
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt();//�迭 �ε��� �� �Է�
		}
		System.out.print("������ ����� �ε��� : ");
		int insidx = sc.nextInt();//�迭�� ������ �ε��� ��ȣ
		System.out.print("������ ����� �ε��� �� : ");
		int insvalue = sc.nextInt();//�迭�� ������ �ε��� ��
		
		if(insidx>=0 && insidx<a.length-1) { //���� ���Ե� �ε������� ������ �ε��� ������
			for(int i=a.length-1;i>insidx;i--) {
				a[i] = a[i-1];
			}
			a[insidx] = insvalue; //�迭�� �ϳ��� �з����Ƿ� �� �ε��� ���� �����´�
		}
		for(int i=0;i<a.length;i++) {
		System.out.println("a["+i+"] : "+a[i]);
			
			
		}
	}

}
/*
 * �迭 a�� ��� a[idx]�� x�� �����ϴ� insertArray() �޼��带 �ۼ��Ͻÿ�.
 * ���� �ÿ��� a[idx]~a.[a.length-2]�� �ϳ��� �ڷ� �̵����Ѿ� �Ѵ�.
 * 
 * ��) �迭 a�� ��Ұ� {1, 3, 4, 7, 9, 11} �� ��,
 * �ε��� 2�� 99���� �Է��ϸ� {1, 3, 99, 4, 7, 9}
 */

