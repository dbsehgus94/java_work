package test;
import java.util.Scanner;
public class Test6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��� ��: ");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = stdIn.nextInt();
			//System.out.println("a["+i+"]="+a[i]);
		}
		
		System.out.print("ã�� ����: ");
		int find = stdIn.nextInt();
		
		for (int i=0;i<n;i++) {
			if (find == a[i]) {
				System.out.println("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
				i = n;
				//break;
			}
		}
		
		/*
		for (int i=n-1;i>=0;i--) {
			if (find == a[i]) {
				System.out.println("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
				break;
			}
		}
		*/
		
		boolean loop = false;
		int i = 0;
		/*
		while(!loop) {
			
			if (find == a[i]) {
				System.out.println("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
				loop = true;
			}
			i++;
		}
		
		boolean loop1 = true;
		while(loop1) {
			
			if (find == a[i]) {
				System.out.println("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
				loop1 = false;
			}
			i++;
		}
		*/
		stdIn.close();
	}

}
