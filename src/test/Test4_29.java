package test;
import java.util.Scanner;
public class Test4_29 {
//5���� ������ ������ �׷��� ��ü �հ�(�׷캰 �հ� �ƴ� ��ü �׷��� ��)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//��ü 10���� �׷��� ������ �� �������� Ű����� �Է��Ѵ�. �� ��, 99999�� �Է��ϸ� ��ü �Է� �����ϰ� 
//88888�� �Է��ϸ� ���� �а� �ִ� �׷��� �Է��� �����Ͻÿ�.
	public static void main(String[] args) {
		
/*		System.out.println("������ ���մϴ�.");
		int a = 0;
		int b = 0;
		int i = 0;
		int j = 0;
		for(i=1; i<=10; i++) {
			System.out.println(i+" �׷�");
			 
			for(j=1; j<=5; j++) {
				Scanner stdIn = new Scanner(System.in);
				System.out.print("����: ");
				a = stdIn.nextInt();
				if (a == 88888) {
					break;
				}
				if (a == 99999) {
					i = 0;
					break;
				}
				
				b = b + a;
			}
			if (i==0) {
				break;
			}
			
		}
		System.out.println("");
		System.out.println("�հ�� "+b+"�Դϴ�.");
		
	}
*/
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ ���մϴ�.");
		int total = 0;
		
	Outer:
		for(int i=1; i<=10; i++) {
			System.out.println(i + " �׷�");
			
			for(int j=0;j<5;j++) {
				System.out.print("����: ");
				int t = stdIn.nextInt();
				if (t == 99999) 
					break Outer;
				else if (t == 88888) 
					continue Outer;
					//break;
				total += t;
					
				
			}
		}
		System.out.println("sum: "+total);
	}
}
	
	
	

