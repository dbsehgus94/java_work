package test;
import java.util.Scanner;
public class Test4_21 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�ܼ�: ");
		int a = stdIn.nextInt();
		
		
		// 3*3 ���簢�� ���
		for(int i=1;i<=a;i++) {
			//System.out.print("");
			for(int j=1;j<=a;j++) {
				System.out.print("* ");
				if(j==a) {
					System.out.println();
				}
			}
		}
		
		// 3*5 ���
		for(int i=1;i<=a+2;i++) {
			//System.out.print("");
			for(int j=1;j<=a;j++) {
				System.out.print("* ");
				if(j==a) {
					System.out.println();
				}
			}
		}
		stdIn.close();
			
			

	}

}
