package test;
import java.util.Scanner;
public class Test4_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수값: ");
		int a = stdIn.nextInt();
		
		for(int i=1;i<=a;i++) {
			System.out.println(i+"의 제곱은 "+(i*i)+"입니다.");
		}

	}

}
