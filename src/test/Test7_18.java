package test;
import java.util.Scanner;
public class Test7_18 {
	static void aryRmv(int [] a, int delidx) {
		for(int i=0;i<a.length;i++) {
			if(i>=delidx && i<a.length-1) { //���� ������ �ε������� ������ �ε��� ������
				a[i] = a[i+1]; //���� �ε��� ���� �����´�
			}
			else if(i==a.length-1) { //������ �ε����϶�
				
				a[a.length-1]=a[a.length-2]; //������ �ε����� �� ���� �ε��� ���� ���� ���ڷ� ����ϰ� �Ѵ�.
				
			}
			System.out.println("a["+i+"] : "+a[i]);
			
			
		}
	}
	
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
		int delidx = sc.nextInt();//������ �ε��� ��
		aryRmv(a, delidx);//�޼��� ����
		
	}

}
/*	
static int[] aryRmv(int [] a, int delidx) {
	int [] num = null;
	for(int i=0;i<a.length;i++) {
		if(i>=delidx && i<a.length-1) {
			a[i] = a[i+1];
		}
		else if(i==a.length-1) {
			
			a[a.length-1]=a[a.length-2];
			
		}
		num = new int[a[i]];
		
		
	}
	return num;
	
}
*/
/*
 * �迭 a�κ��� ��� a[idx]�� �����ϴ� aryRmv �޼��带 �ۼ��Ͻÿ�.
 * a[idx]�� ���� ��, �� �ڿ� �ִ� ��ҵ��� ������ �ϳ��� �̵��Ͻÿ�.
 * �̵� �Ŀ� ��� �Ǵ� ������ ��� a[a.length-1]�� ���� �̵��ϱ� ���� ������ ���� �����Ͻÿ�.
 * 
 * ��) �迭 a�� ��Ұ� {1, 3, 4, 7, 9, 11} �� ��,
 * 3���� �����ϸ� {1, 3, 7, 9, 11, 11}
 * 2���� �����ϸ� {1, 4, 7, 9, 11, 11}
 * 
 * 
 */