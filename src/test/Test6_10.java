package test;
import java.util.Scanner;
import java.util.Random;
public class Test6_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("¿ä¼Ò ¼ö: ");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for (int i=0;i<a.length;i++) {
			//a[i]= (int) (Math.random()*10+1);
			a[i] = 1 + rand.nextInt(10);
			
		}
		
		for (int i=0;i<n;i++) {
			System.out.println("a["+i+"] = "+ a[i]);

		}
		
		stdIn.close();
	}

}
