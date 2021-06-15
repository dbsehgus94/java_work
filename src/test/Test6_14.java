package test;
import java.util.Scanner;

public class Test6_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int n = stdIn.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("역순으로 복사");
		
		if (n % 2 == 0) {
			for(int i=0; i<n/2+1; i++) {
				int temp = a[i];
				int temp1 = a[n-i-1];
				b[i] = temp1;
				b[n-i-1] = temp;
			}
		}
		else {
			for(int i=0; i<n/2+1; i++) {
				
				if (i!=n/2+1) {
					int temp = a[i];
					int temp1 = a[n-i-1];
					b[i] = temp1;
					b[n-i-1] = temp;
				}
				else {
					b[i] = a[i];
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println("b["+i+"] = "+b[i]);
		}
	}

}
