package test;
import java.util.Scanner;
public class Test4_27 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;
		int i = 0;
		
		System.out.print("��� ������ ���ұ��? : ");
		a = stdIn.nextInt();
		for(i=1;i<=a;i++) {
			System.out.print("���� �Է�(����:0) : ");
			b = stdIn.nextInt();
			sum = sum + b;
			if(b==0) {
				
				break;
			}
			
			if(sum>=1000) {
				sum = sum - b;
				System.out.println("�հ谡 1000�� �Ѿ����ϴ�.");
				System.out.println("���������� �����մϴ�.");
				
				break;
			}
		}
		
		System.out.println("�հ� : "+ sum);
		System.out.println("��� : "+ (sum/a));
		
		stdIn.close();
	}

}
