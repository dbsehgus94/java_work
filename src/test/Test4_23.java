package test;
import java.util.Scanner;
public class Test4_23 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("´Ü¼ö: ");
		int a = stdIn.nextInt();
		
		for(int i=0;i<a;i++) {
			
			for(int j=1;j<a-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
									
			}
			
			System.out.println();
			
			}
		
		
		stdIn.close();	
		}
	

	}


