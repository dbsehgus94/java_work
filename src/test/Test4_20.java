package test;
import java.util.Scanner;
public class Test4_20 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int retry = 0;
		do {
			System.out.print("��(��)�� �Է��ϼ���: ");
			a = stdIn.nextInt();
			
			if (a>=3 && a<=5) {
				System.out.println("�� �Դϴ�.");
			}
			
			else if (a>=6 && a<=8) {
				System.out.println("���� �Դϴ�.");
			}
			
			else if (a>=9 && a<=11) {
				System.out.println("���� �Դϴ�.");
			}
			
			else if (a==12 || a==1 || a==2) {
				System.out.println("�ܿ� �Դϴ�.");
			}
			
			if(a>=1 && a<=12) {
			System.out.print("�ٽ� �Ͻðڽ��ϱ�?(yes: 1, no: 0) ");
			retry = stdIn.nextInt();
			}
			
		} while (a<=0 || a>=13 || retry == 1);
		
		stdIn.close();
	}
	
}
