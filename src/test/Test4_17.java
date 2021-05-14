package test;
import java.util.Scanner;
public class Test4_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *을 표시할까요?: ");
		int a = stdIn.nextInt();
		
		for (int i=1; i<=a; i++) {
			System.out.print("*");
			if (i % 5==0) {
				System.out.println();
			}
			
		}
		stdIn.close();
	}

}
