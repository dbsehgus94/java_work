package test;
import java.util.Scanner;
import java.util.Arrays;
public class Test7_24 {
	static int[] searchArrayIdx(int a[], int searchvalue) { //�˻��� ���� ��ȯ�ϴ� �޼��� ����
		int count=0; //���� ����
		int [] c = new int[a.length]; //�迭 ����
		for(int i=0; i<a.length; i++) { //�˻��� ���� �迭 ������ �� �ٸ� �迭�� �����ϱ� ���� �ݺ��� 
			if(a[i]==searchvalue) { //a �迭�� ���� �˻����� ���ٸ�
				c[count] = i;//c �迭�� �迭 ������ i���� �Է�
				count++; // �Է� �� count+1
			}
		}
		if(count == 0) { //��ġ�ϴ� ��Ұ� ���ٸ� ���
			System.out.println("��ġ�ϴ� ��Ұ� ����");
		}
		int [] b = new int[count]; //�˻��� ���� ���� ���ο� �迭 b����
		for(int i = 0; i<b.length; i++) { //b �迭�� ���� �Է��ϱ� ���� �ݺ���
			b[i] = c[i]; //�ռ� c �迭�� �Է��� ���� b �迭�� �Ű��ش�.
		}
		return b; //b �迭�� ��ȯ
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : "); 
		int x = sc.nextInt(); //��� �� �Է�
		int [] a = new int [x]; // �迭 a ����
		for(int i=0;i<a.length;i++) {//�迭 a�� ��Ұ��� �Է��ϱ� ���� �ݺ���
			System.out.print("a["+i+"] : ");
			a[i] = sc.nextInt(); //�迭 a�� ��Ұ� �Է�
		}
		System.out.println("�迭 a "+Arrays.toString(a));//�迭 a ���
		System.out.print("�˻� �� : ");
		int searchvalue = sc.nextInt(); //�˻� �� �Է�
		System.out.println("��ȯ�Ǵ� �迭�� "+Arrays.toString(searchArrayIdx(a, searchvalue))); //�˻��� ���� ��ȯ�ϴ� �޼��� ���
		
	}

}
/*
 * �迭 a�� ��� �߿��� ���� x�� ��� ����� �ε����� �տ������� �������
 * �����ؼ� ��ȯ�ϴ� searchArrayldx �޼��带 �ۼ��Ͻÿ�.
 * 
 * ��) �迭 a�� ��Ұ� {1, 5, 4, 8, 5, 5, 7}�̰� ���� 5�� ����� �ε����� �����ϸ�,
 * ��ȯ�Ǵ� �迭�� {1, 4, 5}
 */