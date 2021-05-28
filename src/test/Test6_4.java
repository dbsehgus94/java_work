package test;
import java.util.Scanner;
import java.util.Random;
public class Test6_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("¿ä¼Ò¼ö: ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i=0;i<n;i++) {
			a[i] = rand.nextInt(10)+1;
			
		}
		
			
			
		System.out.println("----------");
		for (int i=0;i<a.length;i++)
			System.out.print(i+" ");

	}

}
