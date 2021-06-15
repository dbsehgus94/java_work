package test;
import java.util.Scanner;
import java.util.Random;


public class Test6_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("요소 수: ");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+ i +"] = ");
			a[i] = stdIn.nextInt();
		}	
			
		System.out.println("요소를 섞었음");
		
		for(int j=0; j<2*n; j++) {
			int rd = rand.nextInt(n);
			int temp = a[0];
			a[0] = a[rd];
			a[rd] = temp;
		}
		
		for(int i=0;i<a.length;i++) {
		System.out.println("a["+i+"] = "+a[i]);
		}
		
		System.out.print("{");
		for(int k=0;k<a.length;k++) {
			if (k==a.length-1) {
				System.out.print(a[k]);
				System.out.print("}");
			}
			else
			System.out.print(a[k]+", ");
			
		}
		
		
		
	}

}
