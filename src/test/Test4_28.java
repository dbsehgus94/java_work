package test;
import java.util.Scanner;
public class Test4_28 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;
		int i = 0;
		int c = 0;
		System.out.print("��� ���ұ��? : ");
		a = stdIn.nextInt();
		
		for(i=1;i<=a;i++) {
			System.out.print("���� �Է�: ");
			b = stdIn.nextInt();
			if (b < 0) {
				System.out.println("������ ������ �ʽ��ϴ�.");
				c += 1;
				continue;
			}
			sum += b;
		}
		
		System.out.println("�հ谡 "+sum);
		if (c>=1) {
			System.out.println("����� "+(sum/(a-c)));
		}
		else
			System.out.println("����� "+(sum/a));
		
	}

}
