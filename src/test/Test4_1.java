package test;
import java.util.Scanner;

public class Test4_1 {

	public static void main(String[] args) {
		
		
	while(true) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		int num1 = stdln.nextInt();
	
		if (num1>0) {
			System.out.println("�� ���� ����Դϴ�.");
			
			System.out.println("�ٽ� �ѹ� �Է��Ͻðڽ��ϱ�? Yes:1, No:1�� ������ ����");
			int retry = stdln.nextInt();
			if (retry == 1) {
				
				continue;
			}
			
			else 
				break;
		}
		
		else if (num1<0) {
			System.out.println("�� ���� �����Դϴ�.");
			
			System.out.println("�ٽ� �ѹ� �Է��Ͻðڽ��ϱ�? Yes:1, No:1�� ������ ����");
			int retry = stdln.nextInt();
			if (retry == 1) {
				continue;
			}
		
			else 
				break;
		
		

	}

}
}
} // do - while���� �ۼ�