package test;
import java.util.Scanner;
public class Test4_26 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int i = 0;
		
		System.out.print("��� ������ ���ұ��? : ");
		a = stdIn.nextInt();
		for(i=1;i<=a;i++) {
			System.out.print("���� �Է�(����:0) : ");
			b = stdIn.nextInt();
			c = c + b;
			if(b==0) {
				a = a-1;
				break;
			}
		}
		
		System.out.println("�հ� : "+ c);
		System.out.println("��� : "+ (c/a));
		stdIn.close();
			
	}

}
