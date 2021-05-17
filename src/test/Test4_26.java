package test;
import java.util.Scanner;
public class Test4_26 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int i = 0;
		
		System.out.print("몇개의 정수를 더할까요? : ");
		a = stdIn.nextInt();
		for(i=1;i<=a;i++) {
			System.out.print("정수 입력(종료:0) : ");
			b = stdIn.nextInt();
			c = c + b;
			if(b==0) {
				a = a-1;
				break;
			}
		}
		
		System.out.println("합계 : "+ c);
		System.out.println("평균 : "+ (c/a));
		stdIn.close();
			
	}

}
