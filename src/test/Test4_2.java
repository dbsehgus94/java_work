package test;
import java.util.Scanner;
public class Test4_2 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("���ڸ� ������ �Է�: ");
			num = stdln.nextInt();
		
		}while(num < 100 || num > 999); 
			
		System.out.println("�Է��� 3�ڸ� ���� ������: " + num);
		
	}

}
