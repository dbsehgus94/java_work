package test;
import java.util.Scanner;
import java.util.Random;
public class Test6_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int select = 1;
		String a[] = {"1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��"};
		String b[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		int rd = rand.nextInt(12);
		int rd1 = rand.nextInt(12);
		
		while(select == 1) {
			System.out.println("ù���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.");
			System.out.print(a[rd]+": ");
			String month = stdIn.next();
			
			String temp = a[rd];
			a[rd] = month;
			
			
			if (a[rd].equals(b[rd])) {
				System.out.println("�����Դϴ�. �ٽ� �ѹ�?(yes:1, no:0)" );
				select = stdIn.nextInt();
				if(select==1) {
					a[rd] = a[rd1];
					continue;
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
