package test;
import java.util.Scanner;
public class Test4_1_Do {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		do {
			System.out.print("������ �Է�: ");
			int n = stdIn.nextInt();
			
			if (n > 0)
				System.out.println("���");
			
			else if (n < 0)
				System.out.println("����");
			
			else
				System.out.println("0 �Դϴ�.");
			
			System.out.print("retry?(Yes:1 / No:0) ");
			retry = stdIn.nextInt();
		} while (retry == 1);
		

	}

}
