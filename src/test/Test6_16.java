package test;
import java.util.Scanner;
import java.util.Random;
public class Test6_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int select = 1;
		String a[] = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		String b[] = {"monday","tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		
		int rd = rand.nextInt(7);
		
		while(select == 1) {
			System.out.println("�ش� ������ ���� �ܾ �Է��Ͻÿ�.");
			System.out.println("�ҹ��ڷ� �Է��ϼ���.");
			System.out.print(a[rd]+": ");
			String day = stdIn.next();
			
			String temp = a[rd];
			a[rd] = day;
			
			if (a[rd].equals(b[rd])) {
				System.out.print("�����Դϴ�. �ٽ� �ѹ�?(yes:1, no:0) ");
				select = stdIn.nextInt();
				if(select==1) {
					int rd1 = rand.nextInt(7);
					a[rd] = a[rd1];
					b[rd] = b[rd1];
					
				}
			}
			
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				a[rd] = temp;
				continue;
			}
			
		}
		
	}

}