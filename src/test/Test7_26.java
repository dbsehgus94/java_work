package test;
import java.util.Scanner;
import java.util.Arrays;
public class Test7_26 {
	static int[] insertArray(int[] a, int insidx, int insvalue) { //�޼��� ����
		if(insidx<0 || insidx>a.length) { //insidx ���� ���ٸ�
			return a.clone(); //a�迭�� �����ؼ� ��ȯ�Ѵ�.
		}
		else {
			int b[] = new int[a.length+1]; //�迭 ��Ұ� ������ ���� a�迭���� ũ�Ⱑ +1�� b �迭 ����
			int i = 0; //�ݺ��� �ʱⰪ ����
			for (; i < insidx; i++) { //��Ұ� ���� �� �ݺ���
				b[i]=a[i]; //a�迭 ���� �״�� b�迭�� �����Ѵ�.
			}
			for(; i<a.length;i++) { //��Ұ� ���� �� �� �迭�� ���� �ݺ���
				b[i+1] = a[i]; //������ �ϳ��� �ڷ� �и��� ������ b�迭���� a�迭 �������� +1�� �迭�� ���� �����Ѵ�.
			}
			b[insidx]=insvalue;// �Է��� �迭 ��ġ�� ��Ұ��� ��������.
			
			return b; //b�迭�� ��ȯ�Ѵ�.
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : ");
		int x = sc.nextInt(); //��� �� �Է�
		int [] a = new int[x]; //�迭 a ����
		for(int i=0;i<a.length;i++) { //�ݺ����� ����Ͽ� a�迭�� ��Ұ� �Է�
			System.out.print("a["+i+"] : ");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a)); //a �迭 ���
		System.out.print("������ �迭 : "); 
		int insidx = sc.nextInt(); //������ �迭 ��ȣ �Է�
		System.out.print("������ �� : "); 
		int insvalue = sc.nextInt(); //������ ��� �� �Է�
		System.out.println(Arrays.toString(insertArray(a, insidx, insvalue))); //�޼��� insertArray ���
	}

}
/*
 * �迭 a�� ��� a[idx]�� x�� �����ؼ� �迭�� ��ȯ�ϴ� insertArrayOf()�� �ۼ��Ͻÿ�.
 * ������ ���� a[idx] �ڿ� �ִ� ��� ��Ҹ� �ϳ��� �ڷ� �̵��Ͻÿ�.
 * 
 * ��) �迭 a�� ��Ұ� {1, 3, 4, 7, 9, 11} �� ��, 2��° �ε����� 99�� ������ ���,
 * ��ȯ�� �迭�� ��Ҵ� {1, 3, 99, 4, 7, 9, 11}�� �˴ϴ�. 
 * 
 */