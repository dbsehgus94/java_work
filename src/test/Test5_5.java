package test;
import java.util.Scanner;
public class Test5_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ 1: ");
		int a = stdIn.nextInt();
		System.out.print("������ 2: ");
		int b = stdIn.nextInt();
		System.out.print("������ 3: ");
		int c = stdIn.nextInt();
		
		int sum = a+b+c;
		double avg = (double)(a+b+c)/3;
		
		System.out.println("3���� �������� �հ�: "+sum);
		System.out.println("3���� �������� ���: "+avg);
		
		stdIn.close();
	}

}
