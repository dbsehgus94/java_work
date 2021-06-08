package test;
import java.util.Scanner;
import java.util.Random;
public class Test6_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("¿ä¼Ò ¼ö: ");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for (int i=0;i<a.length;i++) {
			a[i] = 1 + rand.nextInt(10);
			//a[i] = (int) (1 + Math.random()*10);
			
			for(int j=0; j<i;j++) {
				if (a[i] == a[j]) {
					i--;
				}
			}
			
		}
		for (int i=0;i<n;i++) {
			System.out.println("a["+i+"] = "+ a[i]);
		}
		
		stdIn.close();
	}

}
