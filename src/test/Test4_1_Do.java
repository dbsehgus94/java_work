package test;
import java.util.Scanner;
public class Test4_1_Do {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		do {
			System.out.print("정수값 입력: ");
			int n = stdIn.nextInt();
			
			if (n > 0)
				System.out.println("양수");
			
			else if (n < 0)
				System.out.println("음수");
			
			else
				System.out.println("0 입니다.");
			
			System.out.print("retry?(Yes:1 / No:0) ");
			retry = stdIn.nextInt();
		} while (retry == 1);
		

	}

}
