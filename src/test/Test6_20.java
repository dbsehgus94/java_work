//�࿡ ���� ���� ������ �ٸ� 2���� �迭�� �����Ͻÿ�.
//(���, ����, �� ����� ���� Ű����� �Է� ����)
package test;
import java.util.Scanner;
public class Test6_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<���>");
		System.out.println("�ұ�Ģ�� 2���� ��"
				+ "���� ����");
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		int [][] c = new int[row][];
		
		for (int i=0;i<c.length;i++) {
			System.out.print(i+"���� �� �� : ");
			int column = sc.nextInt();
			c[i] = new int[column];
		
			System.out.println("�� ����� ���� �Է��մϴ�.");
			for (column=0; column < c[i].length; column++) {
				System.out.print("c["+i+"]["+column+"] : ");
				c[i][column] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("�迭 c�� �� ��� ���� ���");
		for(int i=0; i<c.length; i++) {
			int[] c1 = c[i];
			for(int j=0;j<c1.length;j++) {
				System.out.print(c1[j]+" ");
			}
			System.out.println();
		}
	}

}
