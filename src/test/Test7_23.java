package test;

import java.util.Scanner;
import java.util.Arrays;

public class Test7_23 {
	static int[] removeArray(int[] a, int del) { //�޼��� ����
		int[] b = new int[a.length - 1]; //a�迭���� ���̰� 1 ���� b�迭 ����
		for (int i = 0; i < a.length - 1; i++) { //for�� �ۼ�
			if (i >= del && i < a.length - 1) { //�ε����� �����Ǵ� �κк��� ������ �迭����
				a[i] = a[i + 1];
			}
			b[i] = a[i]; // ���� ���� �迭�� a �迭�� ���� �ű��.
		}
		return b; // b �迭 ��ȯ
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : "); // ��� �� �Է�
		int x = sc.nextInt();
		int[] a = new int[x]; // �迭 ����
		for (int i = 0; i < a.length; i++) { // a �迭 ���� ����
			System.out.print("a[" + i + "] : "); //a �迭 �ε��� �� �Է�
			a[i] = sc.nextInt(); //a �迭 �ε��� �� �Է�
		}
		System.out.println(Arrays.toString(a)); //a �迭 ���
		System.out.print("������ �迭 : "); //������ �迭 �Է�
		int del = sc.nextInt();
		System.out.println(Arrays.toString(removeArray(a, del))); //remove �޼��带 ������ b �迭 ���
	}

}
/*
 * �迭 a���� ���[idx]�� ������ �迭�� ��ȯ�ϴ� removeArray�� �ۼ��Ͻÿ�. ������ a[idx]���� �ڿ� �ִ� ��� ��Ҹ�
 * �ϳ��� ������ �̵��Ͻÿ�. 
 * ��) �迭 a�� ��Ұ� {1, 3, 4, 7, 9, 11} �� �� �ε��� 2�� �����Ѵٸ�, ��ȯ�Ǵ� �迭��
 * ��Ҵ� {1, 3, 7, 9, 11} �Դϴ�.
 * 
 * 
 */
