package test;
import java.util.Scanner;
public class Test4_25 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수값: ");
		int a = stdIn.nextInt();
		boolean b = false;
		for(int i=2; i<a; i++) {
			if(a % i == 0) {
				b = true;
				break;
			}
		}
		
		if (b) {
			System.out.println("소수가 아닙니다.");
		}
		else if(a<=1) {
			System.out.println("");
		}
		else {
			System.out.println("소수입니다.");
		}
		
	}

}
