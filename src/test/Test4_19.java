package test;
import java.util.Scanner;
public class Test4_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������: ");
		int a = stdIn.nextInt();
		
		for(int i=1;i<=a;i++) {
			System.out.println(i+"�� ������ "+(i*i)+"�Դϴ�.");
		}

	}

}
