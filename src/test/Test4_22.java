package test;
import java.util.Scanner;
public class Test4_22 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("´Ü¼ö: ");
		int a = stdIn.nextInt();
			
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				if(j==i) {
					System.out.println();
				}
			}
		}
		
		for(int i=a;i<=a;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				if (j==i) {
					System.out.println();
				}
			}
		}
		stdIn.close();
	}

}
